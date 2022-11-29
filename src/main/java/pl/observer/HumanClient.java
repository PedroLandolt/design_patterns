package pl.observer;

import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.strategy.OrderingStrategy;

public class HumanClient implements Client{


    private final OrderingStrategy orderingStrategy;

    public HumanClient(OrderingStrategy orderingStrategy) {
        this.orderingStrategy = orderingStrategy;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink, recipe, bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        orderingStrategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
    }
}
