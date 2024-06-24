package Tugas2;

public class DoubleLinkedLists29 {
    Node29 head;
    int size;

    public DoubleLinkedLists29() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film29 item) {
        if (isEmpty()) {
            head = new Node29(null, item, null);
        } else {
            Node29 newNode = new Node29(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film29 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node29 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node29 newNode = new Node29(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film29 item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node29 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node29 newNode = new Node29(current, item, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node29 tmp = head;
            System.out.println("Cetak Data");
            while (tmp != null) {
                System.out.println("ID \t: " + tmp.data.id);
                System.out.println("  Judul \t: " + tmp.data.judul);
                System.out.println("  Rating \t: " + tmp.data.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node29 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node29 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public Film29 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public Film29 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node29 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film29 get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node29 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film29 searchById(int id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong");
        }
        Node29 current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }
        throw new Exception("Film dengan ID " + id + " tidak ditemukan");
    }

    public void sortByRatingDesc() {
        if (isEmpty() || size == 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            Node29 current = head;
            Node29 maxNode = current;
            for (int j = 0; j < size - i - 1; j++) {
                if (current.next != null && current.next.data.rating > maxNode.data.rating) {
                    maxNode = current.next;
                }
                current = current.next;
            }
            if (maxNode != current) {
                Film29 temp = current.data;
                current.data = maxNode.data;
                maxNode.data = temp;
            }
        }
    }
}