package lesson3;


import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        printArr(5,2);

    }

    public static void invertArray(){
        int[] arr = {1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            }
            else { arr[i] = 1;}
        }
            System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal(){

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }


}
