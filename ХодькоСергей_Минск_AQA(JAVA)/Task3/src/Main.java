import java.util.*;
import java.lang.*;

/*
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
*/
public class Main {
    public static void main(String[] arg){
        try{
            System.out.println("Введите элементы массива чрез пробел:");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            StringTokenizer st = new StringTokenizer(str, "\t\n\r ");//разбиваем на лесемы
            Integer[] arr = new Integer[st.countTokens()];
            int i = 0;
            while (st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
                i++;
            }
            System.out.println("элементы массива кратные 3:");

            for(int j = 0; j  < arr.length; j++) {
                if(arr[j]%3 == 0 & arr[j] != 0){
                    System.out.print(arr[j] + " ");
                }
            }

        }
        catch (Exception e){
            System.out.println("Error: Проверьте коректность введенных данных");
        }

    }
}