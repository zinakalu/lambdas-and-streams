public interface Consumer<T>{
    void accept (T t);
}

//The 'Consumer' interface is a functional interface that accepts a single input and returns no
//result. It's used as a parameter for methods that need to perform an action on each element of
//a collection or stream. The interface defines a single method called 'accept()', which takes an
//input of type 'T' and performs the desired operation. The method specifies the action that needs
//to be performed on each element

//An example to illustrate the usage of the 'Consumer' interface

List<String> names = List.of("Alice", "Bob", "Charlie");
Consumer<String> printName = name -> System.out.println(name);
names.forEach(printName);

//We create a 'Consumer<String>' called 'printName' that accepts a 'String' input and prints it
//using 'System.out.println()'. The 'printName' consumer is then passed to the 'forEach' method 
//of the 'names' list.

//By calling 'forEach(printName)', the 'accept()' method of the 'printName' consumer is invoked on 
//each element of the 'names' list, resulting in each name bring printed to the console.