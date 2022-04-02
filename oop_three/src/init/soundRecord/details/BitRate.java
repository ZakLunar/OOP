package init.soundRecord.details;

public enum BitRate {
    B32(32),
    B128(128),
    B320(320),
    B1411(1411),
    B2304(2304);

    final int rate;

    BitRate(int rate) {
        this.rate = rate;
    }
}
