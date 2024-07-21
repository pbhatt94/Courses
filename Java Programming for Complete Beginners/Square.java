
public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if (side <= 0) {
            return -1;
        }
        return side * side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if (side <= 0) {
            return -1;
        }
        return 4 * side;
    }

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.calculateArea()); 
        System.out.println(square.calculatePerimeter());
        Square squareWithZeroSide = new Square(0);
        System.out.println(squareWithZeroSide.calculateArea());
        System.out.println(squareWithZeroSide.calculatePerimeter());
        Square squareWithNonPositiveSide = new Square(-5);
        System.out.println(squareWithNonPositiveSide.calculateArea()); 
        System.out.println(squareWithNonPositiveSide.calculatePerimeter()); 
    }
}
