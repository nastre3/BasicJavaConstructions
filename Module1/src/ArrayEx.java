import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[10]; // после создания размер массива не меняется
        int[] arr2 = new int[]{1, 2, 3, 4, 5}; // инициализационный список
        int[] arr3 = {1, 2, 3, 4, 5, 6}; // инициализационный список
        System.out.println(arr3); // [ - массив, I - тип массива, хеш после @
        System.out.println(Arrays.toString(arr3)); // вывод массива с конвертацией в строку (.deepToString - многомерные)

        int i = 10;
        int t = 15;

        while (i<t)// предусловие
        {
            System.out.println(i++);
        }

        do {
            System.out.println(i++);
        } while (i<t); // постусловие

        for (int j=0; j< arr3.length; j++) {
            System.out.println(arr3[j]);
        }

        for (int j=0; j< arr3.length; j += 2) {
            System.out.println(arr3[j]);
            if (arr3[j] == 3 ){
                break;
            }
        }
        System.out.println("=========");
        for (int j=0; j< arr3.length; j ++) {
            if (arr3[j] == 3)
                continue; // пропускает шаг после себя
                System.out.println(arr3[j]);
            }

        System.out.println("=========");
        for (int value:arr3 //foreach можно использовать с массивами и коллекциями реализующими интерфейс iterable
             ) {
            System.out.println(value);
        }
    }
}
