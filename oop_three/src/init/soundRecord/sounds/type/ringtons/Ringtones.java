package init.soundRecord.sounds.type.ringtons;

import init.soundRecord.details.BitRate;
import init.soundRecord.details.Genre;
import init.soundRecord.details.TypeOfFile;
import init.soundRecord.sounds.Audio;

public class Ringtones extends Audio {
    public Ringtones(String artist, String title, int length, Genre genre, TypeOfFile typeOfFile, BitRate bitRate) {
        super(artist, title, length, genre, typeOfFile, bitRate);
    }
}
