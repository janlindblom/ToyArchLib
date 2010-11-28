package se.janlindblom.toy.arch.lib;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 *
 */
public class ALU {
	private Bus accIn;
	private Bus dataIn;
	private Bus aluOut;
	private Wire aluCIN;
	private Wire aluMode;
	private Wire alu0;
	private Wire alu1;
	private Wire alu2;
	private Wire alu3;
	
	/**
	 * 
	 */
	public ALU() {
		this.accIn = new Bus();
		this.dataIn = new Bus();
		this.aluOut = new Bus();
		this.aluCIN = new Wire();
		this.aluMode = new Wire();
		this.alu0 = new Wire();
		this.alu1 = new Wire();
		this.alu2 = new Wire();
		this.alu3 = new Wire();
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
	 * @param dataIn the dataIn to set
	 */
	public void setDataIn(Bus dataIn) {
		this.dataIn = dataIn;
	}

	/**
	 * @return the dataIn
	 */
	public Bus getDataIn() {
		return dataIn;
	}

	/**
	 * @param aluOut the aluOut to set
	 */
	public void setAluOut(Bus aluOut) {
		this.aluOut = aluOut;
	}

	/**
	 * @return the aluOut
	 */
	public Bus getAluOut() {
		return aluOut;
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
