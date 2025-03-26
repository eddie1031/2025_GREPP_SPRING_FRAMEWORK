package io.eddie.app;

import io.eddie.repository.AbilityRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JapaneseCuisineAbility extends AbstractCuisineAbility{

    private final AbilityRepository abilityRepository;

    public JapaneseCuisineAbility(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    private void increaseExp() {
        int curExp = abilityRepository.getCurrentExp(getAbilityName());
        abilityRepository.applyExp(getAbilityName(), ++curExp);
    }

    public void apply(List<String> ingredients) {

        this.increaseExp();

        String usedIngredients = String.join(" ", ingredients);
        System.out.println(usedIngredients + "를 볶아서 일본 음식을 요리했습니다!");

    }

    public int getExp() {
        return abilityRepository.getCurrentExp(getAbilityName());
    }

}
