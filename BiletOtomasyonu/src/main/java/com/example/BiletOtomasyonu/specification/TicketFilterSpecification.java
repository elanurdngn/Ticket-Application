package com.example.BiletOtomasyonu.specification;

import com.example.BiletOtomasyonu.entity.Ticket;
import com.example.BiletOtomasyonu.enums.TicketStatus;
import com.example.BiletOtomasyonu.request.TicketFilterRequest;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class TicketFilterSpecification extends BaseFilterSpecification<Ticket, TicketFilterRequest> {


    @Override
    public Specification<Ticket> filter(TicketFilterRequest ticketFilterRequest) {

        return (Specification<Ticket>) (root, criteria, cb) -> {

            List<Predicate> predicates = new ArrayList<>();

            if (Objects.nonNull(ticketFilterRequest.getTicketStatusId())) {
                predicates.add(cb.equal(root.get("ticketStatus"), TicketStatus.getByValue(ticketFilterRequest.getTicketStatusId())));
            }

            if (Objects.nonNull(ticketFilterRequest.getDate())) {
                predicates.add(cb.equal(root.get("date"), ticketFilterRequest.getDate()));
            }

            if (Objects.nonNull(ticketFilterRequest.getRouteId())) {
                Join routeJoin = root.join("route");
                predicates.add(cb.equal(routeJoin.get("id"), ticketFilterRequest.getRouteId()));
            }

            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }
}
