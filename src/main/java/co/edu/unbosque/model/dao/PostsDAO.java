package co.edu.unbosque.model.dao;

import java.util.List;
import co.edu.unbosque.model.entities.Posts;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class PostsDAO implements DAO<Posts, Integer> {

    @PersistenceContext(unitName = "Reddit")
    private EntityManager em;

    @Override
    public Posts save(Posts entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public Posts findById(Integer id) {
        return  em.find(Posts.class, id);
    }

    @Override
    public List<Posts> findAll() {
        return em.createNamedQuery("Posts.findAll", Posts.class).getResultList();    }
}