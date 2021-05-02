package ru.neighbors.neighbors.services;

import java.util.List;

public interface ICrudService<T> {

    T create(T dto);

    T update(T dto);

    T findById(Long id);

    void deleteById(Long id);

    List<T> findAll();

}