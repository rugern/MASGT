import java.util.List;


public class TitForEveryOtherTat extends Player {
	
	public TitForEveryOtherTat(String name) {
		super(name);
	}

	@Override
	public Action dilemma(List<Action> opponentPreviousActions) {
		Action action = Action.COOPERATE;
		int size = opponentPreviousActions.size();
		if(size > 1) {
			if(opponentPreviousActions.get(size-1)==Action.DEFECT && opponentPreviousActions.get(size-2)==Action.DEFECT) {
				action = Action.DEFECT;
			}
		}
		return action;
	}
}
