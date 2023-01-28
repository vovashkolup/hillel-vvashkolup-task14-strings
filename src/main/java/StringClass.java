import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringClass {


    public int findSymbolOccurance(String str, char ch) {
        int counter = 0;
        for (char temp : str.toCharArray()) {
            if (temp == ch) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public void findWordPosition(String source, String target) {
        if (source.contains(target)) {
            System.out.println(target + " is part of " + source);
        } else {
            System.out.println("no connection in this words, -1");
        }
    }

    public String stringReverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt((str.length() - 1) - i));
        }
        System.out.println(result);
        return result.toString();
    }

    public boolean isPalindrome(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt((str.length() - 1) - i);
        }
        System.out.println(result.equalsIgnoreCase(str));
        return result.equalsIgnoreCase(str);
    }


    public void game(String[] strings) {
        Random random = new Random();
        int select = random.nextInt(strings.length - 1);
        String secretWord = Array.get(strings, select).toString();
        System.out.println(secretWord);

        boolean isCorrect = false;
        Scanner scanner = new Scanner(System.in);
        StringBuilder guesser = new StringBuilder("###############");

        System.out.println("Welcome to the game!" + "\n" + Arrays.toString(strings) + "\nWhich word I guessed?");

        while (!isCorrect) {
            String temp = scanner.nextLine();
            if (temp.equals(secretWord)) {
                System.out.println("Congratulations, you guessed it!");
                isCorrect = true;
            } else {
                System.out.println("Try again");
            }
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == secretWord.charAt(i)) {
                    guesser.setCharAt(i, secretWord.charAt(i));
                }
            }
            System.out.println(guesser);
        }


    }


}
