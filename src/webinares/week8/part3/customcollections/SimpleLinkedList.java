package webinares.week8.part3.customcollections;

/*
Написать простую реализацию LinkedList (однонаправленная)
Методы:
 - get(int index)
 - addAtHead(int val)
 - addAtTail(int val)
 - addAtIndex(int index, int val)
 - deleteAtIndex(int index)
 - size()
 */



public class SimpleLinkedList {
    private Node head;
    private int size;

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //Конструктор. Задаем только голову, размер нулевой.
    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    //Идем от головы до интересующей нас ноды (если index валиден), возвращаем значение.
    public int get(int idx) {
        if (idx < 0 || idx >= size) {
            return -1; //throw Exceprion
        }

        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node.value;
    }

    //Добавляем новую ноду в начале, которая становится головой. Размер увеличиваем. Увеличиваем size.
    public void addAtHead(int value) {
        Node newHead = new Node(value, head);
        head = newHead;
        size++;
    }

    //Добавляем новую ноду в конце. Если список не пустой, то до хвоста надо сначала дойти
    // и указать у него next на эту новую ноду. Иначе эта же нода становится головой. Увеличиваем size.
    public void addAtTail(int value) {
        if (size > 0) {
            Node node = head;
            for (int i = 0; i < size - 1; i++) {
                node = node.next;
            }
            node.next = new Node(value, null);
        } else {
            head = new Node(value, null);
        }
        size++;

    }

    //Комбинация предыдущих двух методов, плюс если добавляем куда-то в середину то просто идем то index-1,
    // у нее ставим next эту ноду, а у этой ноды next на следующую. Увеличиваем size.
    public void addAtIndex(int index, int value) {

    }

    //Удаление ноды в списке. Если удаляем голову, то меняем head.
    //Мы фактическим не удаляем ноду, а просто у предыдущей от нее меняем указатель следующего на следующую от удаляемой
    public void deleteAtIndex(int index) {

    }

    public int size() {
        return size;
    }

}
