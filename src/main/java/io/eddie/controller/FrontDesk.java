package io.eddie.controller;

import io.eddie.app.Chief;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FrontDesk {

    private final Chief chief;

    public FrontDesk(Chief chief) {
        this.chief = chief;
    }

    public void orderCuisine(List<String> ingredients) {
        chief.cook(ingredients);
    }

    public void checkExp() {
        int currentExp = chief.checkExp();
        System.out.println("누적 경험치 : " + currentExp);
    }

}
