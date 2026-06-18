// import java.util.*;

//ARRAY KE OPERATIONS

// 1]CREATE   2]INPUT    3]OUTPUT    4]UPDATE 

//  *CREATING AN ARRAY

//SYNTAX 1]- DATATYPE ARRAYNAME[] = NEW DATATYPE[SIZE];
//EX-     INT MARKS[] = NEW INT[50];

//SYNTAX 2]- INT NUMBERS[]={1,2,3,4};

//SYNTAX  3]- STRING FRUITS[]={"MANGO","BANANA","APPLE","GRAPES","PAPAYA"}; 

// public class arrayCC {

//     public static void main(String[] args) {
//         int marks[] = new int[50];
//         INT NUMBERS[]={1,2,3,4};
//     }
// }

//SYNTAX 1ST KA INPUT OR OUTPUT KAISE LE

// import java.util.*;
// public class arrayCC {

//     public static void main(String[] args) {

//         int marks[]=new int[50];
//         Scanner sc = new Scanner(System.in);

//         marks[0]=sc.nextInt();  //for physics marks
//         marks[1]=sc.nextInt();  //for chem marks
//         marks[2]=sc.nextInt();  //for math marks

//         System.out.println("Physics marks is " + marks[0]);
//         System.out.println("Chem marks is " + marks[1]);
//         System.out.println("Math marks is " + marks[2]);

// // //  ***************** JAB APNE KO AISA LAGEGA KI APNE MARKS ME COUNTING MISTAKE HAI TO APN RECHAKE KR SKTE HAI

// //            marks[2]=100;
// //            System.out.println("After the rechecking the pepr the Math marks will been increased " + marks[2]);

//     //    ***************ISME APN APNE MARKS KE PERCENTAGE BHI NIKAL SKTE HAI

//        int percentage=(marks[0] + marks[1] + marks[2]) / 3 ;
//        System.out.println("The percentage of the physics chemistry and math subject is the :" + percentage + "%");

//     }
// }

//SYNTAX 2ND KA INPUT OR OUTPUT KAISE LETE HAI DEKHO

// public class arrayCC {

//     public static void main(String[] args) {

//         int marks[]={92,90,89};
//         System.out.println("The highest marks in the array is : " + marks[0]);
//         System.out.println("The 2nd highest marks in the array is : " + marks[1]);
//         System.out.println("The 3rd highest marks in the array is : " + marks[2]);
//     }
// }

//PRINT ARRAY AS AN FUNCTION ARGUMENTS

// public class array {
//     public static void funArgs(int marks[]){
//         for(int i=0; i<marks.length;i++){
//             marks[i]=marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = {95,96,97};
//         funArgs(marks);

//         //PRINT OUR MARKS
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }

// LINEAR SEARCH

// public class array {
//     public static int LinearSearch(int number[],int key){
//         for(int i=0; i<number.length;i++){
//             if (number[i]==key) {
//                 return i;
//             }
//         }
//         //JAR INDEX FOUND HOT NASEL TR -1 RETURN KARAV

//         return -1;

//     }

//     public static void main(String[] args) {
//         int number[]={1,3,5,7,9,11,13,15};
//         int key=13;
//         int index=LinearSearch(number, key);
//         if (index==-1) {
//             System.out.println("The index was not found and me and my team was check all array but index not found any place");
//         }else{
//             System.out.println("Index was found and index number is the : " + index);
//         }
//     }
// }

//FIND THE LARGEST NUMBER FROM GIVEN ARRAY

// public class array {
//     public static int getLargenumber(int number[]){
//         int largest= Integer.MIN_VALUE; //MIN_VALUE MANJECH MINUS INFINITY

//         for(int i=0; i<number.length;i++){
//             if (largest < number[i]) {
//                 //JAB NUMBER INDEX MIN_VALUE SE BADA RAHEGA TO TAB WO LARGEST NO HI KAHALAYEGA
//                 largest = number[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int number[]={2,5,9,3,8,11,45,18,33,7};
//         System.out.println("The largest value in the given Array is : " + getLargenumber(number));
//     }
// }

//BINARY SEARCH

// public class array {
//     public static int binarySearch(int numbers[],int key){
//         int start = 0,  end=numbers.length-1;

//         while (start<=end) {
//             int mid=(start+end)/2;
//             //COMPARISON
//             if (numbers[mid]==key) {
//                 return mid;              
//             }
//             if (numbers[mid]< key) {
//                 start=mid + 1;
//             }
//             else{
//                 end=mid - 1;
//             }

//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12,14,15};
//         int key=8;
//         System.out.println("The index no is:" + binarySearch(numbers, key));
//     }
// }

//REVERSE AN ARRAY

// public class array {
//     public static void reverse(int number[]){
//         int first=0, last=number.length-1;

//         while (first < last) {
//             //swap
//             int temp=number[last];
//             number[last]=number[first];
//             number[first]=temp;

//             first++;
//             last--;

//         }
//     }

//     public static void main(String[] args) {
//         int number[]={1,3,5,6,3,2,5,6};
//         reverse(number);

//         for(int i=0; i<number.length;i++){
//             System.out.print(number[i] + " ");
//         }
//         System.out.println();
//     }
// }

//PAIRS IN ARRAY  (2,4) (2,6) (2,8) (4,6) (4,8) (6,8)

// public class array {
//     public static void printPairs(int number[]){
//         for(int i=0; i<number.length;i++){
//             int current=number[i];
//             for(int j=i+1; j<number.length;j++){
//                 System.out.print("(" + current + "," + number[j] + ")");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int number[]={2,4,6,8,10};
//         printPairs(number);

//     }
// }

//PRINT SUBARRAYS

// public class array {

//     public static void subArrays(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for(int j=i; j<numbers.length;j++){
//                 int end=j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10};
//         subArrays(numbers);
//     }
// }



//PRINT THE MAXSUBARRAYSUM     (USING BRUTE FORCE)

// public class array {

//     public static void maxSubArraysSum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;

//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                  currSum=0;

//                 for (int k = start; k <= end; k++) {
//                     currSum += numbers[k];
//                 }
//                 System.out.print(currSum + " ");
               

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Max Sum is the : " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, -2, 6, -1, 3 };
//         maxSubArraysSum(numbers);
//     }
// }


//ISKI TIME COMPLEXITY THODI KAM HAI
//PRINT THE MAXSUBARRAYSUM     (USING PREFIX ARRAY)
//YE FORMULA USE KRNA HAI   PREFIX(END)-PREFIX[START-1]



// public class array {

//     public static void maxSubArraysSum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[]=new int[numbers.length];

//         prefix[0]=numbers[0];
//         //calculate prefix array
//         for(int i=1; i<prefix.length;i++){
//             prefix[i]=prefix[i-1] + numbers[i];
//         }
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                  currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Max Sum is the : " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, -2, 6, -1, 3 };
//         maxSubArraysSum(numbers);
//     }
// }



//SOLVE SAME PROBLEM BY KADANE'S ALGORITHM
//ISKI TIME COMPLEXITY UPAR KE 2 NO ALGORITHM SE BEST HAI






//TRAPPING RAINWATER PROBLEM



public class array {
    public static void reverseArr(int[] nums , int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        reverseArr(nums, 0, nums.length-1);

        for(int i=0; i<=nums.length-1; i++){
            System.out.print(nums[i]+" ");
        }
    }
}