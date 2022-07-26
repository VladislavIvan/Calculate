package Calculator;

import java.util.Scanner;

public class Start {

    public static void main(String[] args){
        Number num1;
        Number num2;
        String res;

        System.out.println("Калькулятор работает с римскими числами от I до X и целыми арабскими числами от 0 до 10.\n" +
                "Вы можете сложить два числа, выполнить вычитание, деление, умножение двух чисел.\n" +
                "Например введите выражение 2 + 2 нажмите Enter, 4 - 3, 5 * 6, 8 / 7.\n" +
                "Первое число пробел арифметический знак пробел второе число.\n"+
                "Результатом операции деления является целое число, остаток отбрасывается");

        try (Scanner scan = new Scanner(System.in)){
            String expr = scan.nextLine(); // сбор введённых данных
            String[] symb = expr.split(" "); // разделение на подстроки за счёт пробелов
            Entry.Check(symb); // передача в класс Entry в метод Check проверка количество введённых символов
            num1 = Entry.arabOrRom(symb[0]); // присвоение первому числу значения
            num2 = Entry.arabOrRom(symb[2]); // присвоение второму числу значения
            Entry.CheckInput(num1, num2); // присвоение первому числу значения
            res = Oper.calc(num1, num2, symb[1]); // вычисление передача в класс Oper в метод calc
            System.out.println("Результат вычислений " + res);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Программа закончила свою работу. До скорых встреч");

    }
}
