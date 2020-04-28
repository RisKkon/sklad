

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static void IAmARobot () {

        for (int i = 10; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i + ". I am a robottttt");
            } else {
                continue;
            }
        }
    }


    public static boolean IsTherePower(boolean hasPower) {

        int num1 = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        int num2 = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        if (num1 == num2) {

            hasPower = false;
            return hasPower;
        } else if (num1 > num2) {
            hasPower = true;
            return hasPower;
        } else if (num1 < num2) {
            hasPower = false;
            return hasPower;
        }
        return hasPower;
    }

    public static void ChargingBattery () {

        Scanner inputs = new Scanner(System.in);

        System.out.println("You are out of battery");
        System.out.println("Press 1 to go to the nearest charging dock");
        int input = inputs.nextInt();


            for (int i = 0; i <100; i++) {
                if (IsTherePower(true)) {
                    System.out.println("Charging Battery");
                    break;

                } else if (IsTherePower(false)) {
                    System.out.println("There is no power in this charging dock");
                    System.out.println("Press 1 to go to another");
                    input = inputs.nextInt();
                    if (input == 1) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }



    public static void Movement (int CHAIR, int WALL, int NOTHING) {

        CHAIR   = 1;
        WALL    = 2;
        NOTHING = 3;


        System.out.println("Whats in front of me ?");
        System.out.println("chair(1), wall(2), nothing(3)");
        Scanner inputs = new Scanner(System.in);
        int object = inputs.nextInt();

        if (object == CHAIR) {
            System.out.println("Jumping over the chair ");
        } else if (object == WALL) {

            int left    = 1;
            int right   = 2;

            System.out.println("Choose where to go, left(1) or right(2) ");
            int input = inputs.nextInt();
            if (input == left) {
                System.out.println("Going left");
            } else if (input == right) {
                System.out.println("Going right");

            }
        } else if (object == NOTHING) {
            System.out.println("There in nothing here, going forward");
            System.out.println("Looking for mouse");

        }


    }



    public static void Attacking() {



        Scanner inputs = new Scanner(System.in);
        int input = inputs.nextInt();
        if (input == 1) {

            System.out.println("Mouse dead");
        }
    }

    public static void StrongHit() {
        for (int i = 0; i < 100; i++) {
            int StrongHit = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            if (StrongHit == 5) {
                System.out.println("Hit too strong, you are going to break something");
                System.out.println("Press 1 to load another attack");
                Scanner inputs = new Scanner(System.in);
                int input = inputs.nextInt();
                for (i = 0; i <100; i++) {
                    if (input == 1) {
                        break;
                    } else {
                        System.out.println("I said Press 1...");
                        continue;
                    }
                }

                } else {
                    System.out.println("Ready to attack");
                    System.out.println("Press 1 to attack");
                    break;
                }
        }
    }


    public static void isThereAMoise () {
        for (int i = 0; i < 100; i++) {

            System.out.println("Enter the number of pixels");
            Scanner inputs = new Scanner(System.in);
            int NumOfPixels = inputs.nextInt();


            if (NumOfPixels % 2 == 0) {
                System.out.println("Mouse detected");
                break;
            } else {
                System.out.println("No mouse detected, try again");
                continue;
            }
        }
    }

    public static void statusOfRobot(int BatteryLevel, int NumOfHits) {


        System.out.println("Battery level : " + BatteryLevel + "%");
        System.out.println("You have " + NumOfHits + " hits remaining. \n");
    }

    public static void start_Message() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Welcome  to the Terminator/Jerry game");
            System.out.println("Press 1 to start the game");
            Scanner inputs = new Scanner(System.in);

            int input = inputs.nextInt();

            if (input == 1) {
                break;
            } else {
                System.out.println("I said press 1...");
                continue;
            }
        }
    }

    public static void main (String[]args){

        boolean hasPower    = true;
        int i               = 0;
        int BatteryLevel    = 100;
        int NumOfHits       = 4;
        int StrongHit;
        int CHAIR           = 1;
        int WALL            = 2;
        int NOTHING         = 3;

        //welcome message
        start_Message();

        for (i = 0; i < 100; i++ ) {
            //shows the current status of the robot
            statusOfRobot(BatteryLevel, NumOfHits);
            //movement of the robot
            Movement(CHAIR, WALL, NOTHING);
            //Checking if there is a mouse
            isThereAMoise();
            //If hit is too strong
            StrongHit();
            //Attacking the mouse
            Attacking();
            BatteryLevel    -= 25;
            NumOfHits       -= 1;
            if (BatteryLevel == 0) {
                //Checks if there is power in the charging dock
                IsTherePower(hasPower);
                while (BatteryLevel == 0) {
                    //Charges the Battery of the robot
                    ChargingBattery();
                    BatteryLevel    += 100;
                    NumOfHits       += 4;
                    //Message from the robot to the user
                    IAmARobot();
                }
            } else {
                continue;
            }
        }
    }
}

