package com.nsun.service.PersonImpl;

import com.nsun.dao.PersonDao;
import com.nsun.entity.Person;
import com.nsun.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    public Person findOneById(int i) {
        return personDao.findOneById(i);
    }

    public List<Person> findAll() {
        return personDao.findAll();
    }

    public void save(Person person){
        personDao.save(person);
    }

    public void delete(Integer id) {
        personDao.delete(id);
    }
}
