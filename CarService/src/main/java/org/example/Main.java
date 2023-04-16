package org.example;
import org.example.inputhandler.InputHandler;
public class Main {
    public static void main(String[] args) throws NumberFormatException{
        System.out.println("===Welcome to Coffee Simulation===\nPlease select from below");
        System.out.println("1.Espresso");
        System.out.println("2.Latte");
        System.out.println("3.Cappuccino");
        System.out.println(("#.Exit"));
        InputHandler.scanInput();
    }
}