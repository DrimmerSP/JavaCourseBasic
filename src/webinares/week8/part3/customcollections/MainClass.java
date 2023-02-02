package webinares.week8.part3.customcollections;

public class MainClass {

    //https://ru.stackoverflow.com/questions/568119/%D0%9E%D1%82%D0%BB%D0%B8%D1%87%D0%B8%D0%B5-arraylist-%D0%BE%D1%82-linkedlist
    public static void main(String[] args) {
        //Simple ArrayList usage
//        SimpleArrayList myArrayList = new SimpleArrayList();
//        myArrayList.add(12);
//        myArrayList.add(99);
//        System.out.println("List size: " + myArrayList.size());
//        System.out.println("Element with first index: " + myArrayList.get(1));


        //Simple LinkedListUsage usage
        SimpleLinkedList myLinkedList = new SimpleLinkedList();
        myLinkedList.addAtHead(12);
        myLinkedList.addAtHead(50);
        myLinkedList.addAtTail(99);

        System.out.println(myLinkedList.get(1));


    }
}
