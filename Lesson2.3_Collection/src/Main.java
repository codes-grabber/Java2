import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ((ArrayList)list).ensureCapacity(1000); //увеличь размер до 1000
        ((ArrayList)list).trimToSize(); // обрежь размер до необходимого



        list.add(5);
        list.add(1);
        list.add(9);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);

        System.out.println(list);


        //---------добавление---------

        list.addAll(Arrays.asList(7, 5, 8, 3, 5, 4)); //добавляем сразу несколько элтов
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 5, 8, 3, 5, 4)); //добавляем сразу несколько элтов
        System.out.println(list2);

        list.add(2, 78); //вставка
        System.out.println(list);

        list.addAll(5, Arrays.asList(77, 55, 88));
        System.out.println(list);

        //-----------удаление------------\
        list.remove(2); //по индексу
        System.out.println(list);

        list.remove((Integer) 2); //по значению
        System.out.println(list);

        list.removeAll(Arrays.asList(2,9,5)); // удаляем пачку
        System.out.println(list);

        list.removeIf(x -> x < 5 && x> 50); // удаляем по условию
        System.out.println(list);

        //----------изменение-----------

        list.replaceAll(x -> x % 2 == 0 ? x * 2 : x); //если икс делится на 2 то
        System.out.println(list);

        //------------сортировка----------
        list.sort(Comparator.naturalOrder());  //Сортирует по увеличению
        System.out.println(list);

        list.sort(Comparator.reverseOrder());  //В обратном порядке
        System.out.println(list);

        list.sort(Comparator.comparingInt(x -> x % 3)); //сортирует от остатка

        List<String> strlist = new ArrayList<>(Arrays.asList("Barsik", "Amur", "Yo"));
        strlist.sort(Comparator.comparingInt(s -> s.length()));
        System.out.println(strlist);

        //---------получение
        System.out.println(list.get(3));
        list.set(4, 777); // заменить 4й эл-т на 777

        System.out.println(list.indexOf(2)); // вернет второй эл.т
        System.out.println(list.lastIndexOf(2)); // верней второй эл-т с конца

    }
}
