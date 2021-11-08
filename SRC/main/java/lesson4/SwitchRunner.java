package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionSphetaphore("жёлтый"));
        System.out.println(getSolutionSphetaphore("зеленый"));
        System.out.println(getSolutionSphetaphore("красный"));
    }

    public static String getSolutionSphetaphore(String color) {
        String result;
        switch (color) {
            case "красный": {
                result = "Проход запрешен";
                break;
            }
            case "жёлтый": {
                result = "Будь внимателен";
                break;
            }
            case "зеленый": {
                result = "Проход разрешен";
                break;
            }
            default: {
                result = "";
                break;
            }

        }
        return result;
    }
}

