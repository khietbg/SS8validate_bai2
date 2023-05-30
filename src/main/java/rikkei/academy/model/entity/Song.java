package rikkei.academy.model.entity;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "not required")
    @Size(min = 5,max = 800,message = "name from 5 to 800")
    @Pattern(regexp = "r'^[a-zA-Z0-9]*$'")
    private String  name;
    @NotEmpty(message = "not required")
    @Size(min = 5,max = 800,message = "author from 5 to 300")
    @Pattern(regexp = "r'^[a-zA-Z0-9]*$'")
    private String author;
    @NotEmpty(message = "not required")
    @Size(min = 5,max = 800,message = "category from 5 to 1000")
    @Pattern(regexp = "r'^[a-zA-Z0-9]*$'")
    private String category;

    public Song() {
    }

    public Song(Long id, String name, String author, String category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
