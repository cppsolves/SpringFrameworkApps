package org.example.pricecalculation;

import org.example.data.HatchBackPrice;
import org.example.data.SUVPrice;
import org.example.data.SedanPrice;
import org.example.enumeration.Codes;

public class CalculatePrice {
    public static int calculate(String carType, Codes code){
        if(carType.equals("Hatchback")){
            return new HatchBackPrice().getPrice(code);
        }
        else if(carType.equals("Sedan")){
            return new SedanPrice().getPrice(code);
        }
        return new SUVPrice().getPrice(code);
    }
}
