package dragoncurve;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Draws a Dragon Curve when the "Create" button is pressed.
 * Each iteration copies the existing curve, rotates the copy by 90 degrees
 * around the curve's end point and appends it.
 */
public class DragonCurve extends JFrame implements ActionListener {

    private Vector<Point> points;               // stores the curve
    private final int STROKE_WIDTH = 5;
    private final int ITERATIONS = 12;          // more iterations = bigger curve (2^n strokes)

    public static void main(String[] args) {
        new DragonCurve();
    }

    public DragonCurve() {
        super("Canvas");

        JButton button = new JButton("Create");
        setSize(800, 600);
        setLayout(null);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.setLocation(10, 30);
        button.setSize(100, 25);
        button.addActionListener(this);

        setVisible(true);
    }

    public void createDragonCurve() {
        if (points != null) {
            points.removeAllElements();

            // initial stroke
            points.add(new Point(0, 0));
            points.add(new Point(STROKE_WIDTH, 0));

            // populate Dragon Curve
            for (int i = 0; i < ITERATIONS; i++) {
                Point pivot = new Point(points.get(points.size() - 1));

                // copy the existing curve, rotate and append to the end
                for (int j = points.size() - 2; j >= 0; j--) {
                    Point newPoint = new Point(points.get(j));
                    newPoint.rotate(pivot, Math.toRadians(90));
                    points.add(newPoint);
                }
            }

            // move the curve to the centre of the window
            moveCurve(getWidth() / 2, getHeight() / 2);
        }
    }

    public void moveCurve(int xOffset, int yOffset) {
        Point offset = new Point(xOffset, yOffset);
        for (int i = 0; i < points.size(); i++) {
            points.get(i).translate(offset);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (points != null) {
            int numOfStrokes = points.size() - 1;
            for (int i = 0; i < numOfStrokes; i++) {
                Point p1 = points.get(i);
                Point p2 = points.get(i + 1);
                g.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        points = new Vector<Point>();
        createDragonCurve();
        this.repaint();
    }
}
