/**
 * Created by Leonid Shelest on 11.09.2017.
 */
public class Triangle implements Shape {
    private Rectangle rectangle;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Rectangle rectangle, double sideA, double sideB, double sideC) {
        this.rectangle = rectangle;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        init();
    }

    @Override
    public double calcArea() {
        //As far as there's only a half of rectangle inside the triangle
        //rectangle's area must be subdivided by 2
        double rectangleArea = rectangle.calcArea() / 2;
        return calcPlainArea() - rectangleArea;
    }

    @Override
    public double calcPlainArea() {
        // Heron's formula:
        // A = SquareRoot(s * (s - sideA) * (s - sideB) * (s - sideC))
        // where s = (sideA + sideB + sideC) / 2
        double s = (sideA + sideB + sideC) / 2;
        return (Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
