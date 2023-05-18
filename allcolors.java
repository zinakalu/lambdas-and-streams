List<String> allColors = List.of("Red", "Blue", "Yellow");
for (String color : allColors){
    System.out.println(color);
}


//instead of creating a for loop every time we want to do something 'for each'
//item in the list, we can call the forEach method from the Iterable interface
//List implements Iterable so it has all the methods from the Iterable interface


List<String> allColors = List.of("Red", "Blue", "Yellow");
allColors.forEach(color -> System.out.println(color));