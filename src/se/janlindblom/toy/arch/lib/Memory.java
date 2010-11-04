package se.janlindblom.toy.arch.lib;

import se.janlindblom.toy.arch.lib.type.Word;

public class Memory {
	private int size;
	private Word[] memory;
	
	public Memory() {
		this.setSize(64*1024);
		this.setMemory(new Word[this.getSize()]);
	}
	
	public Memory(int size) {
		this();
		this.setSize(size);
		this.setMemory(new Word[this.getSize()]);
	}
	
	public void store(int addr, Word data) {
		memory[addr] = data;
	}
	
	public Word read(int addr) {
		return memory[addr];
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setMemory(Word[] memory) {
		this.memory = memory;
	}
	public Word[] getMemory() {
		return memory;
	}

}
