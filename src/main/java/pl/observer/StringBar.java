package pl.observer;

import pl.command.StringDrink;
import pl.command.StringRecipe;

public class StringBar extends Bar{

    private boolean happyHourDrink = false;

    @Override
    public boolean isHappyHour() {
        return happyHourDrink;
    }

    @Override
    public void startHappyHour() {
        happyHourDrink = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happyHourDrink = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
