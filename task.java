// Написать программу вычисления n-ого треугольного числа 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 
// 120, 136, 153, 171, 190, 210, 231, 253, 276, 300, 325, 351, 
// 378, 406, 435, 465, 496, 528, 561, 595, 630, 666)
import java.util.Scanner;

public class task{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число для которого требуется вычисление треугольного числа: ");
        var number = Scanner.nextInt();
        Scanner.close();
        System.out.println("Результат вычисления будет равен  " + triangular(number) + "\n");
    }
    public static int  triangular(int num) {
        int res = (num*(num+1))/2;
        return res;
    }
}