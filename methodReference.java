Function<Song, String> getGenre = song -> song.getGenre();

//method references can replace lambdas, we can point the compiler to a method that does teh operation we want, using a method reference

Function<Song, String> getGenre = Song::getGenre;


List<Song> result = allSongs.stream()
                            .sorted((o1,o2) -> o1.getYear() - o2.getYear())
                            .collect(Collector.toList());

//above equals

List<Song> result = allSongs.stream()
                            .sorted(Comparator.comparingInt(Song::getYear))
                            .collect(Collector.toList());

