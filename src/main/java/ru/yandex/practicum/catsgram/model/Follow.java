package ru.yandex.practicum.catsgram.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Follow {
    private String author;
    private String follower;

    public Follow(String authorId, String followerId) {
        this.author = authorId;
        this.follower = followerId;
    }
}