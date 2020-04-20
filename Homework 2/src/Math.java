import java.util.Scanner;

public class Math {


    public static void rectangle_perimeter(double length, double width) {

        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of this triangle is : " + perimeter + "sm");

    }



    public static void  rectangle_area(double length, double width ) {

        double area = length * width;

        System.out.println("The area of this triangle is : " + area + "sm");

    }



    public static void main(String[] args) {

        Scanner sides = new Scanner(System.in);

        System.out.println("Enter the length of the triangle (sm) : ");

        String input_length = sides.nextLine();
        double length = Double.parseDouble(input_length);


        System.out.println("Enter the width of the triangle (sm) : ");

        String input_width = sides.nextLine();
        double width = Double.parseDouble(input_width);


        rectangle_area(length, width);
        rectangle_perimeter(length, width);



    }
}
