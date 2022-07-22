import processing.core.PApplet;

public class Window extends PApplet {
    private int height;
    private int width;

    // Constructors
    public Window() {}
    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }


    // Getters & Setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
