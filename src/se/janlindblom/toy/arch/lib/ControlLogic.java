/**
 * 
 */
package se.janlindblom.toy.arch.lib;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class ControlLogic {
	private OpCodeBus opcode;
	private Wire writeRAM;
	private Wire incPC;
	private Wire clockPC;
	private Wire addrIR;
	private Wire clockACC;
	private Wire aluCIN;
	private Wire aluMode;
	private Wire alu0;
	private Wire alu1;
	private Wire alu2;
	private Wire alu3;

	public ControlLogic() {
		this.setOpcode(new OpCodeBus());
		this.setWriteRAM(new Wire());
		this.setIncPC(new Wire());
		this.setClockPC(new Wire());
		this.setAddrIR(new Wire());
		this.setClockACC(new Wire());
		this.setAluCIN(new Wire());
		this.setAluMode(new Wire());
		this.setAlu0(new Wire());
		this.setAlu1(new Wire());
		this.setAlu2(new Wire());
		this.setAlu3(new Wire());
	}
	
	/**
	 * @return the opcode
	 */
	public OpCodeBus getOpcode() {
		return opcode;
	}
	/**
	 * @param opcode the opcode to set
	 */
	public void setOpcode(OpCodeBus opcode) {
		this.opcode = opcode;
	}
	/**
	 * @return the writeRAM
	 */
	public Wire getWriteRAM() {
		return writeRAM;
	}
	/**
	 * @param writeRAM the writeRAM to set
	 */
	public void setWriteRAM(Wire writeRAM) {
		this.writeRAM = writeRAM;
	}
	/**
	 * @return the incPC
	 */
	public Wire getIncPC() {
		return incPC;
	}
	/**
	 * @param incPC the incPC to set
	 */
	public void setIncPC(Wire incPC) {
		this.incPC = incPC;
	}
	/**
	 * @return the clockPC
	 */
	public Wire getClockPC() {
		return clockPC;
	}
	/**
	 * @param clockPC the clockPC to set
	 */
	public void setClockPC(Wire clockPC) {
		this.clockPC = clockPC;
	}
	/**
	 * @return the addrIR
	 */
	public Wire getAddrIR() {
		return addrIR;
	}
	/**
	 * @param addrIR the addrIR to set
	 */
	public void setAddrIR(Wire addrIR) {
		this.addrIR = addrIR;
	}
	/**
	 * @return the clockACC
	 */
	public Wire getClockACC() {
		return clockACC;
	}
	/**
	 * @param clockACC the clockACC to set
	 */
	public void setClockACC(Wire clockACC) {
		this.clockACC = clockACC;
	}
	/**
	 * @return the aluCIN
	 */
	public Wire getAluCIN() {
		return aluCIN;
	}
	/**
	 * @param aluCIN the aluCIN to set
	 */
	public void setAluCIN(Wire aluCIN) {
		this.aluCIN = aluCIN;
	}
	/**
	 * @return the aluMode
	 */
	public Wire getAluMode() {
		return aluMode;
	}
	/**
	 * @param aluMode the aluMode to set
	 */
	public void setAluMode(Wire aluMode) {
		this.aluMode = aluMode;
	}
	/**
	 * @return the alu0
	 */
	public Wire getAlu0() {
		return alu0;
	}
	/**
	 * @param alu0 the alu0 to set
	 */
	public void setAlu0(Wire alu0) {
		this.alu0 = alu0;
	}
	/**
	 * @return the alu1
	 */
	public Wire getAlu1() {
		return alu1;
	}
	/**
	 * @param alu1 the alu1 to set
	 */
	public void setAlu1(Wire alu1) {
		this.alu1 = alu1;
	}
	/**
	 * @return the alu2
	 */
	public Wire getAlu2() {
		return alu2;
	}
	/**
	 * @param alu2 the alu2 to set
	 */
	public void setAlu2(Wire alu2) {
		this.alu2 = alu2;
	}
	/**
	 * @return the alu3
	 */
	public Wire getAlu3() {
		return alu3;
	}
	/**
	 * @param alu3 the alu3 to set
	 */
	public void setAlu3(Wire alu3) {
		this.alu3 = alu3;
	}
}
