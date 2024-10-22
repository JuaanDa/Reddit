package co.edu.unbosque.model.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Posts")

@NamedQueries(
        @NamedQuery(name="Posts.findAll", query="SELECT e FROM Posts e")
)
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title", length = 50)
    private String title;

    @Column(name="autor", length = 50)
    private String autor;

    @Column(name="content")
    private String content;

    @Column(name="post_date")
    private Timestamp date;

    public Posts(){

    }

    public Posts(int id, String title, String autor, String content, Timestamp date) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.content = content;
        this.date = date;
    }

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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}