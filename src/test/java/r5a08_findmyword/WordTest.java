package r5a08_findmyword;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à déviner fait une lettre

        // Act
                 word.guess("B"); // tentative du joueur
    }
}