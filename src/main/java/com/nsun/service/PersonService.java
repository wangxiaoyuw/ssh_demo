package com.nsun.service;

import com.nsun.dao.PersonDao;
import com.nsun.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */

public interface PersonService {

    public Person findOneById(int i);

    List<Person> findAll();
}
