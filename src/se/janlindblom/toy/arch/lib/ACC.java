package se.janlindblom.toy.arch.lib;

import java.util.Observable;
import java.util.Observer;
import se.janlindblom.toy.arch.lib.type.Value;
import se.janlindblom.toy.arch.lib.type.Word;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 *
 */
public class ACC implements Register, Observer {
	private int width;
	private Word value;
	private Bus accIn;
	private Bus accOut;
	private Wire clockACC;
	
	/**
	 * 
	 */
	public ACC() {
		this.width = 16;
		this.value = null;
		this.accIn = new Bus();
		this.accOut = new Bus();
		this.clockACC = new Wire();
	}

	/**
	 * @see se.janlindblom.toy.arch.lib.Register#getValue()
	 */
	public Value getValue() {
		return this.value;
	}

	/**
	 * @see se.janlindblom.toy.arch.lib.Register#getWidth()
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * @param accIn the accIn to set
	 */
	public void setAccIn(Bus accIn) {
		this.accIn = accIn;
	}

	/**
	 * @return the accIn
	 */
	public Bus getAccIn() {
		return accIn;
	}

	/**
	 * @param accOut the accOut to set
	 */
	public void setAccOut(Bus accOut) {
		this.accOut = accOut;
	}

	/**
	 * @return the accOut
	 */
	public Bus getAccOut() {
		return accOut;
	}

	/**
	 * @param clockACC the clockACC to set
	 */
	public void setClockACC(Wire clockACC) {
		this.clockACC = clockACC;
		this.clockACC.addObserver(this);
	}

	/**
	 * @return the clockACC
	 */
	public Wire getClockACC() {
		return clockACC;
	}

	/**
	 * 
	 */
	public void update(Observable arg0, Object arg1) {
		if (arg0.getClass().equals(Wire.class)) {
			this.value = (Word) accIn.getValue();
			this.accOut.setValue(value);
		}
	}

}
