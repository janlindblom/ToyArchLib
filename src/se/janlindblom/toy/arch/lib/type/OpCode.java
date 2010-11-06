/**
 * 
 */
package se.janlindblom.toy.arch.lib.type;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class OpCode implements Value {
	private int opcode;

	/**
	 * 
	 */
	public OpCode() {
		this.setOpcode(0);
	}
	
	public OpCode(int opcode) {
		this();
		this.setOpcode(opcode);
	}

	/**
	 * @param opcode the opcode to set
	 */
	public void setOpcode(int opcode) {
		this.opcode = opcode;
	}

	/**
	 * @return the opcode
	 */
	public int intValue() {
		return opcode;
	}

}
