package co.edu.unbosque.view;

import co.edu.unbosque.model.entities.Posts;
import co.edu.unbosque.services.PostsService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import co.edu.unbosque.model.PostsDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("postView")
@RequestScoped
public class PostsView implements Serializable {
    private ArrayList<PostsDTO> posts;
    private PostsDTO selectedPost;
    @Inject

    private PostsService postsService;

    @PostConstruct
    public void init() {
        posts = (ArrayList<PostsDTO>) postsService.getAllPosts();
    }


    public PostsDTO getSelectedPost() {
        //return postsService.getPosts(selectedPost.getId());
        return postsService.getPosts(1);
    }

    public void setSelectedPost(PostsDTO selectedPost) {
        this.selectedPost = selectedPost;
    }

    public List<PostsDTO> getPosts() {
        return posts;
    }
}
