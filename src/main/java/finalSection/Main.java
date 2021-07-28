package finalSection;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Consumer<String> callback = person -> System.out.println(person + " has no lastname");
        hasLastName("Jorge", null, callback);

        boolean hasFistNameResult = hasFistName(null, "Martinez", person -> {
            System.out.println("No firstname!!!!");
            return false;
        });

        System.out.println(hasFistNameResult);
    }

    static boolean hasFistName(String firstName, String lastName, Function<String, Boolean> callback) {
        if(firstName != null) {
            return true;
        } else {
            callback.apply(firstName);
            return false;
        }
    }

    static void hasLastName(String firstName, String lastName, Consumer <String> callback) {
        System.out.println(firstName);

        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
