package co.edu.unbosque.model;

import java.sql.Timestamp;

public class CommentsDTO {

    private int id;
    private String autor;
    private String content;
    private Timestamp date;
    private int likes;
    private int postId;

    public CommentsDTO() {
    }

    public CommentsDTO(int id, String autor, String content, Timestamp date, int likes, int postId) {
        this.id = id;
        this.autor = autor;
        this.content = content;
        this.date = date;
        this.likes = likes;
        this.postId = postId;
    }

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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
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
