package com.nsun.dao.DaoImpl;

import com.nsun.dao.PersonDao;
import com.nsun.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */
@Repository
public class PersonDaoImpl implements PersonDao{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public Person findOneById(int i) {
        return (Person) getCurrentSession().get(Person.class,i);
    }

    /**返回list
     * Person 为实体类名
     * @return
     */
    public List<Person> findAll() {
        String hql = "from Person";
        return this.getCurrentSession().createQuery(hql).list();
    }


}
