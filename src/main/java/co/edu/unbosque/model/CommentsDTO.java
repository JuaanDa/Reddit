package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class CommentsDTO {
    private int id, likes, postId;

    private String autor, content;

    private LocalDateTime date;

    public CommentsDTO(int id, String autor, String content, LocalDateTime date, int likes, int postId) {
        this.id = id;
        this.autor = autor;
        this.content = content;
        this.date = date;
        this.likes = likes;
        this.postId = postId;
    }

    public CommentsDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
}
