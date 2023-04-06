package org.example;

import org.example.bill.Bill;
import org.example.billdispatch.DispatchBill;
import org.example.garage.Garage;
import org.example.serviceid.IdtoCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws NumberFormatException{
        String carType;
        List<String> codes = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the car type");
        carType = scn.next();
        System.out.println("Please enter the services Id you'd like to enroll from the given list:");
        System.out.println("1.Basic servicing\n2.EngineFixing\n3.ClutchFixing\n4.BrakeFixing\n5.GearFixing");
        System.out.println("Press 0 to exit...");
        List<Integer> serviceId = new ArrayList<>();
        while(scn.hasNext()){
            String input = scn.next().trim(); // read input as string and remove leading/trailing whitespace
            if (input.equals("0")) {
                break;
            }
            serviceId.add(Integer.parseInt(input));
        }
        IdtoCode.convert(serviceId,codes);
        Bill bill = Garage.startServicing(carType,codes);
        DispatchBill.handover(bill);
    }
}