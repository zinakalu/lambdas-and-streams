import java.util.*;
import java.util.stream.*;

public class CoffeeOrder{
    public static void main(String[] args){

        List<String> coffees = List.of("Cappuccino", "Americano", "Expresso", "Cortado", "Mocha", 
        "Cappuccino", "Flat White", "Latte");

        List<String> coffeesEngingInO = coffees.stream()
                                               .filter(s -> s.endsWith("o"))
                                               .sorted()
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println(coffeesEngingInO);


    }
}