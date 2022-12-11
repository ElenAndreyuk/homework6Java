import java.util.*;
// Реализовать множество (set) с помощью TreeMap.
// Создать метод add, добавляющий элемент в ваше множество.
// Объявить и инициализировать компаратор с обратной (от большего к меньшему)
// логикой сортировки чисел. Объявить и инициализировать TreeSet использующий ваш компаратор.
// Добавить несколько эллементов в сет и вывести в консоль.
public class Main {
    static Map<Integer, Object> mapaTree = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    static Set<Integer> treeSet1 = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    private static final Object O = new Object();

    public static void main(String[] args) {
        methodAdd(1);
        methodAdd(2);
        methodAdd(5);
        methodAdd(3);
        methodAdd(10);
        methodAdd(23);
        methodAdd(8);

        System.out.println(mapaTree.keySet());
        treeSet1.add(4);
        treeSet1.add(66);
        treeSet1.add(9);
        treeSet1.add(17);
        treeSet1.add(41);

        System.out.println(treeSet1);

    }
    static void methodAdd(int x) {
        mapaTree.put(x, O);
        return;
    }
}