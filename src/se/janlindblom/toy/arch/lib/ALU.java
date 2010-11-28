/**
 * 
 */
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
	
	public ALU() {
		
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
}
