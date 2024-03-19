import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Circle {
    public static void main(String[] args) {
        ArrayList<Number> myList = createList();
        System.out.println("Created list: " + myList);

        Number sum = calculateSum(myList);
        System.out.println("Sum of elements: " + sum);

        ArrayList<Number> reversedList = sortDescList(myList);
        System.out.println("Sorted list in descending order: " + reversedList);

        Number maxElement = findMaxElement(myList);
        System.out.println("Max element: " + maxElement);

        ArrayList<Number> squaredList = squareElements(myList);
        System.out.println("Squared elements: " + squaredList);

        ArrayList<Number> evenNumbers = filterEvenNumbers(myList);
        System.out.println("Even numbers: " + evenNumbers);
    }

    public static ArrayList<Number> createList() {
        String input = JOptionPane.showInputDialog("Enter numbers separated by space: ");
        ArrayList<Number> list = new ArrayList<Number>();
        String[] numbers = input.split(" ");
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                list.add(num);
            } catch (NumberFormatException e) {
                try {
                    double num = Double.parseDouble(number);
                    list.add(num);
                } catch (NumberFormatException e2) {
                    System.out.println("Invalid input. Enter a number.");
                }
            }
        }
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
            if (num.doubleValue() % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
}