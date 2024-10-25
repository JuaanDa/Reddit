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
        selectedPost = new PostsDTO();
    }
    public PostsView() {
    }

    public PostsDTO getSelectedPost() {
       // System.out.println(getPosts(postsService.getPostIdByTitle(GetTitle())));
        int title = postsService.getPostIdByTitle("Guía definitiva de memes");
        return postsService.getPosts(title);
    }

    public void setSelectedPost(PostsDTO selectedPost) {
        this.selectedPost = selectedPost;


    }

    public List<PostsDTO> getPosts() {
        return posts;
    }

    public String GetTitle() {
        for (PostsDTO post : posts) {
            if (post.getTitle().equals(selectedPost.getTitle())) {
                return post.getTitle();

            }
        }
        return null;
    }
}
