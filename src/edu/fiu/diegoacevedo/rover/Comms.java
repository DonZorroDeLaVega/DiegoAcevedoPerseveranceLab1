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
public class Comms implements SelfCheckCapable {
	
	int Connect;
	/**
	 * This receives communications to Rover
	 */
	void Receive() {
		
	}
	/**
	 * This transmits communications to Ground Control
	 */
	void Transmit() {
		
	}
	/**
	 * This commits actions to Rover
	 */
	void Action() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rover Comms";
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
