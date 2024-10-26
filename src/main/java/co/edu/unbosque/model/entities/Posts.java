package co.edu.unbosque.model.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
    @Table(name = "Posts")

@NamedQueries({
        @NamedQuery(name = "Post.findCommentsByPostId", query = "SELECT c FROM Comments c WHERE c.postId = :postId"),
        @NamedQuery(name="Posts.findAll", query="SELECT p FROM Posts p")

})
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title", length = 50)
    private String title;

    @Column(name="autor", length = 50)
    private String autor;

    @Column(name="content", length = 250 )
    private String content;

    @Column(name="post_date" )
    private LocalDateTime date;



    public Posts(int id, String title, String autor, String content, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.content = content;
        this.date = date;
    }

    public Posts() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}