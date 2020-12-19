import java.util.*;
import java.io.*;

class Main {

    public static String LongestWord(String sen) {
        StringBuilder stringBuilder = new StringBuilder();
        String max = "";
        for (char i : sen.toCharArray()) {
            if ((i <= 'z' && i >= 'a') || (i <= 'Z' && i >= 'A')) {
                stringBuilder.append(i);
            } else if (stringBuilder.length() == 0) {
                continue;
            }
            else {
                stringBuilder = new StringBuilder();
            }
            if (max.length() < stringBuilder.length()) {
                max = stringBuilder.toString();
            }
        }
        if (max.length() == 0) {
            return "";
        } else return max;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}