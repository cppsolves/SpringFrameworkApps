package org.example.serviceid;

import java.util.List;

public class IdtoCode {
    public static void convert(List<Integer> id,List<String>codes){
        for(int i=0;i<id.size();i++){
            int num = id.get(i);
            if(num == 1){
                codes.add("BS01");
            }
            else if(num == 2){
                codes.add("EF01");
            }
            else if(num == 3){
                codes.add("CF01");
            }
            else if(num == 4){
                codes.add("BF01");
            }
            else{
                codes.add("GF01");
            }
        }
    }
}
