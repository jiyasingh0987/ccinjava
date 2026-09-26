// public class Main { 
//     public static void main(String[] args) { 
//         int num = 10; 
 
//         String binary = Integer.toBinaryString(num); 
 
//         System.out.println("Binary: " + binary); 
//     } 
// }

// public class day3 {
//     public static void main(String[] args) {

//         int age = 20;

//         if (age >= 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Minor");
//         }
//     }
// }

// public class topictwo {
//     public static void main(String[] args) {

//         // DAY 3 - IF ELSE STATEMENTS

//         // Q1 - Check Adult or Minor

//         int age = 20;

//         if (age >= 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Minor");
//         }


//         // Q2 - Check Even or Odd

//         int number = 17;

//         if (number % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }


//         // Q3 - Check Positive, Negative or Zero

//         int num = -5;

//         if (num > 0) {
//             System.out.println("Positive");
//         } else if (num < 0) {
//             System.out.println("Negative");
//         } else {
//             System.out.println("Zero");
//         }


//         // Q4 - Find Grade

//         int marks = 82;

//         if (marks >= 90) {
//             System.out.println("Grade: A+");
//         } else if (marks >= 80) {
//             System.out.println("Grade: A");
//         } else if (marks >= 70) {
//             System.out.println("Grade: B");
//         } else if (marks >= 60) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("Fail");
//         }


//         // Q5 - Find Larger Number

//         int a = 25;
//         int b = 40;

//         if (a > b) {
//             System.out.println(a + " is larger");
//         } else if (b > a) {
//             System.out.println(b + " is larger");
//         } else {
//             System.out.println("Both numbers are equal");
//         }


//         // Q6 - Check Exam Eligibility

//         int attendance = 82;
//         boolean feesPaid = true;

//         if (attendance >= 75 && feesPaid == true) {
//             System.out.println("Allowed to sit in exam");
//         } else {
//             System.out.println("Not allowed");
//         }
//     }
// }

// public class topicthree {
//     public static void main(String[] args) {

//         // DAY 4 - LOOPS


//         // Q1 - Print numbers from 1 to 10

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }


//         // Q2 - Print even numbers from 1 to 20

//         for (int i = 1; i <= 20; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }


//         // Q3 - Print numbers from 10 to 1

//         for (int i = 10; i >= 1; i--) {
//             System.out.println(i);
//         }


//         // Q4 - Multiplication table of 5

//         int number = 5;

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(number + " x " + i + " = " + (number * i));
//         }


//         // Q5 - Sum of numbers from 1 to 10

//         int sum = 0;

//         for (int i = 1; i <= 10; i++) {
//             sum = sum + i;
//         }

//         System.out.println("Sum = " + sum);


//         // Q6 - While loop

//         int i = 1;

//         while (i <= 5) {
//             System.out.println("Java");
//             i++;
//         }


//         // Q7 - Do-while loop

//         int j = 1;

//         do {
//             System.out.println(j);
//             j++;
//         } while (j <= 5);
//     }
// }

// class person{
//     private String name;
//     private int age;
//     public void set_name(String name){
//         this.name = name;
//     }
//     public void set_age(int age){   
//         this.age = age; 
//     }
//     public String get_name(){
//         return this.name;
//     }
//     public int get_age(){
//         return this.age;
//     }
// }
// class Student extends person{
//     private int s_id;
//     private void set_sid(int s_id){
//         this.s_id = s_id;
//     }
//     public int get_id(){
//         return this.s_id;
// }
// }
// public class Main{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.set_name("John");
//         System.out.println(s1.get_name());
//     }
// }   


// class person{
//     private String name;
//     private int age;
//     public void set_name(String name){
//         this.name = name;
//     }
//     public void set_age(int age){   
//         this.age = age; 
//     }
//     public String get_name(){
//         return this.name;
//     }
//     public int get_age(){
//         return this.age;
//     }
// }

// class faculty extends person{
//     private int f_id;
//     public void set_id(int id){
//         this.f_id = id;
//     }
//     public int get_id(){
//         return this.f_id;
//     }


// }

// public class Main{
//     public static void main(String[] args){
        
//         faculty f1 = new faculty();
//         f1.set_name("John");
//         f1.set_id(101);
//         f1.set_age(30);

//         System.out.println("Name: " + f1.get_name());
//         System.out.println("ID: " + f1.get_id());
//         System.out.println("Age: " + f1.get_age());
//     }}
       

interface Payment {
    public void pay(); 
}

class upi implements Payment{
    public void pay() {
        System.out.println("Payment done using UPI");
    }

}
 class card implements Payment{
    public void pay(){
        System.out.println("Payment done using Card");
    }
 }

 public class Main{
    public static void main(String[] args){

        Payment i1=new card();
        i1.pay();

        // card c1=new card();
        // c1.pay();
        // upi u1=new upi();
        // u1.pay();


    }
 }

interface person{
    public void name();
    public void age();
    public void id();
    
}
class faculty{
    public void name()
    {
        System.out.println("ge")
        
    }

}

class students{

}