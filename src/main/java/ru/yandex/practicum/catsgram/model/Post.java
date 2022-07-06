package ru.yandex.practicum.catsgram.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Post {
    private Integer id;
    @Setter(AccessLevel.NONE)
    private final User author;
    @Setter(AccessLevel.NONE)
    private final LocalDate creationDate;
    private String description;
    private String photoUrl;

    public Post(User author, String description, String photoUrl) {
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
        this.creationDate = LocalDate.now();
    }

    public Post(Integer id, User author, String description, String photoUrl, LocalDate creationDate) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
        this.creationDate = creationDate;
    }
}