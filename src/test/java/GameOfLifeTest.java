import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameOfLifeTest {

    private Cell    cell;
    private boolean isAlive;

    @Test
    public void createDeadCellThenCellIsAliveReturnsFalse() {
        givenACellCreatedWithDeadStatus();
        whenIsAliveOnTheCellIsCalled();

        thenIsAliveIsFalse();
    }

    @Test
    public void createAliveCellThenCellIsAliveReturnsTrue() {
        givenACellCreatedWithAliveStatus();

        whenIsAliveOnTheCellIsCalled();

        thenIsAliveIsTrue();
    }

    @Test
    public void aliveCellWithLessThanTwoAliveNeighborsThenCellIsDeadInTheNextGeneration() {
        givenAnAliveCellWithLessThanTwoAliveNeighbors();

        whenNextGenerationIsAliveIsCalled();

        thenNextGenerationIsDead();
    }

    private void givenAnAliveCellWithLessThanTwoAliveNeighbors() {
        cell = new Cell(true);
        Cell neighbor = new Cell(false);
        cell.addNeighbors(neighbor);
    }

    private void whenNextGenerationIsAliveIsCalled() {

    }

    private void thenNextGenerationIsDead() {

    }


    private void givenACellCreatedWithAliveStatus() {
        cell = new Cell(true);
    }

    private void givenACellCreatedWithDeadStatus() {
        cell = new Cell(false);
    }

    private void whenIsAliveOnTheCellIsCalled() {
        isAlive = cell.isAlive();
    }

    private void thenIsAliveIsFalse() {
        assertFalse(isAlive);
    }

    private void thenIsAliveIsTrue() {
        assertTrue(isAlive);
    }

}