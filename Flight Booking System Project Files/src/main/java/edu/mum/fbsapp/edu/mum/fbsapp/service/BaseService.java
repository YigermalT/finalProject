package edu.mum.fbsapp.edu.mum.fbsapp.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T save(T t);
    T findOne(Long id);
    void delete(Long id);

}
