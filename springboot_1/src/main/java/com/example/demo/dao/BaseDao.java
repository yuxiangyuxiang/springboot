package com.example.demo.dao;

import java.util.List;

public interface BaseDao<T> {
	int additem(T t);

	int updateitem(T t);

	int delitem(Object id);

	T getmodel(Object id);

	List<T> getlist();

	List<T> getlistbyparam(T t);
}
