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
	private int width;
	private Bit value;

	/**
	 * 
	 */
	public Wire() {
		this.width = 1;
		this.setValue(new Bit());
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#connectOutlet(java.util.Observer)
	 */
	public void connectOutlet(Observer o) {
		this.addObserver(o);
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#getValue()
	 */
	public Value getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#getWidth()
	 */
	public int getWidth() {
		return this.width;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#setValue(se.janlindblom.toy.arch.lib.type.Value)
	 */
	public void setValue(Value value) {
		if (value.getClass().equals(Bit.class)) {
			this.value = (Bit)value;
			this.setChanged();
			this.notifyObservers(value);
		}
	}

}
