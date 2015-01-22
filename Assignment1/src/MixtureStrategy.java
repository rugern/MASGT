import java.util.List;


public class MixtureStrategy extends Player {
	
	public MixtureStrategy(String name) {
		super(name);
	}
	
	@Override
	public Action dilemma(List<Action> opponentPreviousActions) {
		if(Math.random()<0.5) {
			return Action.COOPERATE;
		}
		else {
			return Action.DEFECT;
		}
	}
}
