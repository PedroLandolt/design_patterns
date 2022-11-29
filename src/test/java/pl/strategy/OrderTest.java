package pl.strategy;

import org.junit.jupiter.api.Test;
import pl.command.*;
import pl.observer.StringBar;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    protected StringRecipe getRecipe() {

        StringInverter si = new StringInverter();
        StringCaseChanger scc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');

        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(scc);
        transformers.add(sr);

        StringRecipe recipe = new StringRecipe(transformers);

        return recipe;
    }

    @Test
    public void orderStringRecipe(){
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();

        stringBar.order(drink, recipe);
        assertEquals("dCbX-DcBa", drink.getText());
    }
}
