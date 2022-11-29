package pl.factory_method;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.observer.StringBar;
import pl.strategy.OrderTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FerengiRaceTest extends OrderTest {

    @Test
    public void ferengiAlreadyOpened() {
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();

        FerengiRace client = new FerengiRace();

        // Recipe is ordered immediately
        stringBar.startHappyHour();
        client.wants(drink, recipe, stringBar);
        assertEquals("dCbX-DcBa", drink.getText());
    }

    @Test
    public void ferengiStartClosed(){
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();

        FerengiRace client = new FerengiRace();
        stringBar.addObserver(client); // this is important!

        client.wants(drink, recipe, stringBar);
        assertEquals("AbCd-aBcD", drink.getText());

        // Recipe is only ordered here
        stringBar.startHappyHour();
        assertEquals("dCbX-DcBa", drink.getText());
    }
}
