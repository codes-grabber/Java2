import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "fff";
        int another = Integer.parseInt(a);
        System.out.println(another);

        int sum = 0;

        try{
            String[][] arr = new String[4][4];
            checkArray(arr);
            try{
                changeArr(arr);
            } catch (MyArrayDataException s){

            }

        } catch (MyArraySizeException s){
            s.printStackTrace();
            System.out.println(s.getHight());
            System.out.println(s.getWeight());
        }
    }

    public static void checkArray(String[][] arr) {
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxCount < arr[i].length) {
                maxCount = arr[i].length;
            }
            if (arr.length != 4 || maxCount != 4) {
                throw new MyArraySizeException("Массив некорректного размера!", arr.length, maxCount);
            }
        }

        System.out.println("Успешно");
    }

    public static void changeArr(String[][] arr){
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxCount < arr[i].length) {
                maxCount = arr[i].length;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <= maxCount; j++){
                int another = Integer.parseInt(arr[i][j]);
            }
        }
    }
}
