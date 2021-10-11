public class App {
    public static void main(String[] args) {
        int i = 10;
        int t = 10;
        if (i >= t) {
            System.out.println(i + " is greater or equal than " + t);
        } else if (i == t) {
            System.out.println(i + "is equal " + t);
        } else {
            System.out.println(i + "is lower than " + t);
        }

        if (i >= t) {
            System.out.println(i + " is greater or equal than " + t);
        } if (i == t) {
            System.out.println(i + " is equal " + t);
        } else {
            System.out.println(i + " is lower than " + t);
        }
    }
}
