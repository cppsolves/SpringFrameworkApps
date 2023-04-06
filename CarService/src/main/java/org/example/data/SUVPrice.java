package org.example.data;

import org.example.enumeration.Codes;

public class SUVPrice {
    public int getPrice(Codes code){
        if(code.equals(Codes.BS01)){
            return 5000;
        }
        else if(code.equals(Codes.EF01)){
            return 10000;
        }
        else if(code.equals(Codes.CF01)){
            return  6000;
        }
        else if(code.equals(Codes.BF01)){
            return 2500;
        }
        else{
            return 8000;
        }
    }
}
