package lesson5;

public class EnhancedSwithchRunner {

    public static void main(String[] args) {
        String color = "green";
        int index = switch (color) {
            case "red" -> 1;
            case "ysllow" -> 2;
            case "green" -> 3;
            default -> -1;
        };
        System.out.println(index);
    }
}
