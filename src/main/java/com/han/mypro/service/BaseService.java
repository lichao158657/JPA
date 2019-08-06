package com.han.mypro.service;


import com.han.mypro.entity.Student;

import java.util.Optional;

public interface BaseService<T> {

    Optional<T> findById(Long id);

    void save(T obj);

    void deleteById(Long id);

//    void upDate();
}
