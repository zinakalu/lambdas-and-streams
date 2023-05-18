List<String> strings = List.of("I", "am", "a", "list", "of", "Strings"); //A

Stream<String> stream = strings.stream(); //B
Stream<String> limit = stream.limit(4); //C
long result = limit.count(); //D
System.out.println("result = " + result); //D


List<String> result = limit.collect(Collectors.toList()); //E
System.out.println("result = " + result);


//A: This line creates an immutable list of strings named 'strings' using the 'List.of' method 
//B: The 'stream()' method is called on the 'strings' list, which returns a stream of strings
//C: The 'limit()' method is used on the 'stream' to create a new stream called 'limit', which
//contains the first four elements of the original stream. Here, it restricts tht stream to only
//include the strings "I", "am", "a", and "list".
//D: the 'count()' method is invoked on the 'limit' stream to determine the number of elements in the 
//stream. It returns a 'long' value representing the count. Here, it will be 4, as there are four elements
//in the 'limit' stream. The result is printed, which outputs "result=4"

//E: the 'collect()' method is used on the 'limit' stream to put the elements into a new 'List<String>'
//The 'Collectors.toList()' collector is used to collect the elements into a list. 
//HOWEVER, the 'limit' stream has already been consumed by calling 'count()' in the previous step and
//a stream can only be consumed once. If we remove the 'count()' operation, the code will work

