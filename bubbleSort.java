package the10th.binarysearch;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数组长度");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }

        bubblesort(arr);
        show(arr);

    }
/*

冒泡排序
 */
    public static void bubblesort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    /*
    遍历数组
     */

    public static void show(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);

            } else {
                System.out.print(arr[i]);
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
