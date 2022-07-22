import processing.core.PApplet;

public class Circle extends PApplet {
    private int width;
    private int height;
    private int diameter;



    //Constructors
    public Circle(){}

    public Circle(int width, int height, int diameter) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
    }

    public void incrementWidthBy(int incrementvalue) {
        this.width += incrementvalue;
    }


    // getters & setters

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

}
