package homeworks.basicWorks.work03.chapter3.task04rewrite7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChallengeForm {
    private final ArrayList<Participant> participants;

    public ChallengeForm() {
        participants = new ArrayList<>();
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant member) {
        participants.add(member);
    }

    public List<Participant> getWinners() {
        List<Participant> result = new ArrayList<>(participants);
        Collections.sort(result);
        Collections.reverse(result);
        return result;
    }
}
