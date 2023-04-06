package org.example.factory;

import org.example.enumeration.Codes;
import org.example.price.Ifactory;
import org.example.pricecalculation.CalculatePrice;
public class BrakeFixing implements Ifactory {
    public int calculatePrice(String carType, Codes code) {
        return CalculatePrice.calculate(carType,code);
    }
}
