package pl.composite;

import org.junit.jupiter.api.Test;
import pl.command.StringCaseChanger;
import pl.command.StringDrink;
import pl.command.StringInverter;
import pl.command.StringTransformer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTransformerGroupTest {

    @Test
    public void transformGroup(){
        StringDrink drink = new StringDrink("AbCd-aBcD");

        StringInverter si = new StringInverter();
        StringCaseChanger scc = new StringCaseChanger();

        List<StringTransformer> transformers = new ArrayList<>();

        transformers.add(si);
        transformers.add(scc);

        StringTransformerGroup stg = new StringTransformerGroup(transformers);

        stg.execute(drink);
        assertEquals("dCbA-DcBa", drink.getText());
    }
}
