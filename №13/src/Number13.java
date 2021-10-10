import java.util.Scanner;
public class Number13 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число факториала: ");
        long N= in.nextInt();
        long fac = 1;
        for (long i = N; i > 0; i--){
            fac*=i;
        }
        System.out.println(fac);
    }
}
