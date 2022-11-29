package pl.command;

public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink){
        String text = drink.getText();
        String changed = "";
        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                changed += Character.toLowerCase(text.charAt(i));
            }
            else{
                changed += Character.toUpperCase(text.charAt(i));
            }
        }
        drink.setText(changed);
    }

    @Override
    public void undo(StringDrink drink){
        String text = drink.getText();
        String undo = "";
        for(int i = 0; i < text.length(); i++){

            if(Character.isUpperCase(text.charAt(i))){
                undo += Character.toLowerCase(text.charAt(i));
            }
            else{
                undo += Character.toUpperCase(text.charAt(i));
            }
        }
        drink.setText(undo);
    }
}
