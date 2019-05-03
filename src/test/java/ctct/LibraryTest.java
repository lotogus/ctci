package ctct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/*
    Write a method for reversing a linked list. ↴ Do it in place. ↴

    Your method will have one input: the head of the list.

    Your method should return the new head of the list.
 */

public class LibraryTest {


//    public static void main(String[] args) {
//        int[] a = {1};
//        a[0]++;
//        System.out.println(a[0]);
//    }

    public class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
        public LinkedListNode(int value, LinkedListNode next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return value+" next "+((next!=null)?next.value:"null");
        }
    }

    /*
    from
    [(1) -> 2] [(2) -> 3] [(3) -> null]
    to
    [(3) -> 1] [(2) -> 1] [(1) -> null]

    [(1) -> null]
    [(2) -> 1]
    [(3) -> 2]

     */
    //                                          1 -> 2
    public static LinkedListNode reverse(LinkedListNode p) {
        if(p.next==null) {
            return p;
        } else {
            return reverse(p, p.next);//2 -> 3
        }
    }
          //                                    1 -> 2                2 -> 3  ===  3 -> 2 -> 1 -> null
    public static LinkedListNode reverse(LinkedListNode p, LinkedListNode c) {
        if(c.next==null) {
            c.next = p;
            p.next = null;
            return c;
        } else {
            LinkedListNode exParent = c.next;// 3
            c.next = p;
            p.next = null;
            return reverse(c, exParent);
        }
    }

    @Test
    public void reverse1() {

        final LinkedListNode n4 = new LinkedListNode(4);
        final LinkedListNode n3 = new LinkedListNode(3, n4);
        final LinkedListNode n2 = new LinkedListNode(2, n3);
        final LinkedListNode n1 = new LinkedListNode(1, n2);

        LinkedListNode reversed = reverse(n1);

        int i = 4;
        while (i > 0) {
            assertNotNull(reversed);
            System.out.println("val "+reversed.value);
            assertEquals("'true'", reversed.value, i);
            reversed = reversed.next;
            i--;
        }


    }
}
