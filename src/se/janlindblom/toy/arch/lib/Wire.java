/**
 * 
 */
package se.janlindblom.toy.arch.lib;

import java.util.Observable;
import java.util.Observer;

import se.janlindblom.toy.arch.lib.type.Bit;
import se.janlindblom.toy.arch.lib.type.Value;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class Wire extends Observable implements Wiring {
	private int width = 1;
	private Bit value;

	/**
	 * 
	 */
	public Wire() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#connectOutlet(java.util.Observer)
	 */
	public void connectOutlet(Observer o) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#getValue()
	 */
	public Value getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#getWidth()
	 */
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#setValue(se.janlindblom.toy.arch.lib.type.Value)
	 */
	public void setValue(Value value) {
		// TODO Auto-generated method stub

	}

}
