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
                    if(Math.random()>0.1)
                        return Action.DEFECT;
                }
            }else{
                if (history<4) {
                    if (Math.random() > 0.3)
                        return Action.DEFECT;
                }else if (history<8){
                    if (Math.random()>0.1)
                        return Action.DEFECT;
                }else{
                    return Action.DEFECT;
                }
            }
        }
        return action;
    }
}
