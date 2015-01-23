import java.util.List;

/**
 * Created by Jonas on 23.01.2015.
 */
public class NewStrategy extends Player{

    public NewStrategy(String name) {
        super(name);
    }

    @Override
    public Agent.Action dilemma(List<Agent.Action> opponentPreviousActions) {
        Action action = Action.COOPERATE;
        int history = opponentPreviousActions.size();
        if (!opponentPreviousActions.isEmpty()){
            boolean opponenthasCOOperated = false;
            for (Action i : opponentPreviousActions){
                if (i.equals(Action.COOPERATE)){
                    opponenthasCOOperated = true;
                }
            }
            if (opponenthasCOOperated){
                if (opponentPreviousActions.get(history -1).equals(Action.DEFECT)){
                    if (Math.random()>0.11){
                        action = Action.DEFECT;
                    }
                }
            }else {
                action = Action.DEFECT;
            }
        }
        return action;
    }
}
