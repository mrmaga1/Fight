import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =ran.nextInt(b-a)+a;
        System.out.println(c);
        c =ran.nextInt(b-a)+a;
        System.out.println(c);
        c =ran.nextInt(b-a)+a;
        System.out.println(c);


        int[] arr = {3, 7, 8, 9, 2, 4, 6, 5, 1};
        int t;
        for (int j = 0; j < arr.length; j++) {
            arr[j]=ran.nextInt(b-a)+a;
//            for (int i = 0; i < arr.length - 1; i++) {
//                System.out.println(i);
//                if (arr[i] > arr[i + 1]) {
//                    t = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = t;
//                }
            }
//        }
        System.out.println(Arrays.toString(arr));
//        int[][] arr = new int[5][5];
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr.length; j++) {
//                arr[i][j]=ran.nextInt(100);
//                System.out.println(j +"e3");
//            }
//            System.out.println(i);
//        }
//        System.out.println(oop(3,2));
//        System.out.println(oop(5,2));
//        System.out.println(oop(7,9));
        //  oop(7,2);
        //  arrayInfo(lily(5,5,100));

    }


//    public static int[][] lily (int q,int w,int random){
//        Random ran = new Random();
//        int[][] array = new int[q][w];
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                array[i][j] = ran.nextInt(random);
//            }
//        }
//        return array;
//    }
//    public static void arrayInfo(int[][] array){
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
// int[] arr = {1,2,3,4}
//
//
//
//
//    public static void oop (int a, int b){
//        int res = 1;
//        for (int i = 0; i <b ; i++) {
//            res*=a;
//        }
//        System.out.println(res);
//    }
}
