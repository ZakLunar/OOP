package init.soundRecord;

import init.soundRecord.details.BitRate;
import init.soundRecord.details.Genre;
import init.soundRecord.details.TypeOfFile;
import init.soundRecord.sounds.Audio;
import init.soundRecord.sounds.type.music.Music;
import init.soundRecord.sounds.type.ringtons.Ringtones;
import init.soundRecord.tools.RecordComposition;

import static init.soundRecord.sounds.AudioComparator.genreComparator;

public class Main {

    public static void main(String[] args) {
        Audio audio1 = new Music("AC/DC", "Hell bells", 312, Genre.ROCK, TypeOfFile.FLAC, BitRate.B1411);
        Audio audio2 = new Music("Rammstein", "Du Hast", 234, Genre.METAL, TypeOfFile.WAV, BitRate.B2304);
        Audio audio3 = new Ringtones("Louis Armstrong", "What a Wonderful World", 32, Genre.JAZZ, TypeOfFile.AAC, BitRate.B128);
        Audio audio4 = new Music("Franz Ferdinand", "Take me out", 237, Genre.INDIE, TypeOfFile.MP3, BitRate.B320);
        Audio audio5 = new Ringtones("Apple", "Apple tone", 22, Genre.RINGTONES, TypeOfFile.MIDI, BitRate.B32);
        Audio audio6 = new Music("Trivium", "What The Dead Men Say", 369, Genre.METAL, TypeOfFile.FLAC, BitRate.B2304);

        Audio[] compositionsArray = new Audio[]{audio1, audio2, audio3, audio4, audio5, audio6};
        for (Audio a : compositionsArray) {
            System.out.println(a.getArtist() + " - " + a.getTitle());
        }

        RecordComposition CD_composition = new RecordComposition(compositionsArray);

        System.out.println("* Total length of composition on CD disc - " + CD_composition.totalLength(compositionsArray));

        CD_composition.sortingBy(compositionsArray, genreComparator);

        CD_composition.findCompositionByLength(compositionsArray,2,6);
    }
}
