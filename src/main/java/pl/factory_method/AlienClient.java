package pl.factory_method;

import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.observer.Bar;
import pl.observer.Client;
import pl.observer.StringBar;
import pl.strategy.OrderingStrategy;

public abstract class AlienClient implements Client {

    private OrderingStrategy strategy;

    public AlienClient(){
        this.strategy = createOrderingStrategy();
    }

    @Override
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }
    @Override
    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

    protected abstract OrderingStrategy createOrderingStrategy();
}
