package com.nsun.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangzy on 2017/7/19.
 */
public interface Domain <T,PK extends Serializable>{

    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}

