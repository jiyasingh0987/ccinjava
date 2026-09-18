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

public class topicthree {
    public static void main(String[] args) {

        // DAY 4 - LOOPS


        // Q1 - Print numbers from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // Q2 - Print even numbers from 1 to 20

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // Q3 - Print numbers from 10 to 1

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        // Q4 - Multiplication table of 5

        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }


        // Q5 - Sum of numbers from 1 to 10

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);


        // Q6 - While loop

        int i = 1;

        while (i <= 5) {
            System.out.println("Java");
            i++;
        }


        // Q7 - Do-while loop

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}