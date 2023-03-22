import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;
     private static class Node<E>{
        private E data;
        private Node next;

         public Node(E data) {
             this.data = data;
             this.next = null;
         }
     }

    public MyLinkedList() {
    }
    public MyLinkedList(E data){
         Node newNode = new Node(data);
         head = newNode;
         numNodes++;
    }
    public void addLast(E data){
         Node temp =head;
         while (temp.next != null){
             temp = temp.next;
         }
        Node newNode = new Node(data);
         temp.next = newNode;
         numNodes++;
    }
    public boolean add(E data){
         addLast(data);
         return true;
    }
     public void addFist(E data){
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
         numNodes++;
     }
     public void add(int index, E data){
         Node temp = head;
         Node newNode = new Node(data);
         Node nextLink;
         for (int i = 0; i < index - 1 && temp.next != null; i++) {
             temp = temp.next;
         }
         nextLink = temp.next;
         temp.next = newNode;
         newNode.next = nextLink;
         numNodes++;
     }
    public E remove(int index) {
        Node temp = head;
        if (!(index < numNodes)){
            throw new IndexOutOfBoundsException("vị trí không tồn tại trong mảng");
        }
        //1,2,3,4,5  - index = 3
        for (int i = 0; i < index-1 ; i++) {
            temp=temp.next;
        }
        E removeData = (E) temp.next.data;
        temp.next=temp.next.next;
        numNodes--;
        return removeData;
    }
    public boolean remove(E data){
        if(head.data.equals(data)){
            head= head.next;
            numNodes--;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data.equals(data)){
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void printList(){
        Node temp = head;
        System.out.print(temp.data+" , ");
        while (temp.next != null) {
            temp = temp.next;
            System.out.print(temp.data +"  , ");
        }
        System.out.println();
    }
}
