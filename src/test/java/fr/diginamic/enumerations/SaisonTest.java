package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaisonTest {

	@Test
	public void testValueOfLibelle() {
		Saison saison=Saison.valueOfLibelle("Printemps");
		
		assertEquals(Saison.PRINTEMPS, saison);
	}
	
	
	@Test
	public void testValueOfLibelleAvecEspace() {
		Saison saison=Saison.valueOfLibelle(" Hiver ");
		
		assertEquals(Saison.HIVER, saison);
	}
	
	@Test
	public void testValueOfLibelleAvecNull() {
		Saison saison=Saison.valueOfLibelle(null);
		assertNull(saison);

}
}
