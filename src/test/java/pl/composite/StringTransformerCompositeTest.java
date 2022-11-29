package pl.composite;

import org.junit.jupiter.api.Test;
import pl.command.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTransformerCompositeTest {

    @Test
    public void transformComposite(){

        StringDrink drink = new StringDrink("AbCd-aBcD");

        StringInverter si = new StringInverter();
        StringCaseChanger scc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');

        List<StringTransformer> transformers_1 = new ArrayList<>();
        transformers_1.add(si);
        transformers_1.add(scc);
        StringTransformerGroup stg_1 = new StringTransformerGroup(transformers_1);

        List<StringTransformer> transformers_2 = new ArrayList<>();
        transformers_2.add(sr);
        transformers_2.add(scc);
        StringTransformerGroup stg_2 = new StringTransformerGroup(transformers_2);

        List<StringTransformer> transformers_3 = new ArrayList<>();
        transformers_3.add(stg_1);
        transformers_3.add(stg_2);

        StringRecipe recipe = new StringRecipe(transformers_3);
        recipe.mix(drink);

        assertEquals("DcBx-dCbA", drink.getText());
    }

}
