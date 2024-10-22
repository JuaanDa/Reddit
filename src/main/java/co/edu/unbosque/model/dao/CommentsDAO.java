package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.entities.Comments;
import co.edu.unbosque.model.entities.Posts;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;


@Stateless

public class CommentsDAO implements DAO<Comments,Integer> {
    @PersistenceContext(unitName = "Reddit")
    private EntityManager em;


    @Override
    public Comments save(Comments entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public Comments findById(Integer id) {
        return  em.find(Comments.class, id);
    }

    @Override
    public List<Comments> findAll() {
        return em.createNamedQuery("Comments.findAll", Comments.class).getResultList();
    }
    }

