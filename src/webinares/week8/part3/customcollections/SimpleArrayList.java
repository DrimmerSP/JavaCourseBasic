package webinares.week8.part3.customcollections;


import java.util.Arrays;

/*
Примитивная реализация ArrayList.
Массив только int, из методов только добавлять элемент,
получать size и увеличивать капасити, когда добавляется новый.
 */
public class SimpleArrayList {
    private int size;
    private int capacity;
    private int currentIdx;
    private int[] arr;
    private static final int DEFAULT_CAPACITY = 5;

    public SimpleArrayList() {
        arr = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
        currentIdx = 0;
    }

    public SimpleArrayList(int size) {
        arr = new int[size];
        capacity = size;
        this.size = 0;
        currentIdx = 0;

    }

    //Добавляет новый элемент в список (массив). При достижении размера внутреннего массива
    //происходит его увеличение в 2 раза.
    public void add(int element) {
        if (currentIdx >= capacity) {
            capacity = 2 * capacity;
            arr = Arrays.copyOf(arr, capacity);
        }

        arr[currentIdx] = element;
        size++;
        currentIdx++;
    }

    //Достает элемент по индексу
    public int get(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Impossible to get element for this index: " + idx); //throw
            return -1;
        } else {
            return arr[idx];
        }
    }

    public int size() {
        return size;
    }



}
