package co.edu.unbosque.view;

import co.edu.unbosque.model.CommentsDTO;
import co.edu.unbosque.services.CommentsService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("commentView")
@RequestScoped
public class CommentView implements Serializable {

    @Inject
    private CommentsService commentsService;

    private CommentsDTO commentsDTO;
    public CommentView(){
        commentsDTO = new CommentsDTO();
    }
    public void addComment(int postId) {
        // Set the postId in newComment before saving
        commentsDTO.setPostId(postId);
        commentsService.saveComments(commentsDTO);
        commentsDTO = new CommentsDTO(); // Reset after saving
    }

    public CommentsDTO getCommentsDTO() {
        return commentsDTO;
    }

    public void setCommentsDTO(CommentsDTO commentsDTO) {
        this.commentsDTO = commentsDTO;
    }
}
