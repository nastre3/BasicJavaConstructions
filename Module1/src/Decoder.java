public class Decoder {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
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