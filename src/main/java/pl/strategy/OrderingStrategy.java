package pl.strategy;

import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.observer.StringBar;

public interface OrderingStrategy {

    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);

    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);

}
