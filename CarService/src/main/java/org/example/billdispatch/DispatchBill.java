package org.example.billdispatch;

import org.example.bill.Bill;

public class DispatchBill {
    public static void handover(Bill bill){
        for(int i=0;i<bill.billContents.size();i++){
            String str = bill.billContents.get(i).chargeStatement;
            int price = bill.billContents.get(i).price;
            System.out.println(str+price);
        }
        if(bill.finalPrice > 10000){
            System.out.println("Complimentary service - "+"Vehicle cleaning");
        }
        System.out.println("Total Bill - "+bill.finalPrice);
    }
}
