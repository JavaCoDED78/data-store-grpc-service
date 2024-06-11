package com.javaded.web.mapper;

public interface Mappable<E, D> {

    D toDto(E e);

}
