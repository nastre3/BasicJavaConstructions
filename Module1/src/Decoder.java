public class Decoder {
    public static void main(String[] args) {
        //Тернарный оператор
        int variable = 7;
        int res = variable > 10 ? variable - 10 : variable + 10;
        System.out.println(res);


        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';
        String trafficColor = "green";

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
        System.out.println(lightUp(trafficColor));
        //Задача 20.1.3
        int i = 10;
        do {i--;}
        while (i>1);
        System.out.println("Value i = " + i);

        //Задача 20.1.6
        //Java 12
        String trafficLight = "red";
        String result = switch (trafficLight) {
            case "red" -> "stop";
            case "green" -> "go";
            case "orange" -> "wait";
            default -> "broken";
        };
        System.out.println(result);

        if (trafficLight.equals("red")) {
            System.out.println("stop");
        } else if (trafficLight.equals("green")) {
            System.out.println("go");
        } else if (trafficLight.equals("orange")) {
            System.out.println("wait");
        } else {
            System.out.println("broken");
        }
    }

    private static String lightUp(String trafficColor) {
        String result = switch (trafficColor) {
            case "red" -> "stop";
            case "green" -> "go";
            case "orange" -> "wait";
            default -> "broken";
        };
        return result;
    }

    //Java 13
    private static String decode(char ch1) {
        String result = switch (ch1) {
            case 'h':
                yield "Hello";
            case 'i', 'm', 'k':
                yield "I can decode!";
            case 'b':
                yield "Bye!";
            default:
                yield "Invalid input";
        };
        return result;
    }

/*
    private static String decode(char ch1) {
        String result = "";
        switch (ch1) {
            case 'h':
                result = "Hello!";
                break;
            case 'i':
            case 'm':
            case 'k':
                result = "I can decode!";
                break;
            case 'b':
                result = "Bye!";
                break;
            default:
                result = "I don’t know these symbols:(";
        }
        return result;
    }
*/
}