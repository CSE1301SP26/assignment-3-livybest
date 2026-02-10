import java.util.Scanner;

public class SymmetricalImage {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("What is the length of the image?");
    int n = in.nextInt();
    System.out.println("What is the width of the image?");
    int m = in.nextInt();

    String[][] array = new String[n][m];
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
           array[i][j] = " "; 
        }
    }

for (int a = 0; a < ((n*m)/4); a++ ){
    int rowcoord = (int)(Math.random() * (n-1));
    int colcoord = (int)(Math.random() * (m-1));
    int colmirror = ((m-1) - colcoord);

    array[rowcoord][colcoord] = "*";
    array[rowcoord][colmirror] = "*";
}
   
   
   
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
           System.out.print(array[i][j]); 
        }
        System.out.println(" ");
    }









    }
}
