package se.janlindblom.toy.arch.lib.type;

/**
 * 
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public class Word implements Value {
	private short word;
	
	public Word() {
		setWord((short)0);
	}
	
	public Word(short word) {
		this();
		this.setWord(word);
	}
	
	public Word(int word) {
		this();
		this.setWord(word);
	}
	
	public int intValue() {
		return (int)word;
	}

	public void setWord(short word) {
		this.word = word;
	}
	
	public void setWord(int word) {
		this.word = (short)word;
	}

	public short getWord() {
		return word;
	}
}
