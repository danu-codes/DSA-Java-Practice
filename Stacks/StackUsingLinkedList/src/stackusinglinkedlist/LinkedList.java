package stackusinglinkedlist;

/** Minimal singly linked list used as the storage for the stack. */
public class LinkedList {

    private Cell top;

    public LinkedList() {
        this.top = null;
    }

    public Cell getTop() {
        return top;
    }

    public void setTop(Cell top) {
        this.top = top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void insertAtFront(int value) {
        top = new Cell(value, top);
    }

    public void insertAtLast(int value) {
        if (top == null) {
            top = new Cell(value, null);
            return;
        }
        Cell currentCell = top;
        while (currentCell.nextCell != null) {
            currentCell = currentCell.nextCell;
        }
        currentCell.nextCell = new Cell(value, null);
    }

    public void deleteFirstElement() {
        if (top == null) {
            return;
        }
        top = top.nextCell;
    }

    public void deleteLastElement() {
        if (top == null) {
            return;
        }
        if (top.nextCell == null) {
            top = null;
            return;
        }
        Cell currentCell = top;
        while (currentCell.nextCell.nextCell != null) {
            currentCell = currentCell.nextCell;
        }
        currentCell.nextCell = null;
    }

    public void printValues() {
        Cell temp = top;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.nextCell;
        }
        System.out.println("null");
    }
}
