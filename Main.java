import java.util.Scanner;
     // задание 1
    // public class Main {

         //public static void main(String[] args) {
             // write your code here
       //  }
    // }

public class Main {
     //задание 2

    public static void main(String[] args) {
        int aa=543232;
        byte bb=115;
        short cc=500;
        long  dd=215112231;
        char zz='v';
        float tt=5.8f;
        double ww=6.9;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
        System.out.println(zz);
        System.out.println(tt);
        System.out.println(ww);


      // задание 3

        System.out.println("Считаем a * (b + (c / d)) ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите а");
        int a = scanner.nextInt();
        System.out.println("введите b");
        int b = scanner.nextInt();
        System.out.println("введите c");
        int c = scanner.nextInt();
        System.out.println("введите d");
        int d = scanner.nextInt();
        int result= a * (b + (c / d));
        System.out.println("Получилось =" +result);


        // задание 4
        System.out.println("Проверяем что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false");
        System.out.println("введите первое число");
        int q = scanner.nextInt();
        System.out.println("введите второе число");
        int w = scanner.nextInt();
        int result2=q+w;
        if (result2>=10 & result<20){
            System.out.println("Cумма ="+result2 +" лежит между 10 и 20ю");
        } else {
            System.out.println("Cумма ="+result2 +" и не лежит между 10 и 20ю");
        }

       // задание 5
        System.out.println("Положительное число или отрицательное?");
        System.out.println("Введите число");
        int result1=scanner.nextInt();
        if (result1>=0){
            System.out.println(result+"=Число положительное");
        } if (result1<0){
            System.out.println(result1+"=Число отрицательное ");
        }

        // задание 6
        System.out.println("Введите число");
        int a1=scanner.nextInt();
        if (a1<0) {
            System.out.println("Число отрицательное");
        }

        // задание 7

         //static void name1(); {
            // на этом задании не читается переменная s
            System.out.println("Как вас зовут?");
            String s = scanner.nextLine();
            System.out.println("Привет" + s);
       // }


          // задание 8
            System.out.println("Введите год");
            int year=scanner.nextInt();
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не высокосный");
            else System.out.println(year + " г. высокосный");


    }
}