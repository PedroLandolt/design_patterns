package pl.observer;

import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.strategy.OrderingStrategy;

public interface Client extends BarObserver {

    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);

}
