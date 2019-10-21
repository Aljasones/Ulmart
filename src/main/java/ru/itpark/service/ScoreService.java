package ru.itpark.service;

import ru.itpark.model.Score;
import ru.itpark.repository.ScoreRepository;

public class ScoreService {
    private final ScoreRepository repository;

    public ScoreService(ScoreRepository repository) {
        this.repository = repository;
    }

    public void addScore(Score item) {
        if (item.getName() == null) {
            throw new IllegalArgumentException("name field must be filled");
        }
        if (item.getPrice() == 0) {
            throw new IllegalArgumentException("price field must be filled");
        }
        repository.save(item);
    }
}
