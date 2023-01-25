package com.example.BiletOtomasyonu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;
@Getter
@AllArgsConstructor
public enum TicketStatus {

    PAID(1),
    CANCEL(2),
    POSTPONED(3);

    private Integer value;

    public static TicketStatus getByValue(Integer value) {
        if (Objects.isNull(value)) {
            return null;
        }
        return Stream.of(TicketStatus.values())
                .filter(ticketStatus -> ticketStatus.getValue().equals(value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
