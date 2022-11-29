package pl.command;

public class StringReplacer implements StringTransformer{

    private char oldChar;
    private char newChar;

    public StringReplacer(char oldChar, char newChar){
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink){
        String text = drink.getText();
        String replaced = "";
        for(int i = 0; i < text.length(); i++){

            if(text.charAt(i) == oldChar){
                replaced += newChar;
            }
            else{
                replaced += text.charAt(i);
            }
        }
        drink.setText(replaced);
    }

    @Override
    public void undo(StringDrink drink){
        StringReplacer undos = new StringReplacer(newChar, oldChar);
        undos.execute(drink);
    }
}
