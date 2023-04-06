package org.example.garage;

import org.example.bill.Bill;
import org.example.bill.Pair;
import org.example.enumeration.Codes;
import org.example.factory.*;
import org.example.price.Ifactory;
import java.util.List;

public class Garage {
  private static Ifactory ifactory;
  public static Bill startServicing(String carType, List<String> codes){
      Bill bill = new Bill();
      int price = 0;
      for(int i=0;i<codes.size();i++){
          Codes code = Codes.valueOf(codes.get(i));
          if(code.equals(Codes.BS01)){
              ifactory = new BasicServicing();
              price = ifactory.calculatePrice(carType,code);
              bill.billContents.add(new Pair("Charges for Basic Servicing - ",price));
          }
          else if(code.equals(Codes.EF01)){
              ifactory = new EngineFixing();
              price =ifactory.calculatePrice(carType,code);
              bill.billContents.add(new Pair("Charges for Engine Fixing - ",price));
          }
          else if(code.equals(Codes.CF01)){
              ifactory = new ClutchFixing();
              price =ifactory.calculatePrice(carType,code);
              bill.billContents.add(new Pair("Charges for Clutch Fixing - ",price));
          }
          else if(code.equals(Codes.BF01)){
              ifactory = new ClutchFixing();
              price = ifactory.calculatePrice(carType,code);
              bill.billContents.add(new Pair("Charges for Brake Fixing - ",price));
          }
          else if(code.equals(Codes.GF01)){
              ifactory = new GearFixing();
              price = ifactory.calculatePrice(carType,code);
              bill.billContents.add(new Pair("Charges for Gear Fixing- ",price));
          }
      }
      bill.calculateFinalPrice();
      return bill;
  }
}
