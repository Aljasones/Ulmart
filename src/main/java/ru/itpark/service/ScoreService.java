package ru.itpark.service;

import ru.itpark.model.Score;
import ru.itpark.repository.ScoreRepository;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ScoreService {
    private ScoreRepository repository;

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

    public void addScore(Collection<Score> item) {

            repository.saveAll(item);

    }

    public void remove(int id) {
        repository.remove(id);
    }






    public List<Score> getSortedBy(Comparator<Score> comparator) {
        LinkedList<Score> result = new LinkedList<Score>(repository.getAll());
        result.sort(comparator);
        return result;
    }


    public List<Score> searchByName(String name) {
        List<Score> result = new LinkedList<>();
        for (Score score : repository.getAll()) {
            if (score.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(score);
            }
            result.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        }
        return result;

    }

    int forPageIndex = 1;

    public List<Score> sortByPriceDesc(int page) {
        return getSortedBy((o1, o2) -> -(o1.getPrice() - o2.getPrice())).subList(page - forPageIndex, page + forPageIndex);
    }


    public List<Score> sortByPrice(int page) {
        return getSortedBy(Comparator.comparingInt(Score::getPrice)).subList(page - forPageIndex, page + forPageIndex);
    }

    public List<Score> sortByRating(int page) {
        return getSortedBy(Comparator.comparingInt(Score::getRating)).subList(page - forPageIndex, page + forPageIndex);
    }

    public List<Score> sortByName(int page) {
        return getSortedBy(Comparator.comparing(Score::getName)).subList(page - forPageIndex, page + forPageIndex);
    }

    public List<Score> searchByCategory(String category, int page) {
        List<Score> result = new LinkedList<>();
        for (Score score : repository.getAll()) {
            if (score.getCategory().toLowerCase().contains(category.toLowerCase())) {
                result.add(score);
            }
            result.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        }
        return result.subList(page - forPageIndex, page + forPageIndex);
    }


}





