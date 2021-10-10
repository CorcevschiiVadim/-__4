import java.util.Scanner;
public class Number12 {
    public static void main(String[] args){
        int counter = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
