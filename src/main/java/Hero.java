
public class Hero implements HeroInterface {

	Race race;
	Job job;
	public Hero(Race race, Job job) {
		this.race = race;
		this.job = job;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack(int val) {
		return job.attack(race, val);
	}

	@Override
	public int getSTR() {
		return race.getSTR();
	}

	@Override
	public int getDEX() {
		// TODO Auto-generated method stub
		return race.getDEX();
	}

	@Override
	public int getINT() {
		// TODO Auto-generated method stub
		return race.getINT();
	}

	@Override
	public String getRaceName() {
		// TODO Auto-generated method stub
		return race.getRaceName();
	}

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return job.getJobName();
	}

}
