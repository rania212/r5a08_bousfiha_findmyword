package r5a08_findmyword;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    public void should_check_one_correct_letter() {
        // Arrange
        Word word = new Word("bonr"); // Le mot à deviner est une seule lettre "E"

        // Act
        Score currentScore = word.guess("bonr"); // Tentative correcte du joueur
        Letter actual = currentScore.letter(0); // Vérifier le score à la position 0
        Letter expected = Letter.CORRECT; // On s'attend à un score correct

        // Assert
        assertEquals(expected, actual); // Vérification du résultat
    }


    @Test
    public void should_check_one_incorrect_letter() {

        // Arrange
        Word word = new Word("E"); // Le mot à deviner fait une lettre

        // Act
        Score score = word.guess("B"); // tentative du joueur

        // Assert
        assertEquals(Letter.INCORRECT, score.letter(0));

    }
}
