import java.util.*;
import java.lang.*;

/*
Составить алгоритм: если введенное число больше 7, то вывести “Привет”

*/
public class Main {
    public static void main(String[] arg){
        try{
            System.out.println("Введите число:");
            Scanner input = new Scanner(System.in);
            Integer num = input.nextInt();
            if(num > 7){
                System.out.println("Привет");
            }

        }
        catch (Exception e){
            System.out.println("Exception: Проверьте коректность введенных данных");
        }

    }
}
