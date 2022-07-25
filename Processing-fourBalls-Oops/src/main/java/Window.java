import processing.core.PApplet;

public class Window extends PApplet {
    private final int height;
    private final int width;

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
