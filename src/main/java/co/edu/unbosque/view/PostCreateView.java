package co.edu.unbosque.view;

import co.edu.unbosque.model.PostsDTO;
import co.edu.unbosque.services.PostsService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

@Named("postCreateView")
@RequestScoped
public class PostCreateView implements Serializable {
    private PostsDTO postsDTO;
    @Inject
    private PostsService postsService;


    public PostCreateView(){
         postsDTO = new PostsDTO();
    }

    public PostsDTO getPostsDTO() {
        return postsDTO;
    }
    public void setPostsDTO(PostsDTO postsDTO) {
        this.postsDTO = postsDTO;
    }


    public String createPost(){

        postsService.savePosts(postsDTO);

        return null;
    }
}
