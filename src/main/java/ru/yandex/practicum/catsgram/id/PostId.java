package ru.yandex.practicum.catsgram.id;

public class PostId {
    private static int postId;

    public static int getPostId() {
        return ++postId;
    }
}