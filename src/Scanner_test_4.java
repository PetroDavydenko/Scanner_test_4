import java.util.Scanner; //import Scanner

public class Scanner_test_4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String phrase1 = a.nextLine();
        String phrase2 = a.nextLine();
        System.out.println(phrase1 + " " + phrase2);

    }
}
