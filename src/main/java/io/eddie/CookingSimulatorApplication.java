package io.eddie;


import io.eddie.config.GameConfiguration;
import io.eddie.config.MonitorConfiguration;
import io.eddie.controller.FrontDesk;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class CookingSimulatorApplication {

    public static void main(String[] args) {

        ApplicationContext springContainer = new AnnotationConfigApplicationContext(
                new Class[]{GameConfiguration.class, MonitorConfiguration.class}
        );

        List<String> ingredients = Arrays.asList("김치", "대파", "마늘", "고춧가루");

        FrontDesk frontDesk = springContainer.getBean(FrontDesk.class);

        frontDesk.orderCuisine(ingredients);
        frontDesk.orderCuisine(ingredients);
        frontDesk.orderCuisine(ingredients);

        frontDesk.checkExp();

        //

        FrontDesk frontDesk1 = springContainer.getBean(FrontDesk.class);
        FrontDesk frontDesk2 = springContainer.getBean(FrontDesk.class);

        System.out.println("frontDesk1 = " + frontDesk1);
        System.out.println("frontDesk2 = " + frontDesk2);
        System.out.println("isSingleton = " + (frontDesk1 == frontDesk2));

    }

}
