package be.mean;


import java.util.ArrayList;
import java.util.List;

import aos.console.AosConsole;

public class MeanCalculator {

    public static void main(String[] args) {
     
        List<Integer> intList = new ArrayList<Integer>();
        
        Integer count = AosConsole.readInt("Number of integers to introduce:");
        
        AosConsole.println("...........");
        
        for (Integer i =0; i<count; i++ ){
            
            Integer j = AosConsole.readInt("Introduce the " + (i+1) + "eme number:");
            intList.add(j);    
        }
        
        AosConsole.println("...........");
        
        Integer total=0;
        for(Integer k: intList){
            total= total + k;
        }
        
        Float mean = ((float) total / (float) count);
        
        AosConsole.println("Mean=" + mean);
    }

}
