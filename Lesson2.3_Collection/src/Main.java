import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);

        System.out.println(list);

//        list.addAll(Arrays.asList(7, 5, 8, 3, 5, 4)); //добавляем сразу несколько элтов
//        System.out.println(list);
//
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 5, 8, 3, 5, 4)); //добавляем сразу несколько элтов
//        System.out.println(list2);

        list.add(2, 78); //вставка
        System.out.println(list);

        list.addAll(5, Arrays.asList(77, 55, 88));
        System.out.println(list);

        //-----------удаление------------\
        list.remove(2); //по индексу
        System.out.println(list);

        list.remove((Integer) 2); //по значению
        System.out.println(list);


    }
}
