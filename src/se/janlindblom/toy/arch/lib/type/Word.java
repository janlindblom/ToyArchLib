package se.janlindblom.toy.arch.lib.type;

public class Word {
	private byte[] word;
	
	public Word() {
		setWord(new byte[2]);
	}
	
	public Word(byte msb, byte lsb) {
		this();
		this.store(msb, lsb);
	}
	
	public void store(byte msb, byte lsb) {
		word[0] = msb;
		word[1] = lsb;
	}
	
	public int intValue() {
		int retval = 0;
		retval = (word[0] << 8) & word[1];
		return retval;
	}

	public void setWord(byte[] word) {
		this.word = word;
	}

	public byte[] getWord() {
		return word;
	}
}
