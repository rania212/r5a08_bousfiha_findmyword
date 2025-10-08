package r5a08_findmyword;

public class Score {
    private Letter[] scores; // Tableau des scores pour chaque lettre

    // Constructeur pour initialiser les scores
    public Score(String word) {
        this.scores = new Letter[word.length()]; // Initialisation du tableau de scores
    }

    // La méthode assess qui va comparer la lettre du mot et de la tentative
    public void assess(int index, String attempt, String word) {
        // Comparer la lettre de la tentative à l'index avec celle du mot
        if (attempt.charAt(index) == word.charAt(index)) {
            scores[index] = Letter.CORRECT; // Lettre correcte
        } else {
            scores[index] = Letter.INCORRECT; // Lettre incorrecte
        }
    }

    // Méthode pour récupérer le score de la lettre à l'index spécifié
    public Letter letter(int index) {
        return scores[index]; // Retourne le score à l'index
    }
}
