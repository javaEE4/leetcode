package leetcoed;


public class AddTwoNums {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNums(ListNode l1, ListNode l2) {


        ListNode p1 = l1, p2 = l2;
        int sum = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum += p1.value;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.value;
                p2 = p2.next;
            }
            cur.next = new ListNode(sum % 10);
            sum /= 10;
            cur = cur.next;
        }

        if (sum == 1) {
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }


    //  ((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)
}
