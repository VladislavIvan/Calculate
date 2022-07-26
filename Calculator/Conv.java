package Calculator;

import java.util.ArrayList;
import java.util.TreeMap;

public class Conv {

    static int toArabNum(String number) {
        ArrayList<String> Roman = new ArrayList<String>();
        Roman.add( "Ноль");
        Roman.add( "I");
        Roman.add("II");
        Roman.add("III");
        Roman.add("IV");
        Roman.add("V");
        Roman.add("VI");
        Roman.add("VII");
        Roman.add("VIII");
        Roman.add("IX");
        Roman.add("X");
        return Roman.indexOf(number);
    }

    static String toRomanNumber(int number) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        int a = map.floorKey(number);
        if (number == a) {
            return map.get(number);
        }
        return map.get(a) + toRomanNumber(number - a);

    }
}
