import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> myList = createList();
        System.out.println("Created list: " + myList);

        Number sum = calculateSum(myList);
        System.out.println("Элементүүдийн нийлбэр: " + sum);

        ArrayList<Number> reversedList = sortDescList(myList);
        System.out.println("Элементүүдийг эрэмбэлэх: " + reversedList);

        Number maxElement = findMaxElement(myList);
        System.out.println("Макс утга: " + maxElement);

        ArrayList<Number> squaredList = squareElements(myList);
        System.out.println("Элементүүдийг квадрат: " + squaredList);

        ArrayList<Number> evenNumbers = filterEvenNumbers(myList);
        System.out.println("Сондгой тоо: " + evenNumbers);
    }

    public static ArrayList<Number> createList() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.println("Элементүүдийг зайтай оруулна уу (Элементүүдийг оруулж дуусаад 'done' гэж бичнэ үү): ");
        while (scan.hasNext()) {
            String input = scan.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                list.add(num);
            } catch (NumberFormatException e) {
                try {
                    double num = Double.parseDouble(input);
                    list.add(num);
                } catch (NumberFormatException e2) {
                    System.out.println("Буруу утга. Тоо эсвэл 'done' гэж бичнэ үү.");
                }
            }
        }
        scan.close();
        return list;
    }

    public static Number calculateSum(ArrayList<Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static ArrayList<Number> sortDescList(ArrayList<Number> list) {
        ArrayList<Number> sortedDesc = new ArrayList<Number>(list);
        Collections.sort(sortedDesc, Collections.reverseOrder());
        return sortedDesc;
    }

    public static Number findMaxElement(ArrayList<Number> list) {
        double max = Double.MIN_VALUE;
        for (Number num : list) {
            if (num.doubleValue() > max) {
                max = num.doubleValue();
            }
        }
        return max;
    }

    public static ArrayList<Number> squareElements(ArrayList<Number> list) {
        ArrayList<Number> squared = new ArrayList<Number>();
        for (Number num : list) {
            squared.add(num.doubleValue() * num.doubleValue());
        }
        return squared;
    }

    public static ArrayList<Number> filterEvenNumbers(ArrayList<Number> list) {
        ArrayList<Number> evenNumbers = new ArrayList<Number>();
        for (Number num : list) {
            if (num.doubleValue() % 2 == 1) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
}