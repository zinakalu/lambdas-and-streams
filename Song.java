import java.util.List;
import java.util.stream.Collectors;


class Songs{
    public List<Song> getSongs(){
        return List.of(
            new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
            new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
            new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
            new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
            new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
            new Song("Silence", "Delerium", "Electronic", 2010, 155),
            new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
            new Song("Watercolour", "Pendulum", "Electronic", 2010, 155),
            new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
            new Song("With a Little Help From My Friends", "The Beatles", "Rock", 1967, 168),
            new Song("Come Together", "The Beatles", "Blues rock", 1968, 173),
            new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
            new Song("With a Little Help From My Friends", "Joe Cocker", "Rock", 1968, 46),
            new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
            new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
            new Song("What's Going On", "Gaye", "R & B", 1971, 420),
            new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
            new Song("I'm not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384)
        );

    }

}

public class Song{
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


public Song(String theTitle, String theArtist, String theGenre, int theYear, int theTimesPlayed ){
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
        List<Song> songList = new Songs().getSongs(); 

        // songList.forEach(s -> System.out.println(s));

        List<Song> rockSongs = songList.stream()
                                       .filter(rock -> rock.getGenre().equals("Rock")) //genre strictly equals rock
                                       .collect(Collectors.toList());
        // System.out.println(rockSongs);

        List<Song> rockSongs2 = songList.stream()
                                        .filter(song -> song.getGenre().contains("Rock")) //returns true if the genre has the word "Rock" in it anywhere
                                        .collect(Collectors.toList());
        // System.out.println(rockSongs2);

        List<Song> beatles = songList.stream()
                                     .filter(b -> b.getArtist().contains("The Beatles"))
                                     .collect(Collectors.toList());
        // System.out.println(beatles);

        List<Song> letterH = songList.stream()
                                     .filter(h -> h.getTitle().startsWith("H"))
                                     .collect(Collectors.toList());

        System.out.println(letterH);

        List<Song> recentThan1995 = songList.stream()
                                            .filter(year -> year.getYear() > 1995)
                                            .collect(Collectors.toList());
        // System.out.println(recentThan1995);

}
}


