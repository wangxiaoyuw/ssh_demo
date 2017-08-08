package com.nsun.service.PersonImpl;

import com.nsun.dao.PersonDao;
import com.nsun.entity.Person;
import com.nsun.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */
@Service
@Transactional
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

    public void delete(Person person) {
        personDao.delete(person);
    }
}
