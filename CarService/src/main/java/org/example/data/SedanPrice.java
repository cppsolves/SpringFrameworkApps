package org.example.data;
import org.example.enumeration.Codes;

public class SedanPrice {
    public int getPrice(Codes code){
        if(code.equals(Codes.BS01)){
            return 4000;
        }
        else if(code.equals(Codes.EF01)){
            return 8000;
        }
        else if(code.equals(Codes.CF01)){
            return 4000;
        }
        else if(code.equals(Codes.BF01)){
            return 1500;
        }
        else{
            return 6000;
        }
    }
}
