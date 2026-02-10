import java.util.Scanner;

public class FrequencyTable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("How many dice?");
        int dice = in.nextInt();

        int[] array = new int[dice*6 + 1];

    
        for (int a = 0; a < 10000; a++){ //repeat rolls x amount of times
            //roll dice number of diceRoll and total them
            int total = 0;
            for (int i = 0; i < dice; i++){
                int diceRoll = (int)((Math.random() * 6) + 1);
                total = total + diceRoll;
            }
            //tally that total in array
            array[total] = array[total] + 1;
        }


        //traverse array + print values
        System.out.println("Times each value was rolled with " + dice + "dice over 10000 rolls");
        for (int b = dice; b <= (dice*6); b++){
            System.out.println(b + ": " + array[b]);
        }



    }
}
