package co.edu.unbosque.model.dao;

import java.util.List;
import co.edu.unbosque.model.entities.Comments;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



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

