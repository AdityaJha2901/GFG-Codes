//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            GFG llist = new GFG();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends

class Solution
{
    public static Node removeAllDuplicates(Node head){
        if(head==null){
            return null;
        }
        Node tail=null;
        Node res=null;
        while(head!=null){
            int curr_ele=head.data;
            boolean flag=true;
            while(head.next!=null && head.next.data==curr_ele){
                head=head.next;
                flag=false;
            }
            if(flag==true){
                if(tail==null && res==null){
                    tail=head;
                    res=head;
                }
                else{
                    tail.next=head;
                    tail=head;
                }
            }
            head=head.next;
        }
        if(tail!=null){
            tail.next=null;
            return res;
        }
        return tail;
    }
}       // code here
 