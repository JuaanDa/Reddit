package co.edu.unbosque.services;

import co.edu.unbosque.model.PostsDTO;

import java.util.List;

public interface PostsServiceInterface {
    void savePosts (PostsDTO posts);

    PostsDTO getPosts (int id);

    List<PostsDTO> getAllPosts ();

}
