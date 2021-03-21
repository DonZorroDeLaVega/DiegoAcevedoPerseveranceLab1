/**
 * 
 */
package edu.fiu.diegoacevedo.rover;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author diegoacevedo
 *
 */
public class Obstacle implements SelfCheckCapable {

	String Obstructed;
	String Clear;
	
	/**
	 * This starts the ultrasonic scan
	 */
	void Ultrasonic_Scan() {
		
	}
	/**
	 * This starts the distance evaluation
	 */
	void Distance_Eval() {
		
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
