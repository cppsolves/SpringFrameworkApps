package org.example.ingredientscontainer;
import org.example.coffeeenginetype.IcoffeeEnginetype;
public class EspressoEngine extends IngredientsContainer implements IcoffeeEnginetype {
    @Override
    public void makeCoffee(int code, boolean CustomIngredients) throws NullPointerException{
        if(EspressoIngredients.size() == 0){
             System.out.println("Sorry Espresso not available, please check back tomorrow!");
                return;
        }
        MoneyBox.putMoney(4);
        EspressoIngredients.put("Water",EspressoIngredients.get("Water")-250);
        EspressoIngredients.put("Water",EspressoIngredients.get("Beans")-16);
        if(EspressoIngredients.get("Water") < 0) EspressoIngredients.remove("Water");
        if(EspressoIngredients.get("Beans") < 0) EspressoIngredients.remove("Beans");
        System.out.println("Please collect your Espresso from the counter...");
    }
}
