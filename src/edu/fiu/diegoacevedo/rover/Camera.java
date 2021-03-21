/**
 * 
 */
package edu.fiu.diegoacevedo.rover;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author diegoacevedo
 *
 */
public class Camera implements SelfCheckCapable {

	int On;
	/**
	 * This takes picture
	 */
	void Picture() {
		
	}
	/**
	 * This takes video
	 */
	void Video() {
		
	}
	/**
	 * This transmits video or picture
	 */
	void Transmit() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
