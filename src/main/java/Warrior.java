
public class Warrior extends Job {

	public Warrior() {
		// TODO Auto-generated constructor stub
	}
	
	public int attack(Race race, int val) {
		return (int)(race.getSTR() * val + race.getDEX());
	}
	
	public String getJobName() {
		return "MAGE";
	}

}
