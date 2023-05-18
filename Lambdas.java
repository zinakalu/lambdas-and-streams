//This
public interface Comparator<T>{
     int compareTo(T s1, T s2){};
}
// equals

Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);

//This 
public interface Runnable{
    void run();
}

//equals

Runnable runnable = () -> System.out.println("Hello!");

//This
public interface Consumer{
   public void c(String str);
}

//equals

Consumer<String> consumer = str -> System.out.println(str);