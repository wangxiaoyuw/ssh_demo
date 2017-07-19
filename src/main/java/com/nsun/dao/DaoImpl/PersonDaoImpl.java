package com.nsun.dao.DaoImpl;

import com.nsun.dao.PersonDao;
import com.nsun.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

    public Person load(Integer id) {
        return (Person) getCurrentSession().load(Person.class,id);
    }

    public Person get(Integer id) {
        return (Person) getCurrentSession().load(Person.class,id);
    }

    /**返回list
     * Person 为实体类名
     * @return
     */
    public List<Person> findAll() {
        String hql = "from Person";
        return this.getCurrentSession().createQuery(hql).list();
    }

    public void persist(Person entity) {
        getCurrentSession().persist(entity);
    }

    public Integer save(Person person){

        return (Integer) getCurrentSession().merge(person);
    }

    public void saveOrUpdate(Person entity) {
    getCurrentSession().merge(entity);
    }

    public void delete(Integer id) {
         Person person = load(id);
         getCurrentSession().delete(person);
    }

    public void flush() {
        getCurrentSession().flush();
    }


}
