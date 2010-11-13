/**
 * 
 */
package se.janlindblom.toy.arch.lib.instruction;

import se.janlindblom.toy.arch.lib.type.Address;
import se.janlindblom.toy.arch.lib.type.Instruction;
import se.janlindblom.toy.arch.lib.type.OpCode;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class Store implements Instruction {
	private OpCode opCode;
	private String mnemonic;
	private Address address;

	/**
	 * 
	 */
	public Store() {
		this.opCode = new OpCode();
		this.mnemonic = "STORE";
	}
	
	public Store(Address addr) {
		this();
		this.setAddress(addr);
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.type.Instruction#getAddress()
	 */
	public Address getAddress() {
		return address;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.type.Instruction#getMnemonic()
	 */
	public String getMnemonic() {
		return this.mnemonic;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.type.Instruction#getOpCode()
	 */
	public OpCode getOpCode() {
		return this.opCode;
	}

	public void setAddress(Address addr) {
		this.address = addr;
	}

}
