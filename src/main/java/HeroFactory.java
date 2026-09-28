public class HeroFactory
{




   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   Race race = getRace(raceName);
	   Job job = getJob(jobName);
	   
	   if(race == null || job == null) {
		   return null;
	   }
	   
	   return new Hero(race, job);

   }
   
   public static Race getRace(String raceName) {
	   if(raceName == null){
		   return null;
	   }else if( raceName.equals("ELF")){
		   return new Elf();
	   }else if( raceName.equals("DWARF")) {
		   return new Dwarf();
	   }else if( raceName.equals("ROBOT")){
		   return new Robot();
	   } else {
		   return null;
	   }
	   
   }
   
   public static Job getJob(String jobName) {
	   if(jobName == null){
		   return null;
	   }else if(jobName.equals("ARCHER")){
		   return new Archer();
	   }else if(jobName.equals("WARRIOR")) {
		   return new Warrior();
	   }else if(jobName.equals("MAGE")){
		   return new Mage();
	   } else {
		   return null;
	   }
   }

}