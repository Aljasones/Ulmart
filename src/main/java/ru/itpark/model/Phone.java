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

    public Phone(long id, String name, int price, String manufacturer, String processor, int RAMInGb, int memoryInGb, double diagonal, boolean existence4G) {
        super(id, name, price);
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.RAMInGb = RAMInGb;
        this.memoryInGb = memoryInGb;
        this.diagonal = diagonal;
        this.existence4G = existence4G;
    }
}
