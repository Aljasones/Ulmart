package ru.itpark.model;

import lombok.Data;

@Data
public class TV extends Score {
    private int diagonal;
    private String color;
    private boolean smartTV;
    private boolean tunerDVBT2;

    public TV(long id, String name, int price, String category, int rating, int diagonal, String color, boolean smartTV, boolean tunerDVBT2) {
        super(id, name, price, category, rating);
        this.diagonal = diagonal;
        this.color = color;
        this.smartTV = smartTV;
        this.tunerDVBT2 = tunerDVBT2;
    }

    @Override
    public String toString() {
        return super.toString() + "TV{" +
                "diagonal=" + diagonal +
                ", color='" + color + '\'' +
                ", smartTV=" + smartTV +
                ", tunerDVBT2=" + tunerDVBT2 +
                "} ";
    }
}
