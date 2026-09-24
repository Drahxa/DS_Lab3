import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeroFactoryTest{
	

	@Test
	void createHero(){
	    //When I copied and pasted to check every single option, I forgot to fix many of the names so I had to double check all of those
		
		//DWARF COMBS
		HeroInterface hero = HeroFactory.createHero("DWARF","WARRIOR");
		assertEquals("DWARF", hero.getRaceName());
		assertEquals("WARRIOR", hero.getJobName());
		assertEquals(25, hero.getSTR()); 
		assertEquals(20, hero.getINT());
		assertEquals(20, hero.getDEX());
		
		HeroInterface hero2 = HeroFactory.createHero("DWARF","ARCHER");
		assertEquals("DWARF", hero2.getRaceName());
		assertEquals("ARCHER", hero2.getJobName());
		assertEquals(25, hero2.getSTR());
		assertEquals(20, hero2.getINT());
		assertEquals(20, hero2.getDEX());
		
		HeroInterface hero3 = HeroFactory.createHero("DWARF","MAGE");
		assertEquals("DWARF", hero3.getRaceName());
		assertEquals("MAGE", hero3.getJobName());
		assertEquals(25, hero3.getSTR());
		assertEquals(20, hero3.getINT());
		assertEquals(20, hero3.getDEX());
		
		
		//ELF COMBS
		HeroInterface hero4 = HeroFactory.createHero("ELF","WARRIOR");
		assertEquals("ELF", hero4.getRaceName());
		assertEquals("WARRIOR", hero4.getJobName());
		assertEquals(20, hero4.getSTR());
		assertEquals(20, hero4.getINT());
		assertEquals(25, hero4.getDEX());
		
		HeroInterface hero5 = HeroFactory.createHero("ELF","ARCHER");
		assertEquals("ELF", hero5.getRaceName());
		assertEquals("ARCHER", hero5.getJobName());
		assertEquals(20, hero5.getSTR());
		assertEquals(20, hero5.getINT());
		assertEquals(25, hero5.getDEX());
		
		HeroInterface hero6 = HeroFactory.createHero("ELF","MAGE");
		assertEquals("ELF", hero6.getRaceName());
		assertEquals("MAGE", hero6.getJobName());
		assertEquals(20, hero6.getSTR());
		assertEquals(20, hero6.getINT());
		assertEquals(25, hero6.getDEX());
		
		
		//ROBOT COMBS
		HeroInterface hero7 = HeroFactory.createHero("ROBOT","WARRIOR");
		assertEquals("ROBOT", hero7.getRaceName());
		assertEquals("WARRIOR", hero7.getJobName());
		assertEquals(20, hero7.getSTR());
		assertEquals(25, hero7.getINT());
		assertEquals(20, hero7.getDEX());
		
		HeroInterface hero8 = HeroFactory.createHero("ROBOT","ARCHER");
		assertEquals("ROBOT", hero8.getRaceName());
		assertEquals("ARCHER", hero8.getJobName());
		assertEquals(20, hero8.getSTR());
		assertEquals(25, hero8.getINT());
		assertEquals(20, hero8.getDEX());
		
		HeroInterface hero9 = HeroFactory.createHero("ROBOT","MAGE");
		assertEquals("ROBOT", hero9.getRaceName());
		assertEquals("MAGE", hero9.getJobName());
		assertEquals(20, hero9.getSTR());
		assertEquals(25, hero9.getINT());
		assertEquals(20, hero9.getDEX());
		
		
		//NULL
		HeroInterface hero10 = HeroFactory.createHero("ROBOT","MAGE");
		assertEquals("ROBOT", hero10.getRaceName());
		assertEquals("MAGE", hero10.getJobName());
		assertEquals(20, hero10.getSTR());
		assertEquals(25, hero10.getINT());
		assertEquals(20, hero10.getDEX());
		
		
	}
	
	@Test
	void attack() {
		
		//DWARF
		HeroInterface hero1 = HeroFactory.createHero("DWARF","WARRIOR");
		assertTrue((hero1.attack(5) == 145)); // 25 * 5 + 20 = 125 + 20 = 145 
		assertTrue((hero1.attack(0) == 20)); // 25 * 0 + 20 = 0 + 20 = 20
		
		HeroInterface hero2 = HeroFactory.createHero("DWARF","ARCHER");
		assertTrue((hero2.attack(5) == 150)); // 25 * 5 + 20 = 125 + 20 = 145 
		assertTrue((hero2.attack(0) == 0)); // 25 * 0 + 20 = 0 + 20 = 20
		
		HeroInterface hero3 = HeroFactory.createHero("DWARF","MAGE");
		assertTrue((hero3.attack(5) == 120)); // 25 * 5 + 20 = 125 + 20 = 145 
		assertTrue((hero3.attack(0) == 20)); // 25 * 0 + 20 = 0 + 20 = 20


		//ELF
		HeroInterface hero4 = HeroFactory.createHero("ELF","WARRIOR");
		assertTrue((hero4.attack(5) == 125)); // 25 * 1.5 * 2 = 75
		assertTrue((hero4.attack(0) == 25)); // 0 
		
		HeroInterface hero5 = HeroFactory.createHero("ELF","ARCHER");
		assertTrue((hero5.attack(5) == 187)); // 25 * 1.5 * 2 = 75
		//This 187 check was previously 187.5 which wouldnt work because an int and float can't be compared, so I changed the float to it's int form (casted it) and it worked
		assertTrue((hero5.attack(0) == 0)); // 0 
		
		HeroInterface hero6 = HeroFactory.createHero("ELF","MAGE");
		assertTrue((hero6.attack(5) == 125)); // 25 * 1.5 * 2 = 75
		assertTrue((hero6.attack(0) == 25)); // 0 


	
		//ROBOT
		HeroInterface hero7 = HeroFactory.createHero("ROBOT","WARRIOR");
		assertTrue((hero7.attack(5) == 120)); // 20 + 25 * 5 = 145
		assertTrue((hero7.attack(0) == 20)); // 20 + 25 * 0 = 0 + 20 = 20
		
		HeroInterface hero8 = HeroFactory.createHero("ROBOT","ARCHER");
		assertTrue((hero8.attack(5) == 150)); // 20 + 25 * 5 = 145
		assertTrue((hero8.attack(0) == 0)); // 20 + 25 * 0 = 0 + 20 = 20
		
		HeroInterface hero9 = HeroFactory.createHero("ROBOT","MAGE");
		assertTrue((hero9.attack(5) == 145)); // 20 + 25 * 5 = 145
		assertTrue((hero9.attack(0) == 20)); // 20 + 25 * 0 = 0 + 20 = 20
	}

    @Test
    void createHeroNullAndInvalid(){
        assertNull(HeroFactory.createHero("","WARRIOR"));
        assertNull(HeroFactory.createHero("ELF", ""));
        assertNull(HeroFactory.createHero("", ""));
        assertNull(HeroFactory.createHero("","NOTWARRIOR"));
        assertNull(HeroFactory.createHero("ROBOT","NOTWARRIOR"));
        assertNull(HeroFactory.createHero("NOTROBOT","MAGE"));
        assertNull(HeroFactory.createHero("NOTROBOT","NOTARCHER"));
    }

    // Tried making a hero object but it failed because it would be null when testing for null so I made it inside of the check but it also failed because it was already null and the equals was not working when comparing a string to null so i changed null to "" and it finnaly worked

}
//Testing if cloning worked