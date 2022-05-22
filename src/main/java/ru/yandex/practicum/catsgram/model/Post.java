package ru.yandex.practicum.catsgram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.yandex.practicum.catsgram.id.PostId;

import java.time.Instant;

@Data
@AllArgsConstructor
public class Post {
    private final Integer id = PostId.getPostId();
    private final String author;
    private final Instant creationDate = Instant.now();
    private String description;
    private String photoUrl;
}