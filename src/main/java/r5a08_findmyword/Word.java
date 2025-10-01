package r5a08_findmyword;

public class Word {
    public Word(String e) {
    }

    public Score guess(String guess) {
        return new Score(new Letter[]{Letter.INCORRECT});
    }

}
