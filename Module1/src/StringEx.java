public class StringEx {
    public static void main(String[] args) {
        String str1 = "BC"; // сохраняется в String pool
        String str3 = "BC"; // сохраняется в String pool
        String str2 = new String("BC"); // сохраняется в heap
        System.out.println(str1==str2);
        System.out.println(str1==str3);
    }
}
