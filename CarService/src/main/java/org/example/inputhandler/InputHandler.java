package org.example.inputhandler;
import org.example.coffeeengine.CoffeeEngine;
import java.util.Scanner;
public class InputHandler {
    public static void scanInput(){
        /*
         * Input handler for presenting options
         */
        Scanner scn = new Scanner(System.in);
        while(scn.hasNext()){
            String n = scn.next();
            if(n.equals("#")){
                System.out.println("Thank you for using our machine! We hope to see you again soon.");
                break;
            }
            if(Integer.valueOf(n) == 1){
                System.out.println("Please hit 0 to customize Espresso with the following options else hit 1 for the recommended purchase");
                System.out.println("beans : 18/cup\nwater : 200ml/cup");
                int i = scn.nextInt();
                new CoffeeEngine().prepareCoffee(Integer.valueOf(n),false);
            }
            else if(Integer.valueOf(n) == 2){
                System.out.println("Please hit 0 to customize Latte with the following options else hit 1 for the recommended purchase");
                System.out.println("Milk : 80 ml/cup\nbeans : 30ml/cup");
                int i = scn.nextInt();
                new CoffeeEngine().prepareCoffee(Integer.valueOf(n),false);
            }
            else if(Integer.valueOf(n) == 3){
                System.out.println("Please hit 0 to customize Cappuccino with the following options else hit 1 for the recommended purchase");
                System.out.println("Milk : 150ml/cup\nbeans : 56/cup");
                int i = scn.nextInt();
                new CoffeeEngine().prepareCoffee(Integer.valueOf(n),false);
            }
        }
    }
}
