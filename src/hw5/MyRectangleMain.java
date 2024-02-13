package hw5;

// Question 4
public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle();
        r1.setWidth(10);
        r1.setDepth(20);
        System.out.println(r1.getArea());

        MyRectangle r2 = new MyRectangle(10, 20);
        System.out.println(r2.getArea());
    }
}

class MyRectangle {
    private double width;
    private double depth;

    public MyRectangle() {
        this.width = 10;
        this.depth = 20;
    }

    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    double getArea() {
        return width * depth;
    }
}
