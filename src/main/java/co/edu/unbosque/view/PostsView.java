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
        //System.out.println("Posts cargados: " + posts.size());

        // Agregar dos posts precargados
/*
            PostsDTO post1 = new PostsDTO();
            post1.setTitle("Primera Publicación");
            post1.setContent("Contenido de la primera publicación.");

            PostsDTO post2 = new PostsDTO();
            post2.setTitle("Segunda Publicación");
            post2.setContent("Contenido de la segunda publicación.");

            posts.add(post1);
            posts.add(post2);
*/
    }

    public PostsDTO getSelectedPost() {
        return selectedPost;
    }

    public void setSelectedPost(PostsDTO selectedPost) {
        this.selectedPost = selectedPost;
    }


    public List<PostsDTO> getPosts() {
        return posts;
    }


}
