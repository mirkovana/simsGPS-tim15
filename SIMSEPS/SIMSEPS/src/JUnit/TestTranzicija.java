package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gui.FormPanel;
import model.State;

class TestTranzicija {

	@Test
	void test() {
		FormPanel fp = new FormPanel();
		State state1 = new State("3", "Stanje1", null, null, null, null);
		State state2 = new State("4", "Stanje2", null, null, null, null);
		boolean rez = fp.checkIfTransExists(state2.getName(), state1);
		assertEquals(false, rez);
			}

}
