package lowry.teams;

import java.util.HashMap;

import lowry.interfaces.Roster;
import lowry.predictor.UpdateSheets;
import lowry.teams.actions.TeamActions;


public class HOU extends Team implements Roster{

	public HOU()
	{
		this.teamName = "HOU";
		actions = new TeamActions();
		intializeRoster(this.mode);
		updateTeamSheet();
	}
	public HOU(int weekNumber)
	{
		this.teamName = "HOU";
		actions = new TeamActions();
		updateWeeklyMatch(weekNumber);
	}
	public HOU(String mode, HashMap<String,Double> hmSchedule)
	{
		this.teamName = "HOU";
		actions = new TeamActions();
		intializeRoster(mode);
		updateWeeklyTeamSheet(hmSchedule);
	}
	
	public void updateTeamSheet()
	{
		actions.updateTeamSheet("HOU", arrPlayers);
	}
	
	public void updateWeeklyTeamSheet(HashMap<String,Double> hmSchedule)
	{
		actions.updateWeeklyTeamSheet("HOU", arrPlayers, hmSchedule);
	}

	@Override
	public void intializeRoster(String mode) {
	
		arrPlayers = actions.getTeam("HOU",mode);
		this.teamValue = actions.getFinalTeamValue();
		UpdateSheets.hmLeagueRosters.add( this);
	}

	public void updateWeeklyMatch(int weekNo)
	{
		actions.updateWeekMatch(weekNo, this.teamName);
	}
}
