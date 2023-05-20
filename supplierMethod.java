public interface Supplier<T>{
    T get();;
}

// 'T get()': This is the single abstract method of the 'Supplier' interface. It defines the behaviour
//of the supplier by specifying that it returns a value of type 'T' using the 'get()' method. The 
//method doesn't accept any arguments

//The 'Supplier' interface is used when you need to generate or provide a value on demand. 

import java.util.function.Supplier;

public class RandomNumberGenerator{
    public static void main(String[] args){
        Supplier<Integer> randomNumberSupplier = () -> (int)(Math.random()*100);

        int randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumber);
    }
}