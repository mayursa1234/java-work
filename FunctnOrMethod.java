//****function wo hota hai usme pura kam krte hai hai aur usko main return krta hai
// ****FUNCTION KO LIKHTE VAKT PUBLIC STATIC VAISA HI LIKHNA HOTA HAI BUT RETURN TYPE USME VOID, INT AUR RETURN TYPE LIKHTE HAI
// ****RETURN TYPE LIKHNE KE BAAD FUNCTION NAME LIKHNA PADTA HAI FUNCTION NAME AISA NAME LIKHNA PADTA HAI JO FUNCTION ME KAM KR RHE HAI USSE RELATED HO EXAMPLE HELLO WORLD PRINT KR RHE HAI TO FUNCTION NAME PRINTHELLOWORLD RKH SKTE HAI
//JAB APN KUCH RETURN KRTE HAI TO APNE KO RETURN LIKHNA PADTA HAI PR VOID RETURN TYPE HOGA TO PROBLEM NAHI HAI LIKHA NAHI LIKHA TO BHI PR JAB RETURN TYPE INT HAI TO RETURN LIKHNA PADEGA AUR APN NE KITNA RETURN KIYA WO BHI LIKHAN PADTA HAI 
//AUR SAB LIKHANE KE BAD APNE KO MAIN ME FUNCTION KO CALL KRNA PDTA HAI AS A FUNCTION NAME AND ()  EX.FUNCTION();
//EK CLASS ME MULTIPLE FUNCTION HO SKTE HAI JAISE EK HELLOWORLD PRINT KIYA AUR HAME SUM BHI KRNA HAI TO KR SKTE HAI SUMTWONUMBER FUNCTIONN BANAKR

// 1)
// public class FunctnOrMethod {
//     public static void Function(){
//        System.out.println("hello World");

//     }
//     public static void main(String[] args) {
//        Function();
//     }
// }

// 2) ISME RETURN TYPE INT HAI TO RETURN JITNE BAR KIYA UTNA RETURN LIKHNA PADA
// public class FunctnOrMethod {
// public static int HelloWorld(){
//     System.out.println("hjw");
//     System.out.println("hjw");
//     System.out.println("hjw");
//     return 3;
// }

//     public static void main(String[] args) {
//       HelloWorld();  
//     }
// }

//YE METHOD HAI JO SIRF FUNCTION ME HI WORK KRTI HAI BINA PARAMETER AB AGLA YAHI PROGRAM PARAMETERS KE SATH SOLVE KRENGE

// import java.util.*;
// public class FunctnOrMethod {
//     public static void CalculateSum(){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum = a + b;
//         System.out.println("The Sum is" + sum);
//     }

//     public static void main(String[] args) {
//         // HelloWorld();
//         CalculateSum();
//     }
// }

//4)AB YE UPAR WALA HI PROGRAM PARAMETERS KE SATH SOLVE KRENGE
// import java.util.*;
// public class FunctnOrMethod {
//     public static void CalculateSum(int a,int b){
//         int sum = a + b;
//         System.out.println("The sum of a and b is the : "+ sum );
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         CalculateSum(a,b);
//     }
// }

//5) VALUE CHANGE KAISE KRE YANI 2 VARIABLE HAI UNKI VALUE EK MEK SE EXCHANGE HO JAYE USKA CODE DEKHTE HAI

// public class FunctnOrMethod {

//     public static void main(String[] args) {
//         //swap- value exchnge
//         int a=5;
//         int b=10;

//         //swapping ke liye ek temporary keyword lena padta hai usme a ki value store krte hai fir b ki value a me store krte hai fir temp ki value b me 

//         int temp=a;  //is line ka arth a ki value temp me ja rhi hai a=5 --> temp=5
//          a=b;        //is line ka arth b ki jo value hai wo a me ja rhi hai  b=10 --> a=10
//          b=temp;     //is line ka arth a ki value temp me gayi yani temp ki 5 value wo ab b me jayeggi

//         System.out.println("print the value of a: " + a);
//         System.out.println("print the value of b: " + b);
//     }
// }

//AB UPAR WALE PROGRAM KO YANI SWAPPING WALE PROBLEM KO FUNCTION PARAMETERS KI HELP SE KRTE HAI

// public class FunctnOrMethod {
//     public static void Swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;

//        System.out.println("print the value of a: " + a);
//        System.out.println("print the value of b: " + b);
//     }

//     public static void main(String[] args) {
//         int a=5; 
//         int b=10;
//         Swap(a, b);

//     }
// }

//FIND THE PRODUCT OF A & B

//1ST TECHNIQUES

// public class FunctnOrMethod {
//     public static int Multiply(int a, int b){
//       int multiply= a*b;
//        System.out.println(multiply);
//        return multiply;
//     }

//     public static void main(String[] args) {
//         int a=3;
//         int b=5;
//         Multiply(a,b);
//     }
// }

//2ND TECHNIQUES(DIRECT)

// public class FunctnOrMethod {
//     public static int Multiply(int a, int b){
//       int multiply= a*b;
//        return multiply;
//     }

//     public static void main(String[] args) {
//         int prod=Multiply(3,5);
//         System.out.println(prod);
//     }
// }

//FIND THE FACTORIAL...

// public class FunctnOrMethod {
    // public static int Factorial(int n){
    //     int f=1;
    //     for(int i=1; i<=n; i++){
    //         f = f * i;
    //         System.out.println(f);
    //     }
    //     return f;
    // }

//     public static void main(String[] args) {
//         Factorial(11);   

//         //APN FUNCTION ME PRINT KRNE SE ACCHA MAIN ME HI PRINT KR SKTE HAI YAISE DEKHO 
//        // ----SOUT(Factorial(11)); 
//         //ISSE CALL BHI HO JAYEGA AUR FACTORIAL PRINT BHI HO JAYEGA
//     }
// }





//FIND THE BINOMIAL COFFICIENT  FORMULA=   NCR=  (N)FACT / (R)FACT * (N - R)FACT

// public class FunctnOrMethod {
//      public static int factorial(int n){
//         int fact=1;
//         for(int i=1; i<=n; i++){
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static int binCoefficient(int n, int r) {

//         int a = factorial(n);
//         int b = factorial(r);
//         int c = factorial(n - r);

//         int bin_coe = a / (b * c);
//         return bin_coe;
//     }

//     public static void main(String[] args) {

//         System.out.println(binCoefficient(5,2));
//     }
// }



//FUNCTION OVERLOADING USING PARAMETERS- MEANS SAME FUNCTION NAME BUT THEIR PARAMETERS ALSO DIFFERENT THAT IS CALLED FUNCTION OVERLOADING

// public class FunctnOrMethod {

//     public static int sum(int a, int b){
//         int add = a+b;
//         return add;
//     }

//     public static int sum(int a, int b, int c){
//         int add = a + b + c;
//         return add;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(22, 23));
//         System.out.println(sum(15, 15, 15));
//     }
// }




// FUNCTION OVERLOADING USING DATATYPES

// public class FunctnOrMethod {

//     public static int sum(int a, int b){
//         int add = a+b;
//         return add;
//     }

//     public static float sum(float a, float b, float c){
//         float add = a + b + c;
//         return add;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(22, 23));
//         System.out.println(sum(15.3f, 15.32f, 15.0f));
//     }
// }





//PRINT GIVEN NO IS PRIME OR NOT

// public class FunctnOrMethod {
//     public static boolean isPrime(int n){
//         boolean isPrime=true;

//         for(int i=2; i<=n-1; i++){
//             if ( n % i == 0) {
//                isPrime=false; 
//                break;
//             }         
//         }
//         return isPrime;
//     }

//     public static void main(String[] args) {
//         System.out.println(isPrime(11));
        
//     }
// }



//PRINT PRIME NUMBER UPTO 20

// public class FunctnOrMethod {
//     public static void Prime(int n){
//         for(int i=2; i<=n; i++){
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
                
//             }
//         }
//         System.out.println();

//     }

//     public static void main(String[] args) {
//         Prime(158);
//     }
// }





//PRINT BINARY NUMBER TO DECIMAL NUMBER

public class FunctnOrMethod {
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;

        while (binNum>0) {
           int lastDig=binNum % 2;
           decNum = decNum + (lastDig * (int)Math.pow(2,pow));

           pow++;
           binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " is = " + decNum);

    }

    public static void main(String[] args) {
        binToDec(100);
    }
}