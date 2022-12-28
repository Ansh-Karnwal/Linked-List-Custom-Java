public class Main {
    public static void main(String[] args) {
    }
}

class LinkedList<T> {

    private Node head = null;

    private class Node {
        private T val;
        private Node next;

        public Node(T val) {
            this.val = val;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public void insert(T value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void delete() {
        head = head.next;
    }

    @Override
    public String toString() {
        return head.toString();
    }
}