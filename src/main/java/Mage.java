
public class Mage extends Job {

	public Mage() {
		// TODO Auto-generated constructor stub
	}
	
	public int attack(Race race, int val) {
		return (int)(race.getDEX() + race.getINT() * val);
	}
	
	public String getJobName() {
		return "MAGE";
	}

}
