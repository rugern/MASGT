import java.util.List;


public class AlwaysDefect extends Player {
	
	public AlwaysDefect(String name) {
		super(name);
	}
	
	@Override
	public Action dilemma(List<Action> opponentPreviousActions) {
		return Action.DEFECT;
	}
}
