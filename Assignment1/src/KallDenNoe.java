import java.util.List;


public class KallDenNoe extends Player {
	
	public KallDenNoe(String name) {
		super(name);
	}
	
	@Override
	public Action dilemma(List<Action> opponentPreviousActions) {
		Action action = Action.COOPERATE;
		int history = opponentPreviousActions.size();
		if (!opponentPreviousActions.isEmpty() && opponentPreviousActions.get(history-1).equals(Action.DEFECT)){
			if (Math.random()>0.1){
				action = Action.DEFECT;
			}
		}
		return action;
	}

}
