package sem1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Уточнение задачи
        2. Обсуждение
        3. Выделение подзадач
        4. Методы:
        а) Создания массива: Create (int) --> void
        б) Метод печати: print(int[]) --> void
                        print(int[]) --> string
        в1) Метод заполнения случайными числами: fill(int[]) --> void
        в2) Метод заполнения, считывая данные от пользователя
        в3) Метод заполнения, данные в файле
        г) считывание кол-ва эл-том от пользователя
        (void) --> int
        (string) --> int
        5. Алгоритм
        6. Код методов
        7. Тестирование
        8. Клиентский код
        9. Каждый пункт вносится в GIT
        */

        // Код просто как пример

        int[] a = new int[0];
        voo(a);

        // Клиентский код - собирает все методы в одном месте

        int size = getValue("Введите размер " );
        int[] bar = create(size);
        fill(bar);
        print(bar);

    }



    static int[] create(int count){

        return null;
    }

    static void print(int[]array){

    }

    static void fill(int[]array){

    }

    static int getValue(String text){
        return -1;
    }


    static void voo(int[]array){
        System.out.println("Enter count");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        array = new int[count];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        scanner.close();
    }
}