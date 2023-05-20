//1
Stream<T> filter(Predicate<? super T> predicate)
boolean allMatch(Predicate<? super T> predicate)

class Fruit{
    //
}

class Apple extends Fruit{
    //
}

List<Fruit> fruits = List.of(new Apple(), new Fruit(), new Fruit());

Predicate<Fruit> fruitPredicate = fruit -> fruit.getColor().equals("Red");
boolean allRed = fruits.stream().allMatch(fruitPredicate);


//2
<R>Stream<R>map(Function<? superT, ?extends R> mapper)

List<Integer> numbers = List.of(1,2,3,4,5);

Stream<String> stringStream = numbers.stream()
         .map(n -> "Number " + n);
stringStream.forEach(System.out::println);

//3
void forEach(Consumer<? super T> action)

List<Integer> numbers = List.of(1,2,3,4,5);
numbers.forEach(System.out::println);

//The 'System.out::println' is a method reference to the 'println' method. It represents the 
//action to be performed on each element of the 'numbers' list. Here, it prints each element on 
//a new line because the 'println' method is invoked on each element of the 'numbers' list.