// import java.util.*;
// public class condition {
//     public static void main(String[] args){
//         // input
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         // if else condition
//         if (age >= 18){
//             System.out.println("Adult");

//         }else{
//             System.out.println("Not adult");
//         }
//         }
//     }
    
// even or odd codition

// import java.util.*;
// public class condition {
//     public static void main(String[] args){
//         // input
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         // if else condition to check even or odd
//         if (x%2==0){
//             System.out.println("Even");

//         } else {
//             System.out.println("Odd");
//         }
//         }
//     }

// larger, lesser, and equal condition

//import java.util.*;
//public class condition{
    // public static void main(String[] args){
    //     // input
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     // if, else condition
    //     if (a==b){ 
    //         System.out.println("Both are equal");  
    //     } else if (a>b){
    //             System.out.println("a is greater thamn b");
    //         } else{
    //             System.out.println("Lesser than b");
    //         }
    //     }
    // }
    
// even, or odd condition

// import  java.util.*;
// public class condition{
//     public static void main(String[] args){
//         //input
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     if (a%2==0){
//         System.out.println("Even number");
//     } else if (a%2!=0){
//         System.out.println("Odd number");
//     }
//     }
//}

// switch condition

// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         //input
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         switch(button){
//             case 1 : System.out.println("hello");
//             break;
//             case 2 : System.out.println("Namste");
//             break;
//             case 3 : System.out.println("Bonjour");
//             break;
//             default : System.out.println("Invalid button");
//         }

//     }

//}

//print weak days in switch method

// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         // input
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         switch(n){
//             case 1 : System.out.println("Monday");
//             break;
//             case 2 : System.out.println("Tuesday");
//             break;
//             case 3 : System.out.println("Wednusday");
//             break;
//             case 4 : System.out.println("Thursday");
//             break;
//             case 5 : System.out.println("Friday");
//             break;
//             case 6 : System.out.println("Sutarday");
//             break;
//             case 7 : System.out.println("Sunday");
//             break;
//         } 

//     }
//}

// Ask the user to enter the number of the month & print the name,
//of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ &
//so on.

import java.util.*;
public class condition{
    public static void main(String[] args){
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // switch method
        switch(n){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("August");
            break;
            case 9 : System.out.println("September");
            break;
            case 10 : System.out.println("October");
            break;
            case 11 : System.out.println("November");
            break;
            case 12 : System.out.println("December");
            break;

        }
    }
}

