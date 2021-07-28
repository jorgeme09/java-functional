package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionSupplier.get());
    }

    static String getDBConnection() {
        return "https://localhost:2552/users";
    }

    static Supplier<String> getDBConnectionSupplier = () -> "https://localhost:2552/users";
}
