package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.State;
import readXML.ReadXML;

class TestStanje {

	@Test
	void test() {
		ReadXML readxml = new ReadXML();
		
		State state2 = new State("4", "Stanje2", null, null, null, null);
	    boolean rez = readxml.checkIfStateExists(state2);
		assertEquals(false, rez);
	}

}
