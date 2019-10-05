package com.yt.jpa.dao;

import com.yt.jpa.entity.Person;

import java.util.List;

public interface Dao<T> {
   void add(T t);
   List<T> listT();
}
