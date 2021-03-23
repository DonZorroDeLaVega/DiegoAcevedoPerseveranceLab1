/**
 * 
 */
package edu.fiu.diegoacevedo.rover;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

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
		return "Rover Camera: Ready to Take Video and Pictures";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
