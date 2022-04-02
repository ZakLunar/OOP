package init.soundRecord.sounds.type.music;

import init.soundRecord.details.BitRate;
import init.soundRecord.details.Genre;
import init.soundRecord.details.TypeOfFile;
import init.soundRecord.sounds.Audio;

public class Music extends Audio {
    public Music(String artist, String title, int lenght, Genre genre, TypeOfFile typeOfFile, BitRate bitRate) {
        super(artist, title, lenght, genre, typeOfFile, bitRate);
    }
}