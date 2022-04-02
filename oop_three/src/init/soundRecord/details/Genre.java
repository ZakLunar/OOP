package init.soundRecord.details;

public enum Genre {
    ROCK("Rock", 2),
    METAL("Metal", 3),
    INDIE("Indie", 1),
    JAZZ("Jazz", 4),
    RINGTONES("Ringtones",5);

    final String genreName;
    final int number;

    Genre(String genreName, int number) {
        this.genreName = genreName;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString(){
        return genreName;
    }
}
