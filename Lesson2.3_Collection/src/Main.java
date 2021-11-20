import com.sun.org.apache.bcel.internal.generic.LineNumberGen;

import java.beans.IntrospectionException;
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




        //----------связные списки--------

        List<Integer> ll = new LinkedList<>(list);

        Queue<String> queue = new LinkedList<>();
        queue.add("sda");
        queue.add("rew");
        queue.add("sdtrea");
        queue.add("tr");

        for (int i = 0; i < 4; i++){
            System.out.println(queue.remove());
        }

        Deque<Integer> stack = new LinkedList<>();  //Стак
        stack.push(1);  //вставить элт в стак         как патрон в магазин
        stack.push(2);
        stack.push(6);
        stack.push(9);

        for (int i = 0; i < 4; i++){
            System.out.println(stack.pop());  //получить эл.т
        }

        //----------Set-------
        Set<Integer> set = new HashSet<>();  // хранит данные в виде массива

        set.add(4);
        set.add(5);
        set.add(654);
        set.add(65);
        set.add(654424);
        set.add(4);   //не добавит эллемонт потому что такой уже есть
        System.out.println(set); // [65, 654424, 4, 5, 654] в случайном порядке

        Set<Integer> set1 = new LinkedHashSet<>(); // хранит данные в виде массива

        set1.add(4);
        set1.add(5);
        set1.add(654);
        set1.add(65);
        set1.add(654424);
        set1.add(4);   //не добавит эллемонт потому что такой уже есть
        System.out.println(set1); // [4, 5, 654, 65, 654424] сохранит порядок


        Set<Integer> set2 = new TreeSet<>();

        set2.add(4);
        set2.add(5);
        set2.add(654);
        set2.add(65);
        set2.add(654424);
        set2.add(4);   //не добавит эллемонт потому что такой уже есть
        System.out.println(set2); // [4, 5, 65, 654, 654424]в порядке возрастания



    }
}
