package homework16;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Первоначальный список = "  + list);

        list.removeAt(0);
        System.out.println("Удаляем элемент с индексом 0 = "  + list);

        list.removeAt(1);
        System.out.println("Удаляем элемент с индексом 1 = "  + list);

//        list.removeAt(5);
//        System.out.println(list);

        LinkedList<String> llist = new LinkedList<>();
        llist.add("Россия");
        llist.add("Беларусь");
        llist.add("Казахстан");

        for (int i = 0; i < llist.size(); i++) {
            System.out.println("Значение в индексе  " + i + " = " + llist.get(i));
        }
    }
}
