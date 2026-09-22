import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeroFactoryTest{
	

	@Test
	void createHero(){
		HeroInterface hero = HeroFactory.createHero("DWARF","WARRIOR");
		assertEquals("DWARF", hero.getRaceName());
		assertEquals("WARRIOR", hero.getJobName());
		assertEquals(25, hero.getSTR());
		assertEquals(20, hero.getINT());
		assertEquals(20, hero.getDEX());
		
		HeroInterface hero2 = HeroFactory.createHero("ELF","ARCHER");
		assertEquals("ELF", hero2.getRaceName());
		assertEquals("ARCHER", hero2.getJobName());
		assertEquals(20, hero2.getSTR());
		assertEquals(20, hero2.getINT());
		assertEquals(25, hero2.getDEX());
		
		HeroInterface hero3 = HeroFactory.createHero("ROBOT","MAGE");
		assertEquals("ROBOT", hero3.getRaceName());
		assertEquals("MAGE", hero3.getJobName());
		assertEquals(20, hero3.getSTR());
		assertEquals(25, hero3.getINT());
		assertEquals(20, hero3.getDEX());
		
		
	}
	
	@Test
	void attack() {
		HeroInterface hero = HeroFactory.createHero("DWARF","WARRIOR");
		assertTrue((hero.attack(5) == 145));
		assertTrue((hero.attack(0) == 20));
		
		HeroInterface hero2 = HeroFactory.createHero("ELF","ARCHER");
		assertTrue((hero2.attack(5) == 187.5));
		assertTrue((hero2.attack(0) == 0));
		
		HeroInterface hero3 = HeroFactory.createHero("ROBOT","MAGE");
		assertTrue((hero3.attack(5) == 145));
		assertTrue((hero3.attack(0) == 20));
	}

}
