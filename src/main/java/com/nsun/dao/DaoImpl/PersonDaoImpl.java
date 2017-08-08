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

    //获取session
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * 根据id查找
     * @param i
     * @return
     */
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

    /**
     * 保存
     * @param person
     */
    public void save(Person person){
        getCurrentSession().save(person);
    }

    public void saveOrUpdate(Person entity) {
    getCurrentSession().merge(entity);
    }

    /**
     * 删除
     * @param person
     */
    public void delete(Person person) {
         getCurrentSession().delete(person);
         getCurrentSession().flush();
    }

}
