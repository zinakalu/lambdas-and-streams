import java.util.List;
import java.util.stream.Collectors;


class Songs2{
    public List<Song1> getSongs2(){
        return List.of(
            new Song1("$10", "Hitchhiker", "Electronic", 2016, 183),
            new Song1("Havana", "Camila Cabello", "R&B", 2017, 324),
            new Song1("Cassidy", "Grateful Dead", "Rock", 1972, 123),
            new Song1("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
            new Song1("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
            new Song1("Silence", "Delerium", "Electronic", 2010, 155),
            new Song1("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
            new Song1("Watercolour", "Pendulum", "Electronic", 2010, 155),
            new Song1("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
            new Song1("With a Little Help From My Friends", "The Beatles", "Rock", 1967, 168),
            new Song1("Come Together", "The Beatles", "Blues rock", 1968, 173),
            new Song1("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
            new Song1("With a Little Help From My Friends", "Joe Cocker", "Rock", 1968, 46),
            new Song1("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
            new Song1("Breathe", "The Prodigy", "Electronic", 1996, 337),
            new Song1("What's Going On", "Gaye", "R & B", 1971, 420),
            new Song1("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
            new Song1("I'm not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384)
        );

    }

}

public class Song1{
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;
    

public String getTitle(){
    return this.title;
}

public String getArtist(){
    return this.artist;
}

public String getGenre(){
    return this.genre;
}

public int getYear(){
    return this.year;
}

public int getTimesPlayed(){
    return this.timesPlayed;
}


public Song1(String theTitle, String theArtist, String theGenre, int theYear, int theTimesPlayed ){
    this.title = theTitle;
    this.artist = theArtist;
    this.genre = theGenre;
    this.year = theYear;
    this.timesPlayed = theTimesPlayed;
    }






// public String toString(){
//     return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre + ", Year: " + year + ", Times Played: " + timesPlayed;
//     }

    // public String toString(){
    //     return "Title: " + title + ", Artist: "+ artist + ", Genre: "+ genre;
    // }

     public String toString(){
        return "Title: " + title + ", Artist: "+ artist + ", Year: "+ year;
    }


public static void main(String[] args){
        List<Song1> songList = new Songs2().getSongs2(); 

        // songList.forEach(s -> System.out.println(s));

        List<String> genres = songList.stream()
                                      .map(song1 -> song1.getGenre()) //the map operation on its own will result in an output List that's the same size as the input List. Tf we need the distinct operation
                                      .distinct() //stops any duplicate elements from getting through
                                      .collect(Collectors.toList());
        System.out.println(genres);

}
}

//Here we're listing all the genres, meaning we need to turn the song elements in the stream into genre(String) elements.
//This is what map is for. The map operation states how to map from one type to another type!

//"List<String>": The result will be a List of Strings, because genre is a String

//"songList.stream()": This is a List of Song objects

//".map(song1 -> song1.getGenre())": a single parameter, a Song1 because this map() is on a Stream of Songs
//and the lambda body can return an object of any type. By calling getGenre on the song, the stream after this
//point will be a stream of (genre) Strings.

//NB: The map method takes a Function and Function interfaces do one thing: they take something of one type and return 
//something of a different type.