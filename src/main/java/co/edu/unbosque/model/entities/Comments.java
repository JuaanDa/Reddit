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

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "comment_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime date;

    @Column(name = "likes", columnDefinition = "INT DEFAULT 0")
    private int likes;

    @Column(name = "post_id", nullable = false)
    private int postId;

    public Comments(int id, String autor, String content, LocalDateTime date, int likes, int postId) {
        this.id = id;
        this.autor = autor;
        this.content = content;
        this.date = date;
        this.likes = likes;
        this.postId = postId;
    }

    public Comments() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

