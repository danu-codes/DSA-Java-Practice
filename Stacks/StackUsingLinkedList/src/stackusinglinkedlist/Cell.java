package stackusinglinkedlist;

/** One node of the singly linked list. */
public class Cell {

    int value;
    Cell nextCell;

    public Cell(int value, Cell nextCell) {
        this.value = value;
        this.nextCell = nextCell;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Cell getNextCell() {
        return nextCell;
    }

    public void setNextCell(Cell nextCell) {
        this.nextCell = nextCell;
    }
}
