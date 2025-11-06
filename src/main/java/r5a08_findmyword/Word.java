package r5a08_findmyword;

public class Word {
    private final String word;

    public Word(String correctWord) {
        this.word = correctWord.toUpperCase();
    }

    public Score guess(String attempt) {
        if (attempt == null || attempt.length() != word.length()) {
            throw new IllegalArgumentException("La tentative doit avoir la même longueur que le mot secret.");
        }

        attempt = attempt.toUpperCase();
        Score score = new Score(word);
        score.assess(attempt);
        return score;
    }
}