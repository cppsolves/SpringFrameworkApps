package org.example.ingredientscontainer;
import java.util.HashMap;
import java.util.Map;
abstract public class IngredientsContainer {
     Map<String,Integer> EspressoIngredients;
     Map<String,Integer> LatteIngredients;
     Map<String,Integer> CappuccinoIngredients;
     IngredientsContainer(){
        EspressoIngredients = new HashMap<>();
        EspressoIngredients.put("Water",1500);
        EspressoIngredients.put("Beans",2000);
        LatteIngredients = new HashMap<>();
        LatteIngredients.put("Water",1500);
        LatteIngredients.put("Beans",2000);
        LatteIngredients.put("Milk",3000);
        CappuccinoIngredients  = new HashMap<>();
        CappuccinoIngredients.put("Water",1500);
        CappuccinoIngredients.put("Beans",2000);
        CappuccinoIngredients.put("Milk",3000);
    }
}
