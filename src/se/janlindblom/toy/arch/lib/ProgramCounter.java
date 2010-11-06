/**
 * 
 */
package se.janlindblom.toy.arch.lib;

import java.util.Observable;
import java.util.Observer;

import se.janlindblom.toy.arch.lib.type.Address;
import se.janlindblom.toy.arch.lib.type.Value;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class ProgramCounter implements Register, Observer {
	private Address address;
	private int width;
	private Wire clock;
	private Wire inc;
	
	public ProgramCounter() {
		this.address = new Address();
		this.width = 12;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Register#getValue()
	 */
	public Value getValue() {
		return this.address;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Register#getWidth()
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * @param clock the clock to set
	 */
	public void setClock(Wire clock) {
		this.clock = clock;
	}

	/**
	 * @return the clock
	 */
	public Wire getClock() {
		return clock;
	}

	/**
	 * @param inc the inc to set
	 */
	public void setInc(Wire inc) {
		this.inc = inc;
	}

	/**
	 * @return the inc
	 */
	public Wire getInc() {
		return inc;
	}

	public void update(Observable arg0, Object arg1) {
		// TODO: update should trigger either inc or clock
		// depending on what wire triggered the update.
	}

}
