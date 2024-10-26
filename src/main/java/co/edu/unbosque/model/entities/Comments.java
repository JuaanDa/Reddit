package co.edu.unbosque.model.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Comments")
@NamedQueries(
        @NamedQuery(name="Comments.findAll", query="SELECT c FROM Comments c")
)
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "autor")
    private String autor;

    @Column(name = "content")
    private String content;

    @Column(name = "comment_date")
    private LocalDateTime date;

    @Column(name = "likes" )
    private int likes = 0;

    @Column(name = "post_id")
    private int postId;


    public Comments(int id, String autor, String content, LocalDateTime date, int likes, int postId) {
        this.id = id;
        this.autor = autor;
        this.content = content;
        this.date = date;
        this.likes = 0;
        this.postId = postId;
    }

    public Comments() {
    this.likes  = 0;
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

