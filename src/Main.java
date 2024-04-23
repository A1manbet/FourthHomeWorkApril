import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> name1 = new ArrayList<>();
        name1.add(s.nextLine());
        name1.add(s.nextLine());
        name1.add(s.nextLine());
        name1.add(s.nextLine());
        name1.add(s.nextLine());
        System.out.println(name1);

        ArrayList<String> name2 = new ArrayList<>();
        name2.add(s.nextLine());
        name2.add(s.nextLine());
        name2.add(s.nextLine());
        name2.add(s.nextLine());
        name2.add(s.nextLine());
        System.out.println(name2);

        Collections.reverse(name2);

        ArrayList<String> name3 = new ArrayList<>();

        for (int i = 0; i < name1.size(); i++) {
            name3.add(name1.get(i));
            name3.add(name2.get(i));
        }
        System.out.println(name3);

        Collections.sort(name3, (a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println(name3);

    }
}