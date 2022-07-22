import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallsOops extends PApplet {
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private List<Circle> circles = new ArrayList<Circle>();


    public static void main(String[] args) {
        PApplet.main("FourBallsOops", args);
    }

    @Override
    public void settings() {
        super.settings();

        //Setting up a window
        Window window = new Window(640, 480);
        size(window.getWidth(), window.getHeight());

        // Craeting circles
        createCircleAndAddToList(0, HEIGHT/5, DIAMETER);
        createCircleAndAddToList(0, HEIGHT/5 * 2, DIAMETER);
        createCircleAndAddToList(0, HEIGHT/5 * 3, DIAMETER);
        createCircleAndAddToList(0, HEIGHT/5 * 4, DIAMETER);

    }

    @Override
    public void draw() {
        for (int i = 0; i < circles.size(); i++) {
            drawCircle(circles.get(i));
            circles.get(i).incrementWidthBy(i+1);
        }
    }

    public void drawCircle(Circle circle) {
        ellipse(circle.getWidth(), circle.getHeight(), circle.getDiameter(), circle.getDiameter());
    }

    public void createCircleAndAddToList(int width, int height, int diameter) {
        Circle circle = new Circle(width, height, diameter);
        circles.add(circle);
    }
}
