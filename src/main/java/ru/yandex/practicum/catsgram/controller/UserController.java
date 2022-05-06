package ru.yandex.practicum.catsgram.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final Map<String, User> users = new HashMap<>();

    @GetMapping
    public Map<String, User> findAll() {
        log.trace("Текущее количество пользователей: {}", users.size());
        return users;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException("User exists");
        }
        if (user.getEmail().isBlank() || user.getEmail() == null) {
            throw new InvalidEmailException("Invalid email address");
        }
        log.trace("Добавлен пользователь: {}", user);
        users.put(user.getEmail(), user);
        return user;
    }

    @PutMapping
    public User update(@RequestBody User user) {
        if (user.getEmail().isBlank() || user.getEmail() == null) {
            throw new InvalidEmailException("Invalid email address");
        }
        users.put(user.getEmail(), user);
        return user;
    }
}