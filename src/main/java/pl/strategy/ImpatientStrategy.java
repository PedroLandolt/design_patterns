package pl.strategy;

import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.observer.StringBar;

public class ImpatientStrategy implements OrderingStrategy{
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        recipe.mix(drink);
    }

    @Override
    public void happyHourStarted(StringBar bar) {

    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
