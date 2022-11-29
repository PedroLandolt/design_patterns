package pl.command;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String inverted = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            inverted += text.charAt(i);
        }
        drink.setText(inverted);
    }

    @Override
    public void undo(StringDrink drink){
        String text = drink.getText();
        String undo = "";
        for(int i = text.length()-1; i >= 0; i--){

            undo += text.charAt(i);
        }
        drink.setText(undo);
    }
}
