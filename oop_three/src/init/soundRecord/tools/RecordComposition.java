package init.soundRecord.tools;

import init.soundRecord.sounds.Audio;
import init.soundRecord.sounds.AudioComparator;

import java.util.Arrays;

public class RecordComposition {

    public RecordComposition(Audio[] audio) {
    }

    public String totalLength(Audio[] cd){
        int total = 0;
        for (Audio a : cd){
            total = total + a.getLength();
        }
        int minutes = total / 60;
        int seconds = total % 60;
        return minutes + " minutes " + seconds + " seconds";
    }

    public void sortingBy (Audio[] composition, AudioComparator comparator){
        System.out.println("\n=== Sorting composition audio by genre ===");
        Arrays.sort(composition, comparator);
        for (Audio a : composition) {
            System.out.println(a.getArtist() + " - " + a.getGenre());
        }
    }

    public void findCompositionByLength(Audio[] audio, int min, int max){
        System.out.println("\n=== This compositions in range from " + min + " to " + max + " minutes ===");
        for (Audio a: audio) {
            if(a.getLength() > min * 60 && max * 60 > a.getLength()){
                int length = a.getLength();
                int minutes = length / 60;
                int seconds = length % 60;
                System.out.println(a.getArtist() + " - " + a.getTitle() + " : " + minutes + " minutes " + seconds + " seconds");
            }
        }
    }
}
