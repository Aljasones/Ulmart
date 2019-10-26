package ru.itpark.service;

import ru.itpark.model.Score;
import ru.itpark.repository.ScoreRepository;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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

    public List<Score> getSortedBy (Comparator<Score> comparator) {
        LinkedList<Score> result = new LinkedList<Score>(repository.getAll());
        result.sort(comparator);
        return result;
    }

    public List<Score> searchByName (String name){
        List<Score> result = new LinkedList<>();
        for (Score score : repository.getAll()) {
            if(score.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(score);
            }
            result.sort(((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())));
        }
        return result;

    }

    public List<Score> sortByPriceRevers() {
        return getSortedBy((o1, o2) -> -(o1.getPrice() - o2.getPrice()));
    }

//    public List<Score> searchByCategory (String category) {
////        List<Score> result = new LinkedList<>();
////    }

    public List<Score> sortByPrice() {
        return getSortedBy((Comparator.comparingInt(Score::getPrice)));
    }


}
