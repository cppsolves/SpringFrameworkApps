package org.example.ingredientscontainer;
import org.example.coffeeenginetype.IcoffeeEnginetype;
public class CappuccinoEngine extends IngredientsContainer implements IcoffeeEnginetype {
    @Override
    public void makeCoffee(int code, boolean CustomIngredients) {
        if(CappuccinoIngredients.size() == 0){
                System.out.println("Sorry Cappuccino not available, please check back tomorrow!");
                return;
        }
        MoneyBox.putMoney(6);
        CappuccinoIngredients.put("Water",CappuccinoIngredients.get("Water")-200);
        CappuccinoIngredients.put("Milk",CappuccinoIngredients.get("Milk")-100);
        CappuccinoIngredients.put("Beans",CappuccinoIngredients.get("Beans")-12);
        System.out.println("Please collect your Cappuccino from the counter...");
    }
}
