import java.util.*;
import java.lang.*;

/*
Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
 если нет, то вывести "Нет такого имени"
*/
public class Main {
    public static void main(String[] arg){
        System.out.println("Введите имя:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(str.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }
        else
            System.out.println("Нет такого имени");

    }
}
