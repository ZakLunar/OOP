package init.soundRecord.sounds;

import init.soundRecord.details.BitRate;
import init.soundRecord.details.Genre;
import init.soundRecord.details.TypeOfFile;

import java.util.Objects;


public abstract class Audio {
    String artist;
    String title;
    int length;
    Genre genre;
    TypeOfFile typeOfFile;
    BitRate bitRate;

    public Audio(String artist, String title, int length, Genre genre, TypeOfFile typeOfFile, BitRate bitRate) {
        this.artist = artist;
        this.title = title;
        this.length = length;
        this.genre = genre;
        this.typeOfFile = typeOfFile;
        this.bitRate = bitRate;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Genre getGenre() {
        return genre;
    }

    public TypeOfFile getTypeOfFile() {
        return typeOfFile;
    }

    public BitRate getBitRate() {
        return bitRate;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object i) {
        if (this == i) return true;
        if (i == null || getClass() != i.getClass()) return false;
        Audio ingredient = (Audio) i;
        return artist.equals(ingredient.artist) && title.equals(ingredient.title) && length == ingredient.length && typeOfFile == ingredient.typeOfFile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, length, typeOfFile, genre, bitRate);
    }
}
