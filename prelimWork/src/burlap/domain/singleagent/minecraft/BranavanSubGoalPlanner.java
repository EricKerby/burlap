package burlap.domain.singleagent.minecraft;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.PropositionalFunction;
import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.explorer.TerminalExplorer;

public class BranavanSubGoalPlanner {
	public MinecraftBehavior mcBehavior;
	
	public BranavanSubGoalPlanner(String map) {
		MinecraftBehavior mcBehavior = new MinecraftBehavior(map);
	}
	
	private PropositionalFunction sampleNextSubGoal(PropositionalFunction [] pfs) {
		return pfs[0];
		
	}
	
	public void runSubGoalPlanning(PropositionalFunction [] pfs, PropositionalFunction [] finalGoalpfs) {
			
			
			//Sample sequence of subgoals
			
			//Update subgoal prediction
		
			//Update text precondition?
		
		
	}
	
	
	
	public static void main(String[] args) {
		String directoryToMaps = "../maps/mutable/";
		BranavanSubGoalPlanner planner = new BranavanSubGoalPlanner(directoryToMaps+"breadworld.map");
		PropositionalFunction[] propFunctions = {MinecraftBehavior.pfAgentHasBread, planner.mcBehavior.pfIsOnGrain};
		planner.runSubGoalPlanning(propFunctions);


	}

}