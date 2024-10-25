package co.edu.unbosque.services;

import co.edu.unbosque.model.CommentsDTO;

import java.util.List;

public interface CommentsServiceInterface {
    void saveComments(CommentsDTO comments);

    CommentsDTO getComments(int id);

    List<CommentsDTO> getComments();

    void updateLikes(int commentId, int likes);
}
