package se.janlindblom.toy.arch.lib.type;

public class Word {
	private short word;
	
	public Word() {
		setWord((short)0);
	}
	
	public Word(short word) {
		this();
		this.setWord(word);
	}
	
	public int intValue() {
		return (int)word;
	}

	public void setWord(short word) {
		this.word = word;
	}

	public short getWord() {
		return word;
	}
}
