import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int func0(int a, String v, int b) throws IOException {  //функция
        switch (v){
            case "+":
                return (a + b);
            case "-":
                return (a - b);
            case "*":
                return (a * b);
            case "/":
                return (a / b);
        }
        throw new IOException();
    }

    public static int func1(String var_1) throws IOException {  //функция
        switch (var_1){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите выражение");
        String string = s.nextLine();
        System.out.println("вы ввели " + string);

        String[] words = string.split(" ");

        String a = words[0];
        String v = words[1];
        String b = words[2];

        if (words.length != 3) { // Проверка на количество выражений
              throw new IOException();
            }

        if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10")) {
            if (b.equals("1") || b.equals("2") || b.equals("3") || b.equals("4") || b.equals("5") || b.equals("6") || b.equals("7") || b.equals("8") || b.equals("9") || b.equals("10")) {
                System.out.println("Арабские числа");
                int k = Integer.parseInt(a);
                int j = Integer.parseInt(b);
                int answer = func0(k, v, j);
                System.out.print("Ответ = "+ answer);
                }
            else {
                throw new IOException();
            }
        } else if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")){
            if (b.equals("I") || b.equals("II") || b.equals("III") || b.equals("IV") || b.equals("V") || b.equals("VI") || b.equals("VII") || b.equals("VIII") || b.equals("IX") || b.equals("X")){
                System.out.println("Римские цифры");
                int k = func1(a);
                int j = func1(b);
                int answer = func0(k, v, j);
                if (answer <= 0){
                    throw new IOException();
                }else{
                    String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
                    for (int i = 0; i < roman.length; i++){
                        if(i==answer){
                            System.out.print("Ответ = "+ roman[i-1]);
                        }
                    }
                }
            } else {
                throw new IOException();
            }
        } else {
                throw new IOException();
            }
    }
}