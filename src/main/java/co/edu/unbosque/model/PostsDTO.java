package co.edu.unbosque.model;


import java.time.LocalDateTime;

public class PostsDTO {
    private int id;

    private String title, autor, content;

    private LocalDateTime date;

    public PostsDTO(int id, String title, String autor, String content, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.content = content;
        this.date = date;
    }

    public PostsDTO() {}

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
