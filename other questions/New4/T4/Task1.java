// in machine manufacturing company manager wants analysis data
// manager has list of machine price
// 1. create list of 5 machine's price
//     1st 10k ,20k,30k,40k,50k
// 2. find machine with maximum and minimum price from list 
// 3. find price of third machine
// 4. sort machine prices in ascending order and print 
// 5. remove machine 1 from list 
// consider prices in double

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javafx.print.Collation;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Double> machinePrices = new ArrayList<>();
        machinePrices.add(10000.0);
        machinePrices.add(20000.0);
        machinePrices.add(30000.0);
        machinePrices.add(40000.0);
        machinePrices.add(50000.0);
        System.out.println(machinePrices);
        

        System.out.print("Maximum price : ");
        double maxPrice=Collections.max(machinePrices);
        System.out.println(maxPrice);
        
        System.out.print("Minimum price : ");
        double minPrice=Collections.min(machinePrices);
        System.out.println(minPrice);

        System.out.print("Third Machine Price :");
        double thirdMachine=machinePrices.get(2);
        System.out.println(thirdMachine);
        System.out.print("Ascending order : ");
        Collections.sort(machinePrices);
        System.out.println(machinePrices);

        System.out.print("Remove machine 1 : ");
        machinePrices.remove(0);
        System.out.println(machinePrices);       
    }
}