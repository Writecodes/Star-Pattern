//.....................................printing the star pattern...................................
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i, j;
        int k;
        for (i = 1; i <= 4; i++) {
            k=i;
            for (j=1;j<=7;j++) {
                if (j >= (5 - i) && j <= (3 + i)) {
                    System.out.print(k);
                    if (j < 4)
                        k++;
                    else
                        k--;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

//.......................printing Floyd's Triangle............................
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int rows=sc.nextInt();
//         int i, j, number = 1;
//         for (i = 1; i <= rows; i++) {
//             for (j = 1; j <= i; j++) {
//                 System.out.print(number+" ");
//                 ++number;
//             }
//             System.out.println("");
//         }
//     }
// }

//....................Printing Pascal's triangle..............................
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int rows=sc.nextInt(); 
//          int i, j, spaces, n = 1;
//         for (i = 0; i <= rows; i++) {
//             for (spaces = 1; spaces <=rows - i; spaces++)
//                 System.out.print(" ");
//             for (j = 0; j <= i; j++) {
//                 if (i == 0 || j == 0)
//                     n = 1;
//                 else
//                     n = (n * (i - j + 1)) / j;
//                 System.out.print(n + " ");
//             }
//             System.out.print("\n");
//         }
//     }
// }
