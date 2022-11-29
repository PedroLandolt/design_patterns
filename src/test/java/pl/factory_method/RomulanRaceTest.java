package pl.factory_method;

import org.junit.jupiter.api.Test;
import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.observer.StringBar;
import pl.strategy.OrderTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomulanRaceTest extends OrderTest {

    @Test
    public void romulan() {
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();
        RomulanRace client = new RomulanRace();


        // Recipe is ordered immediately
        client.wants(drink, recipe, stringBar);
        assertEquals("dCbX-DcBa", drink.getText());
    }
}
