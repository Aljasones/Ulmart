package ru.itpark.repository;
import ru.itpark.model.Score;
import java.util.Collection;
import java.util.LinkedList;

public class ScoreRepository {
    private final Collection<Score> scores = new LinkedList<>();
    private long nextId = 1;

    public void save(Score item) {
        if (item.getId() == 0){
            item.setId(nextId++);
        }
        scores.add(item);
    }
    public void saveAll(Collection<Score> item) {

        scores.addAll(item);
    }

    public Collection<Score> getAll(){
        return scores;
    }

    public boolean remove(int id) {
        return scores.removeIf(score -> score.getId() == id);

    }
}
