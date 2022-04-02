package init.soundRecord.sounds;

import java.util.Comparator;

public abstract class AudioComparator implements Comparator<Audio> {

    public static AudioComparator genreComparator = new AudioComparator() {
        @Override
        public int compare(Audio a1, Audio a2) {
            return a1.getGenre().getNumber() - a2.getGenre().getNumber();
        }
    };
}
