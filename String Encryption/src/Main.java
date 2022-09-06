import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 'e' to encrypt, or 'd' to decrypt");
            char eORd = scan.next().charAt(0);


            if (eORd == 'e') {
                System.out.println("Enter phrase for encryption");
                String phrase = scan.next();
                int i = 0;

                if (phrase.length() > 1) {
                    String firstChar = "" + phrase.charAt(i);
                    String replace = "" + phrase.charAt(i + 1) + phrase.charAt(i) + phrase.charAt(phrase.length() - 1) + "boo";
                    String encrypt = phrase.replaceAll(firstChar, replace) + "boo";
                    System.out.println(encrypt);
                } else {
                    String encrypt = phrase + "boo" + phrase + phrase + "boo";
                    System.out.println(encrypt);
                }
                break;
            } else if (eORd == 'd') {
                System.out.println("Enter phrase for decryption");
                String phrase = scan.next();
                int i = 0;

                if (phrase.length() > 9) {
                    String noBoo = phrase.replaceAll("boo", "");
                    String secChar = "" + phrase.charAt(1);
                    String decrypt = noBoo.replaceAll(phrase.substring(0, 3), secChar);
                    System.out.println(decrypt);
                } else {
                    String decrypt = "" + phrase.charAt(0);
                    System.out.println(decrypt);
                }


                break;
            } else {
                System.out.println("Invalid selection, please try again");
            }
        }
    }

}