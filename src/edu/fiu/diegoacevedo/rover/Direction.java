/**
 * 
 */
package edu.fiu.diegoacevedo.rover;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author diegoacevedo
 *
 */
public class Direction implements SelfCheckCapable {

	int Power_Value;
	
	/**
	 * This takes the Rover forward at speed based on Power_Value for each wheel
	 */
	void Forward() {
		
	}
	/**
	 * This takes the Rover backwards at speed based on Power_Value for each wheel
	 */
	void Backward() {
		
	}
	/**
	 * This turns the Rover left at speed based on Power_Value for each wheel
	 */
	void Left() {
		
	}
	/**
	 * This turns the Rover right at speed based on Power_Value for each wheel
	 */
	void Right() {
		
	}
	/**
	 * This spins the Rover at speed based on Power_Value for each wheel
	 */
	void Spin() {
		
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
