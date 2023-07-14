//program to insert value at begin,at end and at position

import java.util.ArrayList;
import java.util.Scanner;

//since array is static data structure so if we want to do dynamic allocation of memory we need to use "ARRAYlist"class instead of array objects. thus in below ques  while inserting value at begin or end or at gven positon we require the extra memory thus dynamic memory allocation required.

public class Q24 {
    public static void atbegin(ArrayList<Integer> numbers, int val) {
        numbers.add(0, val);
    }

    public static void atposgiven(ArrayList<Integer> numbers, int val) {
        numbers.add(4,val);   //use add() method and pass index,value
    }

    public static void atend(ArrayList<Integer> numbers, int val) {
        numbers.add(val);      //to insert value at end , do not pass value at index directly pass val to be insert at end like ->add(val)
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, i;

        System.out.print("Enter size: ");
        size = sc.nextInt();

        System.out.print("Enter array elements: ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (i = 0; i < size; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter value to be inserted at the beginning: ");
        int val = sc.nextInt();

        System.out.println("Array before insert at the beginning: " + numbers);

        atbegin(numbers, val);

        System.out.println("Array after insert at the beginning: " + numbers);

        System.out.print("Enter value to be inserted at the intent position: ");
        val = sc.nextInt();

        System.out.println("Array before insert at the given pos: " + numbers);

        atposgiven(numbers, val);

        System.out.println("Array after insert at the given pos: " + numbers);


        System.out.print("Enter value to be inserted at the end: ");
        val = sc.nextInt();

        System.out.println("Array before insert at the end: " + numbers);

        atend(numbers, val);

        System.out.println("Array after insert at the  end : " + numbers);


        sc.close();

    }
}
