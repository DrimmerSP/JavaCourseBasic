package homeworks.work03.chapter3.task04rewrite7;

import java.util.List;
import java.util.Scanner;

/**
 * Переписать задачу 7 домашнего задания 2 часть 2 в стиле ООП.
 * Нужно как минимум завести классы Dog и Participant.
 * Нужно реализовать метод, определяющий трех победителей согласно условию.
 * Можно добавлять любые дополнительные методы и классы.
 * <p>
 * Условие задачи:
 * Раз в год Петя проводит конкурс красоты для собак. К сожалению, система хранения участников и оценок неудобная,
 * а победителя определить надо. В первой таблице в системе хранятся имена хозяев, во второй - клички животных,
 * в третьей — оценки трех судей за выступление каждой собаки. Таблицы связаны между собой только по индексу.
 * То есть хозяин i-ой собаки указан в i-ой строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы.
 * Нужно помочь Пете определить топ 3 победителей конкурса.
 * <p>
 * На вход подается число N — количество участников конкурса. Затем в N строках переданы имена хозяев.
 * После этого в N строках переданы клички собак. Затем передается матрица с N строк, 3 вещественных числа в каждой —
 * оценки судей. Победителями являются три участника, набравшие максимальное среднее арифметическое по оценкам 3 судей.
 * Необходимо вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
 * <p>
 * Гарантируется, что среднее арифметическое для всех участников будет различным.
 */
public class RewriteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ChallengeForm challengeForm = new ChallengeForm();

        for (int i = 0; i < n; i++) {
            String memberName = scanner.nextLine();
            Participant participant = new Participant(memberName);
            challengeForm.addParticipant(participant);
        }

        for (int i = 0; i < n; i++) {
            String dogName = scanner.nextLine();
            Dog dog = new Dog(dogName);
            challengeForm.getParticipants().get(i).setDog(dog);
        }

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Scanner newScan = new Scanner(line);
            while (newScan.hasNextInt()) {
                challengeForm.getParticipants().get(i).getDog().addRatingToScore(newScan.nextInt());
            }
        }

        List<Participant> winners = challengeForm.getWinners();
        for (int i = 0; i < 3; i++) {
            System.out.println(winners.get(i));
        }
    }
}
