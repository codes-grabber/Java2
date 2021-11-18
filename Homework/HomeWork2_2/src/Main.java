import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        try{
            String[][] arr = new String[4][4];
            String[][] arr1 = {

                    {"1", "2", "1", "1"},

                    {"1", "1", "1", "1"},

                    {"1", "1", "3", "5"},

                    {"1", "1", "3", "7"}

            };
            checkArray(arr1);
            try{
                changeArr(arr1);
            } catch (MyArrayDataException s){
                s.printStackTrace();
            }

        } catch (MyArraySizeException s){
            s.printStackTrace();
        }
    }

    public static void checkArray(String[][] arr) {
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        System.out.println("Успешно");
    }

    public static void changeArr(String[][] arr){
        for (int i = 0; i <= arr.length-1; i++){
            for (int j = 0; j <= arr[i].length-1; j++){
                try{
                    int another = Integer.parseInt(arr[i][j]);
                    if (j == arr[i].length-1){
                        System.out.print(arr[i][j] + " ");
                        System.out.println(" ");
                    } else {
                        System.out.print(arr[i][j] + " ");
                    }
                } catch (NumberFormatException e){
                    throw new MyArrayDataException( i , j );
                }
            }
        }
    }
}
