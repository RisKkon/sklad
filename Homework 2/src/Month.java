import java.util.Scanner;

public class Month {

    public static void main (String[] args) {
        String January = new String("january");
        String February = new String("february");
        String March = new String("march");
        String April = new String ("april");
        String May = new String("may");
        String June = new String("june");
        String July = new String("july");
        String August = new String("august");
        String September = new String("september");
        String October = new String("october");
        String November = new String("november");
        String December = new String("december");

        System.out.println("Enter the name of the month");

        Scanner months = new Scanner(System.in);
        String input_month = months.nextLine();

        if (input_month.equals(January)) {

            System.out.println( "31 days");

        } else if (input_month.equals(February)) {

            System.out.println("28 days");

        } else if (input_month.equals(March)) {

            System.out.println("31 days");

        } else if (input_month.equals(April)) {

            System.out.println("30 days");

        } else if (input_month.equals(May)) {

            System.out.println("31 days");

        } else if (input_month.equals(June)) {

            System.out.println("30 days");

        } else if (input_month.equals(July)) {

            System.out.println("31 days");

        } else if (input_month.equals(August)) {

            System.out.println("31 days");

        } else if (input_month.equals(September)) {

            System.out.println("30 days");

        } else if(input_month.equals(October)) {

            System.out.println("31 days");

        } else if (input_month.equals(November)) {

            System.out.println("30 days");

        } else if (input_month.equals(December)) {

            System.out.println("31 days");

        }
    }
}
