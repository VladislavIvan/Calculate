package Calculator;

public class Oper {

    public static String calc (Number first, Number second, String action) throws Exception {

        int result;

        switch (action) {
            case "+" -> {
                result = first.getValue() + second.getValue();
            }

            case "-" -> result = first.getValue() - second.getValue();

            case "*" -> result = first.getValue() * second.getValue();

            case "/" -> result = first.getValue() / second.getValue();

            default -> throw new Exception("Ошибка, не допустимый символ операции, используйте только +, -, *, /");
        }

        if ((result < 1) && (first.getType().equals("Roman"))){
            throw new Exception("Ошибка, т.к. в римской системе нет отрицательных чисел");
        }
        if (first.getType().equals("Roman")) {
            return Conv.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}
