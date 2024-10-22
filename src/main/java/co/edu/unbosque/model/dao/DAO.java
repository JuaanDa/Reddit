package co.edu.unbosque.model.dao;

import java.util.List;

public interface DAO<T,K>{
    T save(T entity);
    T findById(K id);
    List<T> findAll();
}
