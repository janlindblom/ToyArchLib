package se.janlindblom.toy.arch.lib;

import java.util.Observer;

import se.janlindblom.toy.arch.lib.type.Value;
import se.janlindblom.toy.arch.lib.type.Word;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 *
 */
public class Bus implements Wiring {
	private int width;
	private Word value;

	/**
	 * Creates a 16 bits wide bus.
	 */
	public Bus() {
		this.width = 16;
		value = new Word(0);
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#connectOutlet(java.util.Observer)
	 */
	public void connectOutlet(Observer o) {
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#getValue()
	 */
	public Value getValue() {
		return value;
	}

	public int getWidth() {
		return this.width;
	}

	public void setValue(Value value) {
		this.value = (Word)value;
	}
}
