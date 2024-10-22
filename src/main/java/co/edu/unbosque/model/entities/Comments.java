package co.edu.unbosque.model.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
    @Table(name = "Comments")
@NamedQueries(
        @NamedQuery(name="Comments.findAll", query="SELECT e FROM Comments e")
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
    private Timestamp date;

    @Column(name = "likes")
    private int likes;

    @Column(name = "post_id")
    private int postId;

//    @ManyToOne
 //   private Posts post;


    public Comments() {
    }

    public Comments(int id, String autor, String content, Timestamp date, int likes, int postId) {

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

