package r5a08_findmyword;

public class Score {
    private Letter[] scores;

    public Score(Letter[] scores) {
        this.scores = scores;
    }

    public Letter letter(int index) {
        return scores[index];
    }
}
