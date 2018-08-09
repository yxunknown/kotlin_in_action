package chapter3;

/**
 * @author mevur
 * @date 18/8/9
 **/
public class ExtensionTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kotlin?");

        System.out.println(Extension_propertiesKt.getLastChar(sb));

        Extension_propertiesKt.setLastChar(sb, '!');

        System.out.println(Extension_propertiesKt.getLastChar(sb));

        show(args);
        show("java", "kotlin", "c++");
    }

    public static void show(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }


}
