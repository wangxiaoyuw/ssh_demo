package com.nsun.dao;

import com.nsun.entity.Person;

import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */
public interface PersonDao extends Domain<Person,Integer>{

     Person findOneById(int i);

     List<Person> findAll();

    Integer save(Person person);

    void delete(Integer id);
}
