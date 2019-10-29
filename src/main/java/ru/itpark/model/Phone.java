package ru.itpark.model;


import lombok.Data;

@Data
public class Phone extends Score {
    private String manufacturer;
    private String processor;
    private int RAMInGb;
    private int memoryInGb;
    private double diagonal;
    private boolean existence4G;

    public Phone(long id, String name, int price, String category, int rating, String manufacturer, String processor, int RAMInGb, int memoryInGb, double diagonal, boolean existence4G) {
        super(id, name, price, category, rating);
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.RAMInGb = RAMInGb;
        this.memoryInGb = memoryInGb;
        this.diagonal = diagonal;
        this.existence4G = existence4G;
    }

    @Override
    public String toString() {
        return  super.toString() + "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", RAMInGb=" + RAMInGb +
                ", memoryInGb=" + memoryInGb +
                ", diagonal=" + diagonal +
                ", existence4G=" + existence4G +
                "} ";
    }
}
