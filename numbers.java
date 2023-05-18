List<Integer> numbers = List.of(1,2,3,4,5);

List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0);
                                    .collect(Collectors.toList());
System.out.println(evenNumbers);

//A stream is created from the 'numbers' list. The stream is then filtered to include only the 
//even numbers. The 'collect()' method with 'Collectors.toList()' is used to collect the filtered
//elements into a new 'List<Integer>' called 'evenNumbers'

//NB: streams leave the original data intact. Each operation in the stream pipeline
//produces a new stream that represents the transformed or filtered elements.