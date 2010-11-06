/**
 * 
 */
package se.janlindblom.toy.arch.lib;

import se.janlindblom.toy.arch.lib.type.Address;
import se.janlindblom.toy.arch.lib.type.OpCode;
import se.janlindblom.toy.arch.lib.type.Value;
import se.janlindblom.toy.arch.lib.type.Word;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class InstructionRegister implements Register {
	private OpCode opcode;
	private Address address;
	private Word input;
	private int width;
	
	public InstructionRegister() {
		this.setOpcode(new OpCode());
		this.setAddress(new Address());
		this.setInput(new Word());
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Register#getValue()
	 */
	public Value getValue() {
		return this.getInput();
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Register#getWidth()
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param opcode the opcode to set
	 */
	public void setOpcode(OpCode opcode) {
		this.opcode = opcode;
	}

	/**
	 * @return the opcode
	 */
	public OpCode getOpcode() {
		return opcode;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(Word input) {
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public Word getInput() {
		return input;
	}

}
