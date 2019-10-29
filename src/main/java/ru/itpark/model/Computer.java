package ru.itpark.model;

import lombok.Data;

@Data
public class Computer extends Score {
    private String manufacturer;
    private String processor;
    private int RAMInGB;
    private int memoryInGb;
    private boolean existenceWIFI;

    public Computer(long id, String name, int price, String category, int rating, String manufacturer, String processor, int RAMInGB, int memoryInGb, boolean existenceWIFI) {
        super(id, name, price, category, rating);
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.RAMInGB = RAMInGB;
        this.memoryInGb = memoryInGb;
        this.existenceWIFI = existenceWIFI;
    }

    @Override
    public String toString() {
        return super.toString() + "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", RAMInGB=" + RAMInGB +
                ", memoryInGb=" + memoryInGb +
                ", existenceWIFI=" + existenceWIFI +
                "} ";
    }
}
