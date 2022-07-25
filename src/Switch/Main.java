package Switch;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("val is 1");
        } else if (value == 2) {
            System.out.println("val is 2");
        } else {
            System.out.println("val is not 1 or 2");
        }

        int switchVal = 3;

        switch (switchVal) {
            case 1:
                System.out.println("val was 1");
                break;
            case 2:
                System.out.println("val was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("it was a " + switchVal);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        // Challenge
        char charVal = 'F';
        switch (charVal) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("is " + charVal);
                break;
            default:
                System.out.println("Not found");
                break;

        }

        printDayOfTheWeek(1);

    }

    //Day of the week challenge
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
