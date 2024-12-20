package co.edu.unbosque.model.dao;

import java.util.List;

public interface DAO<T,K>{
    void save(T entity);

    T findById(K id);

    List<T> findAll();

    void update(T entity);

    List<T> getCommentsByPostId(int id );
}
