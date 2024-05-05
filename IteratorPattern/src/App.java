public class App {
    public static void main(String[] args) {
        SongCollection songCollection = new SongCollection();
        songCollection.addSong(new Song("Song 1", "Artist 1", 200));
        songCollection.addSong(new Song("Song 2", "Artist 2", 180));
        songCollection.addSong(new Song("Song 3", "Artist 3", 220));

        // Get the iterator
        SongIterator iterator = songCollection.createIterator();

        // Iterate over songs
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Duration: " + song.getDuration() + " seconds");
        }
    }
}
