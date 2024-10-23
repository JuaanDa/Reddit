package co.edu.unbosque.view;

import co.edu.unbosque.model.CommentsDTO;
import co.edu.unbosque.services.CommentsService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addCommentsView")
@RequestScoped
public class AddCommentsView implements Serializable {
    private CommentsDTO commentsDTO;
    @Inject
    private CommentsService commentsService;

    public AddCommentsView() {
        commentsDTO = new CommentsDTO();
    }

    public CommentsDTO getCommentsDTO() {
        return commentsDTO;
    }

    public void setCommentsDTO(CommentsDTO commentsDTO) {
        this.commentsDTO = commentsDTO;
    }

    public String newComment(){
        commentsService.saveComments(commentsDTO);
        return null;
    }

}
