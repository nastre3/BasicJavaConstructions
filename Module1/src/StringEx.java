public class StringEx {
    public static void main(String[] args) {
        String str1 = "BC"; // сохраняется в String pool
        String str3 = "BC"; // сохраняется в String pool
        String str2 = new String("BC"); // сохраняется в heap
        System.out.println(str2==str3);
        str2 = str2.intern(); // вернет ссылку в string pool, если не была - создастся
        System.out.println("== " + str2==str3);

        //Другой "правильный" способ сравнения строк (по содержимому)
        System.out.println("equals " + str2.equals(str1));
    }
}
