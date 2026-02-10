import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //ask about array
        System.out.println("How big should the array be?");
        int arraySize = in.nextInt();
        int[] Array = new int[arraySize];
        System.out.println("Enter the first value in the array:");
        Array[0] = in.nextInt();
            for (int i = 1; i <= arraySize - 1; i++){
                System.out.println("Enter the next value in the array");
                Array[i] = in.nextInt();
            }
            System.out.println("Given values: ");
            for (int valueBefore : Array){
                System.out.print(valueBefore + ", ");
            }
        //sort numbers by traversing array
        for (int a = 0; a < arraySize; a++){
            for (int b = 1; b < arraySize; b++){
                if (Array[b - 1] > Array[b]){
                    int hold = Array[b-1];
                    Array[b-1] = Array[b];
                    Array[b] = hold;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Sorted values: ");
            for (int valueAfter : Array){
                System.out.print(valueAfter + ", ");
            }










    }
}
