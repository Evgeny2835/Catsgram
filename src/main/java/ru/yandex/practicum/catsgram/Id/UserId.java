package ru.yandex.practicum.catsgram.Id;

public class UserId {
    private static int userId;

    public static int getUserId() {
        return ++userId;
    }
}