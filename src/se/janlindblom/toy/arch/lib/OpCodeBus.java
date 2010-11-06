/**
 * 
 */
package se.janlindblom.toy.arch.lib;

import java.util.Observer;

import se.janlindblom.toy.arch.lib.instruction.Nop;
import se.janlindblom.toy.arch.lib.type.Instruction;
import se.janlindblom.toy.arch.lib.type.OpCode;
import se.janlindblom.toy.arch.lib.type.Value;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class OpCodeBus implements Wiring {
	private int width;
	private OpCode opcode;
	
	/**
	 * 
	 */
	public OpCodeBus() {
		this.width = 4;
		this.setOpcode(new Nop().getOpCode());
	}
	
	public OpCodeBus(Instruction instr) {
		this();
		this.setOpcode(instr.getOpCode());
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
		return opcode;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#getWidth()
	 */
	public int getWidth() {
		return width;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.toy.arch.lib.Wiring#setValue(se.janlindblom.toy.arch.lib.type.Value)
	 */
	public void setValue(Value value) {
		if (value.getClass().equals(OpCode.class))
			this.opcode = (OpCode)value;
	}

	public void setOpcode(OpCode opcode) {
		this.opcode = opcode;
	}

	public OpCode getOpcode() {
		return opcode;
	}

}
