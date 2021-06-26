package test_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
        List<Model> items = new ArrayList<>(Arrays.asList(
                                            new Model(1,"Book",50,"classmates"),
                                            new Model(2,"pen",10,"pinpoint"),
                                            new Model(3,"laptop",85000,"HP"),
                                            new Model(4,"smartphone",30000,"samsung"),
                                            new Model(5,"mouse",500,"iball"),
                                            new Model(6,"keyboard",1500,"dell"),
                                            new Model(7,"watch",5000,"Titan"),
                                            new Model(8,"shirt",3000,"Allen solly"),
                                            new Model(9,"Bike",190000,"Royal Enfield"),
                                            new Model(10,"car",5000000,"BMW")
                                        ));
        
        // sort items by price
        
        System.out.println("Sort by highest price :");
 
        Collections.sort(items, new Comparator<Model>() {
            @Override
            public int compare(Model p1, Model p2) {
                return p2.getPrice() - p1.getPrice();
            }
        }); 
        
        System.out.println(items);
        
        
        //filter items by brands
        
        System.out.println(" Filter items by brands starts with T");
        List<Model> filtered =
    		    items
    		        .stream()
    		        .filter(p -> p.brand.startsWith("T"))
    		        .collect(Collectors.toList());
        
        System.out.println(filtered);
    }
}