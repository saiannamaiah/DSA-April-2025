public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;


    public void addFirst(int item) {
        var node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }


    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }


    public void deleteFirst() {
        if (first == null) {
            throw new NullPointerException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        if (first == null) {
            throw new NullPointerException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        current.next = null;
        last = current;

    }

    public int indexOf(int item) {
        var index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    //reverse

    //10 , 20 , 30 , 40 , 50
    // p    c    f
    // 10>20>30>40>50

    // so we will change just directions of the nodes
    //and put first last // head tail later

    // so how this works is
    //explanation
    //only change direction in 2 nodes
    //previos is 10 right pointing to 20
    //current.next == 10
    //and then moce our variables
    //make previous 20
    //current 30
    //do the same in the last change the head and tail to make linked list


    public void reverse() {

        var previous = first;

        var current = first.next;


        while (current != null) {

            var following = current.next;

            current.next = previous;

            previous = current;

            current = following;
        }
        last = first;
        last.next = null;
        first = previous;
    }




}
