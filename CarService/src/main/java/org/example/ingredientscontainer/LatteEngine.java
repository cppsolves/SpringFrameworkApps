package org.example.ingredientscontainer;
import org.example.coffeeenginetype.IcoffeeEnginetype;
public class LatteEngine extends IngredientsContainer implements IcoffeeEnginetype {
    @Override
    public void makeCoffee(int code, boolean CustomIngredients) {
        if(LatteIngredients.size() == 0){
                System.out.println("Sorry Latte not available, please check back tomorrow!");
                return;
            }
            MoneyBox.putMoney(7);
            LatteIngredients.put("Water",LatteIngredients.get("Water")-350);
            LatteIngredients.put("Milk",LatteIngredients.get("Milk")-75);
            LatteIngredients.put("Beans",LatteIngredients.get("Beans")-20);
            System.out.println("Please collect your Latte from the counter...");
    }
}
