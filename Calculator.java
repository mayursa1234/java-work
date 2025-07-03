
//8)CALCULATOR BY SWITCH STATEMENT
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("Enter Operator :");
        char operator=sc.next().charAt(0);
        
        switch(operator){
            case '+' : 
            System.out.println(a+b);
            break;
            case '-' : 
            System.out.println(a-b);
            break;
            case '*' : 
            System.out.println(a*b);
            break;
            case '/' : 
            System.out.println(a/b);
            break;
            case '%' : 
            System.out.println(a%b);
            break;

            default:System.out.println("just fun");
        }
    }


    
}





//7)SWITCH STATEMENT
// public class Test {

//     public static void main(String[] args) {
//         int number=4;
//         switch(number){
//             case 1 :
//             System.out.println("1 is correct ");
//             break;
//             case 2 :
//             System.out.println("2 is correct ");
//             break;
//             case 3 :
//             System.out.println("3 is correct ");
//             break;
//             case 4 :
//             System.out.println("4 is correct ");
//             break;
//             case 5 :
//             System.out.println("5 is correct ");
//             break;
//             default :System.out.println("koi bhi correct nahi hai");

//         }
//     }
// }





//6)PASS OR FAIL WITH TERNARY OPERATOR

// import java.util.*;
// public class Test {

//     public static void main(String[] args) {
//         int marks=92;
//         String subject = marks>=33 ? "Pass" : "Fail" ;
//         System.out.println(subject);
//     }
// }



//5)TERNARY OPERATOR EVEN OR ODD

// import java.util.*;
// public class Test {

//     public static void main(String[] args) {
//         int number =7;
//         String type=((number%2)==0)? "even":"odd";
//         System.out.println(type);
//     }
// }




// 4) LARGEST 3 NUMBER

// public class Test {

//     public static void main(String[] args) {
//         int a=10;
//         int b=32;
//         int c=82;

//        if (a>=b && a>=c) {
//             System.out.println("A is bigger");
//         } else if (b>=c) {
//             System.out.println("B is bigger");
//         }else{
//             System.out.println("The one man army royal boy c is bigger");
//         }
//     }
// }



//3)FIND THE EVEN OR ODD NUMBER

// public class Test {

//     public static void main(String[] args) {
//        int a=10;
//         if (a%2==0) {
//             System.out.println("A is the even number");
//         } else {
//             System.out.println("A is odd no");
//         }
//     }
// }


// 2)FIND LARGEST NUMBER

// public class Test {

//     public static void main(String[] args) {
//         int a=10;
//         int b=14;
//         if (a>=b) {
//             System.out.println("A is very big and the a is very powerful gangster in our city");
//         } else {
//             System.out.println("The b is bigger there build body look awesome");
            
//         }
//     }
// }


//1)ADULT OR TEENAGER

// public class Test {

//     public static void main(String[] args) {
//         int a=21;
//         if (a>=18) {
//             System.out.println("Mayur vijay sawarbandhe is adult");
//         } else {
//             System.out.println("mayur vijay sawarbandhe is not the adult");
//         }
//     }
// }



// public class Test {
//     public static void main(String[] args){
//         int x, y, z;
//         x = y = z = 2;
//         x += y;
//         y -= z;
//         z /= (x + y);
//         System.out.println(x + " " + y + " " + z);
//     }
// }