package module1.linkedlist;

public class LinkedList {
    private Node first;
    private Node last;

    // addFirst
    public void addFirst(int value) {
        if (this.first == null) {
            this.first = new Node(value, this.last);
            this.last = this.first;
        } else {
            this.first = new Node(value, this.first);
        }
    }

    // addLast
    public void addLast(int value) {
        if (this.first == null) {
            this.first = new Node(value, null);
            this.last = this.first;
        } else {
            Node newLast = new Node(value, null);

            this.last.setNext(newLast);
            this.last = newLast;
        }
    }

    // deleteFirst
    public void deleteFirst() {
        this.first = this.first.getNext();
    }

    // deleteLast
    public void deleteLast() {
        Node node = this.first;

        while (node != null) {
            Node nextNode = node.getNext();

            if (nextNode == this.last) {
                node.setNext(null);
                this.last = node;
                break;
            }
        }
    }

    // contains
    public boolean contains(int value) {
        Node node = this.first;

        while (node != null) {
            if (node.getValue() == value) {
                return true;
            }
            node = node.getNext();
        }

        return false;
    }

    // indexOf
    public int indexOf(int value) {
        Node node = this.first;
        int count = 0;
        while (node != null) {
            if (node.getValue() == value) {
                return count;
            }
            node = node.getNext();
            count += 1;
        }

        return -1;
    }
}
