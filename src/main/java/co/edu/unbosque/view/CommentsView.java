package co.edu.unbosque.view;

import co.edu.unbosque.model.CommentsDTO;
import co.edu.unbosque.services.CommentsService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("commentsView")
@RequestScoped
public class CommentsView implements Serializable {
    private ArrayList<CommentsDTO> comments;
    private CommentsDTO newComment;
    private int selectedPostId;

    @Inject
    private CommentsService commentsService;

    @PostConstruct
    public void init() {
        comments = new ArrayList<>();
        newComment = new CommentsDTO();
        comments = (ArrayList<CommentsDTO>) commentsService.getComments();

    }

    public void addComment() {
        newComment.setPostId(selectedPostId);
        commentsService.saveComments(newComment);
        newComment = new CommentsDTO();
    }

    public List<CommentsDTO> getComments() {
        return comments;
    }

    public void setSelectedPostId(int selectedPostId) {
        this.selectedPostId = selectedPostId;
    }

    public CommentsDTO getNewComment() {
        return newComment;
    }

    public void setNewComment(CommentsDTO newComment) {
        this.newComment = newComment;
    }

    public void updateComment() {
        newComment = getNewComment();
        commentsService.updateLikes(newComment.getId(), newComment.getLikes());
    }
    public void getCommentsByPostid(){
        commentsService.getCommentsByPostId(selectedPostId);
    }
}
