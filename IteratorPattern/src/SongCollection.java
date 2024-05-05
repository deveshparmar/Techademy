import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongCollection {
    private List<Song> songs;

    public SongCollection() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    private class SongListIterator implements SongIterator {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < songs.size();
        }

        @Override
        public Song next() {
            if (this.hasNext()) {
                return songs.get(position++);
            }
            return null;
        }
    }

    public SongIterator createIterator() {
        return new SongListIterator();
    }
}