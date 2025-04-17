public class TestShape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("blue", 3, 4);
        Rectangle r2 = new Rectangle("blue", 3, 4);

        r1.describe();

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        System.out.println("r1 equals r2? " + r1.equals(r2));
    }
}
