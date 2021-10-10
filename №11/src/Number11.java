import java.util.Scanner;
public class Number11 {
    public static void main(String[] args){
        int array[] = new int[]{10, 5, 88, 1, 12, 120};
        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);
        System.out.println("Колличество значений вводимых пользователем: 6");
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if (inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
