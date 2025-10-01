package r5a08_findmyword;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à déviner fait une lettre

        // Act
        Score currentScore = word.guess("B"); // tentative du joueur
        Letter actual = currentScore.letter(0);
        Letter expected = Letter.INCORRECT;


        // Assert
        assertEquals(actual, expected);
    }
    @Test
    public void should_check_one_correct_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à déviner fait une lettre

        // Act
        Score currentScore = word.guess("E"); // tentative du joueur
        Letter actual = currentScore.letter(0);
        Letter expected = Letter.CORRECT;


        // Assert
        assertEquals(actual, expected);
}}