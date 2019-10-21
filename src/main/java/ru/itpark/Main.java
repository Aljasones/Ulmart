package ru.itpark;

import ru.itpark.model.Notebook;
import ru.itpark.model.Phone;
import ru.itpark.model.TV;
import ru.itpark.repository.ScoreRepository;
import ru.itpark.service.ScoreService;

public class Main {
    public static void main(String[] args) {
        ScoreService scoreService = new ScoreService(new ScoreRepository());

        scoreService.addScore(new TV(0, "LG", 10000, 32, "Black", false, true));
        scoreService.addScore(new TV(0, "Sony", 15000, 54, "Black", true, true));
        scoreService.addScore(new TV(0, "BBK", 5000, 24, "Black", false, false));
        scoreService.addScore(new Notebook(0,"Pentium", 20000, "Intel", "Pentium4", 4, 250, true));
        scoreService.addScore(new Notebook(0,"AMDGame", 30000, "AMD", "Razen", 16, 500, true));
        scoreService.addScore(new Notebook(0,"Mac", 50000, "Apple", "Xeon", 32, 750, true));
        scoreService.addScore(new Phone(0, "Galaxy S8", 30000, "Samsung", "Snapdragon", 4,128, 5.5,true));
        scoreService.addScore(new Phone(0, "IphoneX", 90000, "Apple", "A7", 6,128, 5.2,true));
        scoreService.addScore(new Phone(0, "Honor", 40000, "Huawei", "Kirin", 4,64, 6.5,true));




    }

}
