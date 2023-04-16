package org.example.coffeeengine;
import org.example.coffeeenginetype.IcoffeeEnginetype;
import org.example.ingredientscontainer.CappuccinoEngine;
import org.example.ingredientscontainer.EspressoEngine;
import org.example.ingredientscontainer.LatteEngine;
public class CoffeeEngine{
    private  IcoffeeEnginetype enginetype;
    public void prepareCoffee(int code,boolean custom){
        if(code == 1){
           enginetype = new EspressoEngine();
           enginetype.makeCoffee(code,false);
        }
        else if(code == 2){
           enginetype = new LatteEngine();
           enginetype.makeCoffee(code,false);
        }
        else{
           enginetype = new CappuccinoEngine();
           enginetype.makeCoffee(code,false);
        }
    }
}
