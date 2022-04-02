package init.soundRecord.sounds;

import init.soundRecord.details.BitRate;
import init.soundRecord.details.Genre;
import init.soundRecord.details.TypeOfFile;
import init.soundRecord.sounds.type.music.Music;
import init.soundRecord.sounds.type.ringtons.Ringtones;

public class AudioList extends Audio{

    Audio audio1 = new Music("AC/DC", "Hell bells", 312, Genre.ROCK, TypeOfFile.FLAC, BitRate.B1411);
    Audio audio2 = new Music("Rammstein", "Du Hast", 234, Genre.METAL, TypeOfFile.WAV, BitRate.B2304);
    Audio audio3 = new Ringtones("Louis Armstrong", "What a Wonderful World", 35, Genre.JAZZ, TypeOfFile.AAC, BitRate.B128);
    Audio audio4 = new Music("Franz Ferdinand", "Take me out", 237, Genre.INDIE, TypeOfFile.MP3, BitRate.B320);
    Audio audio5 = new Ringtones("Apple", "Apple tone", 22, Genre.RINGTONES, TypeOfFile.MIDI, BitRate.B32);

    public AudioList(String artist, String title, int length, Genre genre, TypeOfFile typeOfFile, BitRate bitRate) {
        super(artist, title, length, genre, typeOfFile, bitRate);
    }
}
