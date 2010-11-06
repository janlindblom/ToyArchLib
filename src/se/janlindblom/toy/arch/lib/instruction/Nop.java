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
public class Nop implements Instruction {
	private OpCode opCode;
	private String mnemonic;
	private Address address;

	/**
	 * 
	 */
	public Nop() {
		this.opCode = new OpCode(12);
		this.mnemonic = "NOP";
	}
	
	public Nop(OpCode opcode) {
		this();
		this.opCode = opcode;
	}
	
	public Nop(Address address) {
		this();
		this.address = address;
	}
	
	public Nop(OpCode opcode, Address address) {
		this();
		this.opCode = opcode;
		this.address = address;
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
		return mnemonic;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.type.Instruction#getOpCode()
	 */
	public OpCode getOpCode() {
		return opCode;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.type.Instruction#setAddress(se.janlindblom.toy.arch.lib.type.Address)
	 */
	public void setAddress(Address addr) {
		this.address = addr;
	}

}
