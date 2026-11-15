package composition;

/** Composition: a Processor "has a" Calculator and delegates the work to it. */
public class Processor {

    private final Calculator calculator = new Calculator();

    public int calNum(int num) {
        return calculator.calNum(num);
    }
}
