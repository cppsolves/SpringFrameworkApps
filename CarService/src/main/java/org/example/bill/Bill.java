package org.example.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    public List<Pair> billContents;
    public Bill(){
        billContents = new ArrayList<>();
    }
    public int finalPrice;
    public void calculateFinalPrice() {
        for(int i=0;i<billContents.size();i++){
            finalPrice+=billContents.get(i).price;
        }
    }

}
