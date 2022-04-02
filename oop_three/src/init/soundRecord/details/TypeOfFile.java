package init.soundRecord.details;

public enum TypeOfFile {
    AAC("aac"),
    MP3("mp3"),
    WAV("wav"),
    FLAC("flac"),
    MIDI("midi");

    final String typeOfFile;

    TypeOfFile(String name) {
        this.typeOfFile = name;
    }
}
