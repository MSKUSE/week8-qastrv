import java.util.Objects;

public class Rectangle extends Shape {
    private int sideA, sideB;

    public Rectangle() {}

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        System.out.println("Side A is " + this.sideA + ", Side B is " + this.sideB + ", Color: " + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle r = (Rectangle) o;
        return this.sideA == r.sideA && this.sideB == r.sideB && this.getColor().equals(r.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, getColor());
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}

