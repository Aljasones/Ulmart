package ru.itpark.model;

import lombok.Data;

@Data
public class TV extends Score {
    private int diagonal;
    private String color;
    private boolean smartTV;
    private boolean tunerDVBT2;

    public TV(long id, String name, int price, int diagonal, String color, boolean smartTV, boolean tunerDVBT2) {
        super(id, name, price);
        this.diagonal = diagonal;
        this.color = color;
        this.smartTV = smartTV;
        this.tunerDVBT2 = tunerDVBT2;
    }


}
