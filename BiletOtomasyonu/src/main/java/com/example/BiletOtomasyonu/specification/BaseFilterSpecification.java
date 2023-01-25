package com.example.BiletOtomasyonu.specification;

import org.springframework.data.jpa.domain.Specification;

public abstract class BaseFilterSpecification<Entity, Filter> {

    public abstract Specification<Entity> filter(Filter filter);

}
