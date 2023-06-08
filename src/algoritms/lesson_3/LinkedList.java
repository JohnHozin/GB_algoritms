package algoritms.lesson_3;

public class LinkedList {

    private Node head;

    private class Node {
        private int value;
        private Node next;
    }

    public void addFirst(int value) {
        Node first = new Node();
        first.value = value;
        if (head != null) {
            first.next = head;
        }
        head = first;
    }

    public void DeleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public boolean ifFirst(int value) {
        Node i = head;
        while (i != null) {
            if (i.value == value) {
                return true;
            }
            i = i.next;
        }
        return false;
    }

    public void addLast(int value) {
        Node last = new Node();
        last.value = value;
        if (head == null) {
            head = last;
        } else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = last;
        }
    }

    public void deleteLast() {
        if (head != null) {
            Node i = head;
            while (i.next != null) {
                if (i.next.next == null) {
                    i.next = null;
                    return;
                }
                i = i.next;
            }
            head = null;
        }
    }
}

