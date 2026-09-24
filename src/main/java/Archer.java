
public class Archer extends Job {

	public Archer() {
		// TODO Auto-generated constructor stub
	}

	public int attack(Race race, int val) {
		return (int)(race.getDEX() * 1.5 * val);
	}
	
	public String getJobName() {
		return "ARCHER";
	}
}
