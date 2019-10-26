package ru.itpark.model;

import lombok.Data;

@Data
public class Notebook extends Score {
    private String manufacturer;
    private String processor;
    private int RAMInGB;
    private int memoryInGb;
    private boolean existenceWIFI;

    public Notebook(long id, String name, int price, String manufacturer, String processor, int RAMInGB, int memoryInGb, boolean existenceWIFI) {
        super(id, name, price);
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.RAMInGB = RAMInGB;
        this.memoryInGb = memoryInGb;
        this.existenceWIFI = existenceWIFI;
    }


}
