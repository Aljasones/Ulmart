package ru.itpark.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public abstract class Score{
    private long id = 0;
    private String name;
    private int price;
}
