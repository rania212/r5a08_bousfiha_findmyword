package r5a08_findmyword;

public class Word {
    private String word; // Le mot à deviner

    public Word(String correctWord) {
        this.word = correctWord; // Initialisation du mot
    }

    public Score guess(String attempt) {
        // Créer un tableau de scores vide
        Score score = new Score(word);

        // Calcule le score pour chaque lettre de la tentative
        for (int i = 0; i < word.length(); i++) {
            score.assess(i, attempt, word); // Comparer lettre par lettre
        }

        return score; // Retourner l'objet Score avec les résultats
    }
}
