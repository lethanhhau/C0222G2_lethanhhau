package module2.ss11_stack_and_queue.thuc_hanh.ss2_implementation_queue_use_linked_list;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        if (this.head == null)
            return null;
            Node temp = this.head;
            this.head = this.head.next;
            if (this.head == null)
                this.tail = null;
                return temp;
    }
}
