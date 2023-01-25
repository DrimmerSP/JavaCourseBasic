package week7.task5;

/*
Необходимо реализовать простой стек с помощью массивов.
Стек хранит последовательность данных.
Связаны данные так: каждый элемент указывает на тот, который нужно использовать следующим.
Это линейная связь — данные идут друг за другом и нужно брать их по очереди.
Из середины стека брать нельзя.

Главный принцип работы стека — данные, которые попали в стек недавно, используются первыми.
Чем раньше попал — тем позже используется.
После использования элемент стека исчезает, и верхним становится следующий элемент.
LIFO (англ. last in — first out, «последним пришёл — первым вышел»).

Реализация следующих методов обязательна:
push() — добавляет элемент наверх стека.
pop() — удаляет верхний элемент из стека и возвращает его
top() - вернет верхний элемент стека
 */

public class SimpleStack {
    private int[] array;
    private int top = -1;
    private int size;

    public SimpleStack(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void push(int x) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow!");
        } else {
            array[++top] = x;
        }
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return top;
        } else {
            return array[top--];
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return top;
        } else {
            int res = array[top];
            array[top] = 0;
            return res;
        }

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}
