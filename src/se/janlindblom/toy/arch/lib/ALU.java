/**
 * 
 */
package se.janlindblom.toy.arch.lib;

import se.janlindblom.toy.arch.lib.type.OpCode;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class ALU {
	private OpCode opcode;
	private Wire writeRAM;
	private Wire incPC;
	private Wire clockPC;
	private Wire addrIR;
	private Wire clockACC;
	private Wire aluCIN;

}
