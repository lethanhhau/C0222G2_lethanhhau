package module2.ss10_list.bai_tap.linked_list;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //phần tử đầu tiên của danh sách liên kết
    private Node head;
    // số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {

    }

    public void addFirst(E element) {
        // khai báo 1 biến temp trỏ đến giá trị của head
        Node temp = head;
        // biến head sẽ nhận giá trị là 1 node mới
        head = new Node(element);
        // head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        // sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        //khai báo 1 node là holder
        Node holder;
        // cho con trỏ chạy đến vị trí index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //node tại vị trí index -1 sẻ trỏ đến node mới
        temp.next = new Node(element);
        //node mới sẻ trỏ đến holder
        temp.next.next = holder;
        //tăng số lượng phần tử trong danh sách lên 1
        numNodes++;
    }

    public Object get(int index) {
        //khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        //khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;
        //nếu index bằng 0 thì sẻ trả đến phần tử hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public boolean remove(E element) {
        //remove đối tượng nếu nó là head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //khai báo 1 biến temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone(){
        //kiểm tra linkedList có phần tử hay không
        if (numNodes == 0){
            throw new IllegalArgumentException("LinkedList null");
        }
        //Khai báo linkedList trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //khai báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E)temp.data) ;
        temp = temp.next;
        while (temp !=null){
            returnLinkedList.addLast((E)temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }
    public boolean constrains(E element){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
