package io.eddie.app;

public abstract class AbstractCuisineAbility implements CuisineAbility {

    protected String getAbilityName() {
        return this.getClass().getSimpleName();
    }

}
