package chapter3;

import org.jetbrains.annotations.NotNull;

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

    public static void show(@NotNull String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }


}
