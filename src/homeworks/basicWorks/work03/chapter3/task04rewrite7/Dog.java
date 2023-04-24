package homeworks.basicWorks.work03.chapter3.task04rewrite7;

import java.util.ArrayList;

public class Dog {
    private final String name;
    private final ArrayList<Integer> score;

    public Dog(String name) {
        this.name = name;
        score = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRatingToScore(Integer rating) {
        score.add(rating);
    }

    public Double getAverageScore() {
        int sum = 0;
        for (Integer item : score) {
            sum += item;
        }
        return (sum * 1.0) / score.size();
    }
}
