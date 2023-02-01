import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static void tasks() {
        System.out.println("Задача 1");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {24, 324, 543, 654};
        System.out.println("Задача 2");
        System.out.println(array1[0] + "," + array1[1] + "," + array1[2]);
        System.out.println(array2[0] + "," + array2[1] + "," + array2[2]);
        System.out.println(array3[0] + "," + array3[1] + "," + array3[2] + "," + array3[3]);
        System.out.println("Задача 3");
        System.out.println(array1[2] + "," + array1[1] + "," + array1[0]);
        System.out.println(array2[2] + "," + array2[1] + "," + array2[0]);
        System.out.println(array3[3] + "," + array3[2] + "," + array3[1] + "," + array3[0]);
        System.out.println("Задача 4");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1 [i] + 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }


}