package co.edu.unbosque.view;

import co.edu.unbosque.model.CommentsDTO;
import co.edu.unbosque.model.PostsDTO;
import co.edu.unbosque.services.CommentsService;
import co.edu.unbosque.services.PostsService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addCommentsView")
@RequestScoped
public class AddCommentsView implements Serializable {
    private CommentsDTO commentsDTO;
    private PostsDTO selectedPost;


    @Inject
    private CommentsService commentsService;
    private PostsService postsService;

    @PostConstruct
    public void init() {
        selectedPost = new PostsDTO();
    }
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

    public PostsDTO getSelectedPost() {
        int title = postsService.getPostIdByTitle("Domina JavaScript en 24 horas");
        return postsService.getPosts(title);
    }

    public void setSelectedPost(PostsDTO selectedPost) {
        this.selectedPost = selectedPost;
    }
}
