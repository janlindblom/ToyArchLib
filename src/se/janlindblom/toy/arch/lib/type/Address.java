/**
 * 
 */
package se.janlindblom.toy.arch.lib.type;

/**
 * @author jan
 *
 */
public class Address implements Value {
	private short address;

	/**
	 * 
	 */
	public Address() {
		// TODO Auto-generated constructor stub
		this.setAddress(0);
	}
	
	public Address(short address) {
		this();
		this.setAddress(address);
	}
	
	public Address(int address) {
		this();
		this.setAddress(address);
	}

	public void setAddress(short address) {
		this.address = address;
	}
	
	public void setAddress(int address) {
		this.address = (short)address;
	}

	public int intValue() {
		return (int)address;
	}

}
