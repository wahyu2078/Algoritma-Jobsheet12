package doublelinkedlist;

public class DoubleLinkedListMain29 {

    public static void main(String[] args) throws Exception {
        DoubleLinkedList29 dll = new DoubleLinkedList29();

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.addFirst(3);
        dll.addlast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());

        dll.addlast(50);
        dll.addlast(40);
        dll.addlast(10);
        dll.addlast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.addFirst(3);
        dll.addlast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================================");
        System.out.println("Data awal pada Linked List adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List adalah: " + dll.get(1));
    }
}