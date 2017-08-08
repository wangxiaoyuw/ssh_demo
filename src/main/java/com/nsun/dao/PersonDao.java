package com.nsun.dao;

import com.nsun.entity.Person;

import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */
public interface PersonDao {

     Person findOneById(int i);

     List<Person> findAll();

    void save(Person person);

    void delete(Person person);
}
