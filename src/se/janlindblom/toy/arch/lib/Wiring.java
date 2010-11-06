/**
 * 
 */
package se.janlindblom.toy.arch.lib;

import java.util.Observer;

import se.janlindblom.toy.arch.lib.type.Value;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 *
 */
public interface Wiring {
	
	public Value getValue();
	public void setValue(Value value);
	
	public void connectOutlet(Observer o);
	
	public int getWidth();

}
