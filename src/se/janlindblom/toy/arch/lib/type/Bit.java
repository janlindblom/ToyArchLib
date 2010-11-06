/**
 * 
 */
package se.janlindblom.toy.arch.lib.type;

/**
 * @author jan
 *
 */
public class Bit implements Value {
	private boolean value;
	
	public Bit() {
		this.setValue(false);
	}
	
	public Bit(boolean value) {
		this();
		this.setValue(value);
	}
	
	public Bit(int value) {
		this();
		this.setValue(value);
	}

	private void setValue(int value) {
		if (value == 1)
			this.setValue(true);
		else
			this.setValue(false);
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(boolean value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public boolean getValue() {
		return value;
	}
	
	public int intValue() {
		if (value)
			return 1;
		else
			return 0;
	}
}
