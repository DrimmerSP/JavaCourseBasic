package homeworks.work03.chapter3.task04rewrite7;

import java.util.Locale;

public class Participant implements Comparable<Participant> {
    private final String memberName;
    private Dog dog;

    public Participant(String memberName) {
        this.memberName = memberName;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.US);
        return "%s: %s, %.1f".formatted(memberName, dog.getName(), dog.getAverageScore());
    }

    @Override
    public int compareTo(Participant o) {
        return this.dog.getAverageScore().compareTo(o.getDog().getAverageScore());
    }
}
