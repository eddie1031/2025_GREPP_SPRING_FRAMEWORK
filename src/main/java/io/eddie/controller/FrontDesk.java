package io.eddie.controller;

import io.eddie.app.Chief;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component
@Controller
public class FrontDesk {

    private final Chief chief;

    public FrontDesk(Chief chief) {
        this.chief = chief;
    }

    // http://localhost:8080/hall?ingredients=김치&ingredients=마늘&ingredients=대파&ingredients=고춧가루
    @GetMapping("/hall")
    public String orderCuisine(
            @RequestParam(name = "ingredients", required = false) List<String> ingredients
    ) {

        if ( ingredients != null ) {
            System.out.println("요리 되었음!");
            chief.cook(ingredients);
        }

        System.out.println("홀로 출발!");
        return "hall";

    }

    @GetMapping("/check-exp")
    public void checkExp(
            HttpServletRequest req, HttpServletResponse resp
    ) throws Exception {

        int currentExp = chief.checkExp();

        PrintWriter writer = resp.getWriter();
        writer.println("current exp : " + currentExp);

    }

}
