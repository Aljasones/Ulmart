package ru.itpark;

import ru.itpark.model.Computer;
import ru.itpark.model.Phone;
import ru.itpark.model.TV;
import ru.itpark.repository.ScoreRepository;
import ru.itpark.service.ScoreService;

public class Main {
    public static void main(String[] args) {
        ScoreService scoreService = new ScoreService(new ScoreRepository());

        scoreService.addScore(new TV(0, "LG", 10000, "TV",4,32, "Black", false, true));
        scoreService.addScore(new TV(0, "Sony", 15000, "TV",5,54, "Black", true, true));
        scoreService.addScore(new TV(0, "BBK", 5000, "TV",3,24, "Black", false, false));
        scoreService.addScore(new Computer(0,"Pentium", 20000, "Computer",5,"Intel", "Pentium4", 4, 250, true));
        scoreService.addScore(new Computer(0,"AMDGame", 30000, "Computer", 4, "AMD", "Razen", 16, 500, true));
        scoreService.addScore(new Computer(0,"Mac", 50000, "Computer", 4,"Apple", "Xeon", 32, 750, true));
        scoreService.addScore(new Phone(0, "Galaxy S8", 30000, "Phone", 4,"Samsung", "Snapdragon", 4,128, 5.5,true));
        scoreService.addScore(new Phone(0, "IphoneX", 90000, "Phone", 4,"Apple", "A7", 6,128, 5.2,true));
        scoreService.addScore(new Phone(0, "Honor", 40000, "Phone", 4,"Huawei", "Kirin", 4,64, 6.5,true));


        System.out.println(scoreService.searchByName("Honor"));
        System.out.println(scoreService.sortByPrice());
        System.out.println(scoreService.sortByPriceDesc());
        System.out.println(scoreService.sortByRating());
        System.out.println(scoreService.sortByName());
        System.out.println(scoreService.searchByCategory("TV"));
        System.out.println(scoreService.getByPages(2));


        scoreService.remove(8);
        System.out.println(scoreService.sortByPriceDesc());


    }

}
