package com.han.mypro.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.han.mypro.utils.DateDeserialize;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "T_STUDENT")
public class Student implements Serializable,Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "age")
    private Integer age;

    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserialize.class)
    @Column(name = "JOINDATE")
    private Date joinDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.age;
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
