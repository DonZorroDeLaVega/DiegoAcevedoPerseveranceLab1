/**
 * 
 */
package edu.fiu.diegoacevedo.rover;

import edu.fiu.sysdesign.SelfCheckCapable;

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
