package MODULE21_30;

public class PatternMatchingSwitch {

    public static void main(String[] args) {

        printType(100);
        printType("Hello Java");
        printType(12.5);
        printType(true);
    }

    static void printType(Object obj) {

        String result = switch (obj) {
            case Integer i -> "Integer value: " + i;
            case String s -> "String value: " + s;
            case Double d -> "Double value: " + d;
            case Boolean b -> "Boolean value: " + b;
            case null -> "Null value";
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}