package se.janlindblom.toy.arch.lib;

import se.janlindblom.toy.arch.lib.type.Value;

/**
 * 
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public interface Register {
	
	public int getWidth();
	public Value getValue();

}
