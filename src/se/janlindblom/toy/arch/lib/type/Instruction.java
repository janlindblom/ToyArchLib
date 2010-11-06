package se.janlindblom.toy.arch.lib.type;

public interface Instruction {
	
	public OpCode getOpCode();
	public String getMnemonic();
	public Address getAddress();
	public void setAddress(Address addr);
}
