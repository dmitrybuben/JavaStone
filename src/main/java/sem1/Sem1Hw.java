package sem1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Составить частотный словарь элементов одномерного массива
        Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.
        Пример:
        Есть набор данных
        { 1, 9, 9, 0, 2, 8, 0, 9 }
        частотный массив может быть представлен так:

        0 встречается 2 раза
        1 встречается 1 раз
        2 встречается 1 раз
        8 встречается 1 раз
        9 встречается 3 раза
        ---------------------
        Методы:
        1. Cчитывание кол-ва эл-тов от пользователя: (string) --> int
        2. Создания массива: Create (int) --> void
        3. Метод заполнения случайными числами: fill(int[]) --> void)
        4. Метод поиска числа повторений: find(int[]) --> int[]
        5. Метод печати варианты: print(int[]) --> string
*/
public class Sem1Hw {
    public static void main(String[] args) {
        int size = readSize();
        int[]arr = create(size);
        fill(arr);
        int[]count = find(arr);
        System.out.println(Arrays.toString(count));
        print(count);
        sort(arr, count);
        System.out.println(Arrays.toString(arr));
    }

    public static int readSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        return size;
    }

    public static int[] create(int size){
        int[]array = new int[size];
        return array;
    }

    public static int[] fill(int[]arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,11);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] find(int[]arr){
        int max = 10;
        int[]count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] +=1;
        }
        return count;
    }

    public static void print(int[]count){
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                System.out.println(i + " встречается " + count[i] + " раз ");

            }
        }
    }

    // Optional method
    public static int[] sort(int[]arr, int[]count){
        int arrayindex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[arrayindex] = i;
                arrayindex ++;
            }
        }
        return arr;
    }
}


