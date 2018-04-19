package engines;

import models.GameModel;

public class WindEngine {
	public void updateState(GameModel state) {
        double windXVelocity = state.getBall().getxVelocity();
        state.getBall().setxVelocity(windXVelocity - 0.01);
    }
	
}