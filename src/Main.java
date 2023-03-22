public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>("hiếu");
        myLinkedList.add("khiet");
        myLinkedList.add("nam");
        myLinkedList.add("nhan");
        myLinkedList.addFist("hieuhoa");
        myLinkedList.remove(4);
        myLinkedList.printList();
    }
}