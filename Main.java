public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
 
        String binary = Integer.toBinaryString(num); 
 
        System.out.println("Binary: " + binary); 
    } 
}

public class day3 {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}

public class topictwo {
    public static void main(String[] args) {

        // DAY 3 - IF ELSE STATEMENTS

        // Q1 - Check Adult or Minor

        int age = 20;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // Q2 - Check Even or Odd

        int number = 17;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        // Q3 - Check Positive, Negative or Zero

        int num = -5;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


        // Q4 - Find Grade

        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }


        // Q5 - Find Larger Number

        int a = 25;
        int b = 40;

        if (a > b) {
            System.out.println(a + " is larger");
        } else if (b > a) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        }


        // Q6 - Check Exam Eligibility

        int attendance = 82;
        boolean feesPaid = true;

        if (attendance >= 75 && feesPaid == true) {
            System.out.println("Allowed to sit in exam");
        } else {
            System.out.println("Not allowed");
        }
    }
}