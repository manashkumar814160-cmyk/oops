class AreaCalculator {

    // Area of a square
    double area(double side) {
        return side * side;
    }

    // Area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Area of a circle
    double area(float radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Area of Square: " + obj.area(5));
        System.out.println("Area of Rectangle: " + obj.area(5, 10));
        System.out.println("Area of Circle: " + obj.area(7.0f));
    }
}