//we can stack together multiple operations in a single stream pipeline
//e.g we can sort the elements in the stream before we apply the limit

List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

List<String> result = strings.stream();
                             .sorted() //sort what's in the stream (not the original collection), using natural order, before limiting the results
                             .limit(4) //limit the stream to just four elements
                             .collect(Collectors.toList());
System.out.println("result = " + result);


List<String> result = strings.stream()
                             .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                             .limit(4)
                             .collect(Collectors.toList());
//the .compareToIgnoreCase() method from the String class compares the String with another String, in a way that ignores upper or lowercase.


List<String> result = strings.stream()
                             .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                             .skip(2) //the stream will skip over the first two elements
                             .limit(4)
                             .collect(Collectors.toList());