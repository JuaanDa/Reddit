package co.edu.unbosque.services;

import co.edu.unbosque.model.CommentsDTO;
import co.edu.unbosque.model.dao.DAO;
import co.edu.unbosque.model.entities.Comments;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

@Named
@RequestScoped
public class CommentsService implements CommentsServiceInterface {

    @Inject
    private DAO<Comments, Integer> daoComments;

    private final ModelMapper dataMapper;

    public CommentsService() {
        dataMapper = new ModelMapper();
        dataMapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(PRIVATE);

    }
    @Override
    public void saveComments(CommentsDTO commentsDTO) {
        Comments comments = dataMapper.map(commentsDTO, Comments.class);
        daoComments.save(comments);
        dataMapper.map(commentsDTO, Comments.class);
    }

    @Override
    public CommentsDTO getComments(int id) {
        Comments  comments = daoComments.findById(id);
        return dataMapper.map(comments, CommentsDTO.class);
    }

    @Override
    public List<CommentsDTO> getComments() {
        List<Comments> comments = daoComments.findAll();
        List<CommentsDTO> commentsDTOs = new ArrayList<>();
        for (Comments comment : comments) {
            commentsDTOs.add(dataMapper.map(comment, CommentsDTO.class));
        }
        return commentsDTOs;
    }

    @Override
    public void updateLikes(int commentId, int likes) {
        Comments comment = daoComments.findById(commentId);
        if (comment != null) {
            comment.setLikes(likes + 1);
            daoComments.update(comment);
        }
    }


    public void getCommentsByPostId(int commentId){
        Comments comment = daoComments.findById(commentId);
        dataMapper.map(comment, Comments.class);
        daoComments.getCommentsByPostId(commentId);


    }
}
