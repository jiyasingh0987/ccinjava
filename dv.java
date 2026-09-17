// int Age=25;
// String result=(Age>=18)?"eligible for voting":"not eligible for voting ";
// System.out.println(result);
// public class dv {
//     public static void main(String[] args) {
     
// int Age=25;
// if(Age>=18){
//     System.out.println("eligible for voting");
// }
// else{
//     System.out.println("not eligible for voting");
// }
// System.out.println("end of program"); 

// int marks=35;
// if(marks<40){
//     System.out.println("Student is failed");
// }
// else if(marks>=40 && marks<50){
//     System.out.println("Grade is C");
// }
// else if(marks>=50 && marks<60){
//     System.out.println("Grade is B");
// }
// else if(marks>=60 && marks<90){
//     System.out.println("Grade is A");
// }
// else{
//     System.out.println("Grade is A+");
// }


// class solution {
//     public int maxfrequency(int[] nums, int k) {
//         Arrays.sort(nums);
//         int left = 0;
//         long total = 0;
//         int result = 1;

//         for (int right = 1; right < nums.length; right++) {
//             total += (long)(nums[right] - nums[right - 1]) * (right - left);

//             while (total > k) {
//                 total -= nums[right] - nums[left];
//                 left++;
//             }

//             result = Math.max(result, right - left + 1);
//         }

//         return result;
//     }
// }

