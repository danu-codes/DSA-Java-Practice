package composition;

public class CompositionDemo {

    public static void main(String[] args) {
        Processor processor = new Processor();
        System.out.println("Output : " + processor.calNum(5));
    }
}
