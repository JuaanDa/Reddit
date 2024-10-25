package co.edu.unbosque.services;

import co.edu.unbosque.model.PostsDTO;
import co.edu.unbosque.model.dao.DAO;
import co.edu.unbosque.model.entities.Posts;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;
@Named
@RequestScoped
public class PostsService implements PostsServiceInterface {

    @Inject
    private DAO<Posts, Integer> daoPosts;
    private ModelMapper dataMapper;

    public PostsService() {
        dataMapper = new ModelMapper();
        dataMapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(PRIVATE);
    }

    @Override
    public void savePosts(PostsDTO postsDTO) {
        Posts posts = dataMapper.map(postsDTO, Posts.class);
        daoPosts.save(posts);
        dataMapper.map(postsDTO, Posts.class);
    }

    @Override
    public PostsDTO getPosts(int id) {
        Posts posts = daoPosts.findById(id);
        return dataMapper.map(posts, PostsDTO.class);
    }

    @Override
    public List<PostsDTO> getAllPosts() {
        List<Posts> posts  = daoPosts.findAll();
        List<PostsDTO> postsDTOs = new ArrayList<>();
        for (Posts post : posts) {
            postsDTOs.add(dataMapper.map(post, PostsDTO.class));
        }
        return postsDTOs;
    }


    public int getPostIdByTitle(String title) {
        List<Posts> posts = daoPosts.findAll(); // Obtener todos los posts
        for (Posts post : posts) {

            if (post.getTitle().equals(title)) { // Compara el título

                return post.getId(); // Retorna el ID del post que coincide
            }
        }
        return 1; // Retorna null si no se encuentra el post
    }

}
