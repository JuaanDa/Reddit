package co.edu.unbosque.model;


import java.sql.Timestamp;

public class PostsDTO {

    private int id;
    private String title;
    private String autor;
    private String content;
    private Timestamp date;

    public PostsDTO() {
    }

    public PostsDTO(int id, String title, String autor, String content, Timestamp date) {
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
