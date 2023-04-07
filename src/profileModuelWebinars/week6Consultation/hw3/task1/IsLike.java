package week6.consultation.hw3.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Создать аннотацию @IsLike, применимую к классу во время выполнения программы. Аннотация может хранить boolean значение.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface IsLike {
    boolean value() default false;
}
