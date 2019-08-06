package com.han.mypro.service.impl;

import com.han.mypro.dao.BaseDao;
import com.han.mypro.entity.Student;
import com.han.mypro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

    @Autowired
    private BaseDao baseDao;

    public void saveAll(List list){
       Optional optional = baseDao.findById(1);
       Optional op;
       op=optional.empty();
    }



}
