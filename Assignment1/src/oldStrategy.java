import java.util.List;


public class oldStrategy extends Player {

    public oldStrategy(String name) {
        super(name);
    }

    @Override
    public Action dilemma(List<Action> opponentPreviousActions) {
        Action action = Action.COOPERATE;
        double punishFactor = 1.0;
        for(int i=opponentPreviousActions.size()-1; i>=0; i--) {
            if(opponentPreviousActions.get(i)==Action.DEFECT) {
                punishFactor += 0.4;
            }
            else {
                punishFactor -= 0.2;
            }
        }
        if(Math.random()*punishFactor>0.5) {
            action = Action.DEFECT;
        }
        return action;
    }

}