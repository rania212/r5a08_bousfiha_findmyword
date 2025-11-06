package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static r5a08_findmyword.Letter.*;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("A");
        // Act
        Score score = word.guess("E");

        // Assert
        assertScoreForGuess(score, INCORRECT);
    }

    @Test
    public void should_check_one_correct_letter() {
        // Arrange
        Word word = new Word("E");
        // Act
        Score score = word.guess("E");

        // Assert
        assertScoreForGuess(score, CORRECT);
    }

    @Test
    void should_check_second_letter_wrong_position() {
        Word word = new Word("EMT");
        // Act
        Score score = word.guess("GET");

        // Assert
        assertScoreForGuess(score, INCORRECT, PART_CORRECT);
    }

    @Test
    void should_check_all_combinaisons_correct() {
        // Arrange
        Word word = new Word("EMT");

        // Act
        Score score = word.guess("GET");

        // Assert
        assertScoreForGuess(score, PART_CORRECT, INCORRECT, PART_CORRECT);
    }

    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            Letter expected = expectedScores[position];
            assertThat(score.letter(position))
                    .as("Position %d", position)
                    .isEqualTo(expected);
        }
    }
}