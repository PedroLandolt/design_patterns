package pl.strategy;

import org.junit.jupiter.api.Test;
import pl.command.StringDrink;
import pl.command.StringRecipe;
import pl.observer.HumanClient;
import pl.observer.StringBar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImpatientStrategyTest extends OrderTest {

    @Test
    public void impatientStrategy() {
        OrderTest orderTest = new OrderTest();

        StringBar stringBar = new StringBar();

        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = orderTest.getRecipe();

        ImpatientStrategy strategy = new ImpatientStrategy();
        HumanClient client = new HumanClient(strategy);

        //Recipe is ordered immediately
        client.wants(drink, recipe, stringBar);
        assertEquals("dCbX-DcBa", drink.getText());
    }

}
