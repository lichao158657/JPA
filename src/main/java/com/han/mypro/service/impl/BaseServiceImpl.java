package com.han.mypro.service.impl;

import com.han.mypro.dao.BaseDao;
import com.han.mypro.entity.Student;
import com.han.mypro.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseDao baseDao;

    @Override
    public void save(T obj) {
        baseDao.save(obj);
    }

    @Override
    public Optional<T> findById(Long id) {
        return baseDao.findById(id);
    }
    @Override
    public void deleteById(Long id) {
        baseDao.deleteById(id);
    }
}
