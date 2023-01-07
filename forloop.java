// public class forloop {
//   public static void main(String[] args){
//     // for loops
//     for(int counter = 0; counter<5; counter = counter+1){
//         System.out.println("Hello world");
//     }
//   }  
//}

// print first 10 natural number.

// public class forloop{
//     public static void main(String[] args){
//         // for loop
//         for(int counter = 1; counter<11; counter = counter+1){
//             System.out.println(counter);
//         }
//     }
//}
// print first 10, n natural number in same line.

// public class forloop{
//     public static void main(String[] args){
//         // for loop
//         for(int i = 1; i<11; i = i+1){
//             System.out.print(i+" ");
//             System.out.print(i+" ");
//         }
//     }
//}

// print the sum of frist n natural number.

// import java.util.*;
// public class forloop{
//     public static void main(String[] args){
//         // input
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // for loop
//         int sum = 0;
//         for(int i = 1; i<=n; i = i+1){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
//}

// print the table of any integer, number input by the user

// import java.util.*;
// public class forloop{
//     public static void main(String[] args){
//         // input
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1; i<11;i = i+1){
//             System.out.println(i*n);
//         }
//     }
//}

// print the sum of odd number.
// import java.util.*;
// public class forloop{
//     public static void main(String[] args){
//         // input
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // for loop
//         int sum = 0;
//         for(int i = 1; i<=n; i = i+2){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//         }
//     }

// print the odd numbers in the same line from the user.
import java.util.*;
public class forloop{
    public static void main(String[] args){
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for loop
        for(int i = 1; i<=n; i = i+2){
            System.out.print(i+" ");
        }
    }
}

