package tms.java.lesson6OOP;

public class Rectangle {
    public Point upperLeftCorner;
    public Point bottomRightCorner;

    public Rectangle(Point upperLeftCorner, Point bottomRightCorner) {
        this.upperLeftCorner = upperLeftCorner;
        this.bottomRightCorner = bottomRightCorner;
    }

    public double getArea() {
        int dx = upperLeftCorner.coordinateX - bottomRightCorner.coordinateX;
        int dy = bottomRightCorner.coordinateY - upperLeftCorner.coordinateY;
        return (dx * dy);
    }

    public double getDiagonal() {

        return upperLeftCorner.getDistance(bottomRightCorner);
    }
}
