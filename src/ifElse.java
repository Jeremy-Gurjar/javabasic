
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class ifElse {

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3andQ4();
        Q5();
        Q6();
        Q7();
        Q8();
        Q9();
        Q10();
        Q11();
        Q12();
        Q13();
        Q14();
        Q15();
        Q16();
    }

    static void Q1() {
        System.out.println("1. Enter number: ");
        Scanner scanNumber = new Scanner(System.in);
        int number1 = Integer.parseInt(scanNumber.next());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(scanNumber.next());
        String evenOdd1 = (number1 % 2 == 0) ? "The first number is even" : "The first number is odd";
        String evenOdd2 = (number2 % 2 == 0) ? "The second number is even" : "The second number is odd";
        System.out.println(evenOdd1);
        System.out.println(evenOdd2);
    }

    static void Q2() {
        System.out.println("2. Enter year: ");
        Scanner scanYear = new Scanner(System.in);
        int year = Integer.parseInt(scanYear.next());

        if (year % 4 == 0) {
            System.out.println("This year is a leap year");
        }
        else {
            System.out.println("This year is NOT a leap year");
        }
    }

    static void Q3andQ4() {
        System.out.println("3. Enter name: ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.next();

        System.out.println("Enter roll no: ");
        Scanner scanRollNo = new Scanner(System.in);
        String rollNo = scanRollNo.next();

        System.out.println("Enter marks for first subject: ");
        Scanner scanSub1 = new Scanner(System.in);
        int sub1 = Integer.parseInt(scanSub1.next());

        if (sub1 >= 80 ) {
            System.out.println("You passed with A+");
        }
        else if (sub1 >= 60) {
            System.out.println("You passed with A");
        }
        else if (sub1 >= 50) {
            System.out.println("You passed with B");
        }
        else if (sub1 >= 35) {
            System.out.println("You passed with C");
        }
        else {
            System.out.println("You failed");
        }

        System.out.println("Enter marks for second subject: ");
        Scanner scanSub2 = new Scanner(System.in);
        int sub2 = Integer.parseInt(scanSub2.next());

        if (sub2 >= 80 ) {
            System.out.println("You passed with A+");
        }
        else if (sub2 >= 60) {
            System.out.println("You passed with A");
        }
        else if (sub2 >= 50) {
            System.out.println("You passed with B");
        }
        else if (sub2 >= 35) {
            System.out.println("You passed with C");
        }
        else {
            System.out.println("You failed");
        }

        System.out.println("Enter marks for third subject: ");
        Scanner scanSub3 = new Scanner(System.in);
        int sub3 = Integer.parseInt(scanSub3.next());

        if (sub3 >= 80 ) {
            System.out.println("You passed with A+");
        }
        else if (sub3 >= 60) {
            System.out.println("You passed with A");
        }
        else if (sub3 >= 50) {
            System.out.println("You passed with B");
        }
        else if (sub3 >= 35) {
            System.out.println("You passed with C");
        }
        else {
            System.out.println("You failed");
        }

        System.out.println("Your total marks were: " + (sub1 + sub2 + sub3));

        if (sub1 >= 80 && sub2 >= 80 && sub3 >= 80) {
            System.out.println("You passed all tests with A+");
        }
        else if (sub1 >= 60 && sub2 >= 60 && sub3 >= 60) {
            System.out.println("You passed all tests with A");
        }
        else if (sub1 >= 50 && sub2 >= 50 && sub3 >= 50){
            System.out.println("You passed all tests with B");
        }
        else if (sub3 >= 35 && sub2 >= 35 && sub1 >= 35) {
            System.out.println("You passed all tests with C");
        }
        else {
            System.out.println("You failed all tests");
        }


    }

    static void Q5() {
        System.out.println("5. This program swaps two numbers");
        System.out.println("Enter first number");
        Scanner scanNumber = new Scanner(System.in);
        int number1 = Integer.parseInt(scanNumber.next());
        System.out.println("Enter second number");
        int number2 = Integer.parseInt(scanNumber.next());
        int tempNumber = number1;
        number1 = number2;
        number2 = tempNumber;
        System.out.println("first number: " + number1 + "\nsecond number: " + number2);
    }

    static void Q6() {
        System.out.println("Enter employee ID: ");
        Scanner scanEmployeeID = new Scanner(System.in);
        String employeeID = scanEmployeeID.next();
        System.out.println("Enter name: ");
        Scanner scanName = new Scanner(System.in);
        String Name = scanName.next();
        System.out.println("Enter base salary: ");
        Scanner scanSalary = new Scanner(System.in);
        int baseSalary = Integer.parseInt(scanSalary.next());

        double HRA = (baseSalary * 0.1);
        System.out.println("HRA: " + HRA);
        double DA = (baseSalary * 0.08);
        System.out.println("DA: " + DA);
        double TA = (baseSalary * 0.09);
        System.out.println("TA: " + TA);
        double PF = (baseSalary * 0.2);
        System.out.println("PF: " + PF);
        String grossSalary = ("Gross salary: " + (baseSalary + HRA + DA + TA - PF));
        System.out.println(grossSalary);
    }

    static void Q7() {
        System.out.println("Enter first number");
        Scanner scanNumber = new Scanner(System.in);
        int number1 = Integer.parseInt(scanNumber.next());

        System.out.println("Enter second number");
        int number2 = Integer.parseInt(scanNumber.next());

        System.out.println("Enter third number");
        int number3 = Integer.parseInt(scanNumber.next());

        System.out.println("Enter fourth number");
        int number4 = Integer.parseInt(scanNumber.next());

        System.out.println("Enter fifth number");
        int number5 = Integer.parseInt(scanNumber.next());

        System.out.println("Your average is: " + ((number1 + number2 + number3 + number4 + number5)/5));
    }

    static void Q8() {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanNumber.next());

        if (number < 0) {
            System.out.println("This number is negative");
        }
        else if (number > 0) {
            System.out.println("This number is positive");
        }
        else {
            System.out.println("This number is 0");
        }
    }

    static void Q9() {
        Scanner scanSalesID = new Scanner(System.in);
        System.out.println("Enter sales ID:");
        String salesID = scanSalesID.next();
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanName.next();
        Scanner scanSalary = new Scanner(System.in);
        System.out.println("Enter salary:");
        int salary = Integer.parseInt(scanName.next());
        Scanner scanSalesAmount = new Scanner(System.in);
        System.out.println("Enter sales amount:");
        int salesAmount = Integer.parseInt(scanName.next());

        if (salesAmount >= 50000) {
            System.out.println("Commission is " + salesAmount*0.35);
        }
        else if (salesAmount >= 30000) {
            System.out.println("Commission is " + salesAmount*0.35);
        }
        else if (salesAmount >= 20000) {
            System.out.println("Commission is " + salesAmount*0.1);
        }
        else if (salesAmount >= 10000) {
            System.out.println("Commission is " + salesAmount*0.05);
        }
        else if (salesAmount < 10000) {
            System.out.println("Commission is " + salesAmount*0.02);
        }
    }

    static void Q10() {
        Scanner scanLetter = new Scanner(System.in);
        System.out.println("Enter letter from a to f in lowercase: ");
        String letter = scanLetter.next();
        switch (letter) {
            case "a" :
                System.out.println("Amsterdam");
                break;
            case "b" :
                System.out.println("Berlin");
                break;
            case "c" :
                System.out.println("Chicago");
                break;
            case "d" :
                System.out.println("Dallas");
                break;
            case "e" :
                System.out.println("Edinburgh");
                break;
            case "f" :
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Enter a letter from a to f in lowercase: ");
        }
    }

    static void Q11() {
        Scanner scanAge = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanAge.next());
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        }
        else {
            System.out.println("You are not old enough to vote");
        }
    }

    static void Q12() {
        Scanner scanLetter = new Scanner(System.in);
        System.out.println("Enter any uppercase letter: ");
        String letter = scanLetter.next();
        System.out.println(letter.toLowerCase());
    }

    static void Q13() {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanNumber.next());
        System.out.println("Enter another number: ");
        int number2 = Integer.parseInt(scanNumber.next());
        System.out.println("Enter an operator (/,*,+,-): ");
        Scanner scanOp = new Scanner(System.in);
        String operator = scanOp.next();

        if (Objects.equals(operator, "/")) {
            System.out.println(number / number2);
        }
        else if (Objects.equals(operator, "*")) {
            System.out.println(number * number2);
        }
        else if (Objects.equals(operator, "+")) {
            System.out.println(number + number2);
        }
        else if (Objects.equals(operator, "-")) {
            System.out.println(number - number2);
        }
    }

    static void Q14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char char1 = scanner.next().charAt(0);

        if (Character.isLetter(char1)) {
            System.out.println("Your character is a letter");
        }
        else if (Character.isDigit(char1)) {
            System.out.println("Your character is a number");
        }
        else {
            System.out.println("Your character is a special character");
        }
    }

    static void Q15() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number from 1-7");
        int num = Integer.parseInt(scanner.next());

        if (num == 1) {
            System.out.println("Monday");
        }
        else if (num == 2) {
            System.out.println("Tuesday");
        }
        else if (num == 3) {
            System.out.println("Wednesday");
        }
        else if (num == 4) {
            System.out.println("Thursday");
        }
        else if (num == 5) {
            System.out.println("Friday");
        }
        else if (num == 6) {
            System.out.println("Saturday");
        }
        else if (num == 7) {
            System.out.println("Sunday");
        }
    }

    static void Q16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a lowercase letter");
        char char1 = scanner.next().charAt(0);


        if (char1 == 'a' || char1  == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u') {
            System.out.println("Your character is a vowel");
        }
        else {
            System.out.println("Your character is a consonant");
        }
    }
}
