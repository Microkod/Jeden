package Java_PP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apsik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String userText = scanner.nextLine();
        Pattern pattern = Pattern.compile(".*(a+)( )(psik).*");
        Matcher matcher = pattern.matcher(userText);
        if (matcher.matches()){
            System.out.println("Gotowe");
        } else {
            System.out.println("zły tekst");
        }

    }
}
