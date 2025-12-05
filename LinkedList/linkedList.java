public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        // initialy created linkedList
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // now newNode point to next node so,
        newNode.next = head;

        // now head is newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is already empty");
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = head.next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // fast and slow approach
    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;// +2
            slow = slow.next; // +1
        }
        return slow;
    }

    // main function of palindrome

    public boolean isPlaindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node midNode = findMid();

        // reverse to midNode
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // chech is <-<==>->
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(5);

        System.out.println("size of ll is : " + ll.size);

        display(head);
        // ll.removeFirst();
        // display(head);
        // ll.removeLast();
        // display(head);
        System.out.println();
        // System.out.println(ll.itrSearch(1));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.deletNthFromEnd(3);
        // display(head);
        System.out.println(ll.isPlaindrome());

    }

    public static void display(Node temp) {
        // Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(3);
    // Node c = new Node(6);
    // Node d = new Node(8);

    // a.next = b;
    // b.next = c;
    // c.next = d;

    // Node temp = a;
    // while (temp != null) {
    // System.out.print(temp.data + ", ");
    // temp = temp.next;
    // }
    // }
}