package week6.consultation.hw1.task1;

/* Создать собственное исключение MyCheckedException, являющееся
проверяемым.
 */
public class MyCheckedException extends RuntimeException {
    // extends RuntimeException - unchecked
    public MyCheckedException(String message) {
        super(message);
    }
}
