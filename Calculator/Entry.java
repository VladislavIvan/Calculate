package Calculator;

public class Entry {

    static void Check (String[] symb) throws Exception{

        if (symb.length < 3) throw new Exception("Неправильный ввод данных. Первое число, пробел, арифметическое действие, пробел, второе число.");
        if (symb.length > 3) throw new Exception("Неправильный ввод данных. Избыточность данных. Следуйте инструкции");
    }

    static Number arabOrRom(String symb) throws Exception {

        int cyfra;
        String arabOrRom;

        try {
            cyfra = Integer.parseInt(symb); //преобразование String в int
            arabOrRom = "Arabic";
        }catch (NumberFormatException e) {
            cyfra = Conv.toArabNum(symb);
            arabOrRom = "Roman";
        }

        if (cyfra < 1 || cyfra > 10) {
            throw new Exception("Неправильный ввод данных, вводите числа от I до X");
        }

        return new Number(cyfra, arabOrRom);
    }

    static void CheckInput (Number num1, Number num2) throws Exception {
        if (!(num1.getType().equals(num2.getType()))) {
            throw new Exception("Неправильный ввод данных, нельзя вводить одновременно арабские и римские цифры");
        }
    }


}
