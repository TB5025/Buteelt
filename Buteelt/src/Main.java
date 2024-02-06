import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. ArrayList_үүсгэх
        ArrayList<Integer> myList = createList();
        System.out.println("Created list: " + myList);

        // 2. Элементүүдийн_нийлбэр 
        int sum = calculateSum(myList);
        System.out.println("Элементүүдийн нийлбэр: " + sum);

        // 3. Элементүүдийг_эрэмбэлэх
        ArrayList<Integer> reversedList = sortDescList(myList);
        System.out.println("Элементүүдийг эрэмбэлэх: " + reversedList);

        // 4. Макс_утга
        int maxElement = findMaxElement(myList);
        System.out.println("Макс утга: " + maxElement);

        // 5. Элементүүдийн_квадрат
        ArrayList<Integer> squaredList = squareElements(myList);
        System.out.println("Элементүүдийг квадрат: " + squaredList);

        // 6. Сондгой_тоо
        ArrayList<Integer> evenNumbers = filterEvenNumbers(myList);
        System.out.println("Сондгой тоо: " + evenNumbers);
    }

    // 1. ArrayList_үүсгэх
    public static ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        return list;
    }

    // 2. Элементүүдий_нийлбэр_олгох
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // 3. Элементүүдийг_эрэмбэлэх
    public static ArrayList<Integer> sortDescList(ArrayList<Integer> list) {
        ArrayList<Integer> sortedDesc = new ArrayList(list);
        Collections.sort(sortedDesc, Collections.reverseOrder());
        return sortedDesc;
    }

    // 4. Макс_утга
    public static int findMaxElement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 5. Элементүүдийг_квадрат
    public static ArrayList<Integer> squareElements(ArrayList<Integer> list) {
        ArrayList<Integer> squared = new ArrayList();
        for (int num : list) {
            squared.add(num * num);
        }
        return squared;
    }

    // 6. Сондгой_тоо
    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> evenNumbers = new ArrayList();
        for (int num : list) {
            if (num % 2 == 1) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
}