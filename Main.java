 // второе урок/ задание 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 // С помощью цикла и условия заменить 0 на 1, 1 на 0
public class Main {
    public static void main(String[] args) {

        int[] massiv = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxmasiv = massiv.length;
        for (int i = 0; i < maxmasiv; i++) {
            System.out.print(i + "-" + massiv[i] + " ");
        }
        System.out.println("    ");
        for (int i = 0; i < maxmasiv; i++) {
            if (massiv[i] == 1) {
                massiv[i] = 0;
            } else massiv[i] = 1;
        }
        for (int i = 0; i < maxmasiv; i++) {
            System.out.print(i + "-" + massiv[i] + " ");
        }
    }
   // задание 2   Задать пустой целочисленный массив размером 8.
   // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    public static void mass2() {

        int[] arr = new int[8];
        int j = 0;
        int mAss2 = arr.length;
        for (int i = 0; i < mAss2; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < mAss2; i++, j = j + 3) {
            arr[i] = j;
        }
        for (int i = 0; i < mAss2; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
    }

    //задание 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2
    public static void mass3() {
        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas3.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas3[i] < 6){
                mas3[i] = mas3[i] * 2;
            }
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + mas3[i] + " ");
        }

    }
    // задание 4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     // и с помощью цикла(-ов) заполнить его диагональные элементы единицами

     public static void mass4(){
         int[][] mas4 = new int[4][4];
         for (int i = 0; i < mas4.length; i++) {
             for (int j = 0, j2 = mas4[i].length; j < mas4[i].length; j++, j2--) {
                 if (i == j || i == (j2 - 1)) mas4[i][j] = 1;
                 System.out.print(mas4[i][j] + " ");
             }
             System.out.print("\r\n");
         }
     }
     // задание 5   Задать одномерный массив и найти в нем минимальный и максимальный элементы

     public static void mass5(){
         int[] mas5 = {23, 5, 13, 24, 2, 8, 5, 3, 3, 8, 9, 21};
         int min = mas5[0], max = mas5[0], maxId = 0, minId = 0;
         for (int i = 0; i < mas5.length; i++) {
             if (mas5[i] > max) {
                 max = mas5[i];
             }
             if (mas5[i] < min) {
                 min = mas5[i];
             }
         }
         System.out.println("Максимальный элемент  "  + max);
         System.out.println("Минимальный элемент " + min);
     }
}