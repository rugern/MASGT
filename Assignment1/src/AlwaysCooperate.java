import java.util.List;


public class AlwaysCooperate extends Player {
	
	public AlwaysCooperate(String name) {
		super(name);
	}
	
	@Override
	public Action dilemma(List<Action> opponentPreviousActions) {
		return Action.COOPERATE;
	}
}
