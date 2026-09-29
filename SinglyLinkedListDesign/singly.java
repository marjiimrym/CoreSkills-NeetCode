import java.util.ArrayList; 

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this(value,null);
    }

    public ListNode(int value, ListNode next){
        this.value = value; 
        this.next = next;
    }
}

class LinkedList{
    private ListNode head;
    private ListNode tail;

    public LinkedList(){
        this.head= new ListNode(-1);
        this.tail = this.head;
    }
    public int get(int index){
        ListNode current = head.next;
        int i = 0;
        while (current != null){
            if (i == index){
                return current.value;
            }
            i++;
            current = current.next;
        }
        return -1;
    }
    public void insertHead(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null){
            tail = newNode;
        }
    }

    //method to insert at the end
    public void insertTail(int value){
        this.tail.next = new ListNode(value);
        this.tail = this.tail.next;
    }

    //method for removing at the given index
    public boolean remove(int index){
        int i = 0; 
        ListNode current = this.head;
        while (i< index && current != null){
            i++;
            current = current.next;
        }
        if (current !=null && current.next !=null){
            if (current.next == this.tail){
                this.tail = current;
            }
            current.next = current.next.next;
            return true;
        }
        return false;
    }
    public ArrayList<Integer> getValues(){
        ArrayList<Integer> res = new ArrayList<>();
        ListNode current = this.head.next;
        while (current != null){
            res.add(current.value);
            current = current.next;
        }
        return res;
    }
    
}
