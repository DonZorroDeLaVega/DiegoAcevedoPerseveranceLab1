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
public class System implements SelfCheckCapable {

	int Scan_Comms;
	int Scan_Camera;
	int Scan_Obstacle;
	int Scan_Direction;
	/**
	 * This starts the communications scan true or false
	 */
	void Comms_Status() {
		
	}
	/**
	 * This starts the camera scan true or false
	 */
	void Scan_Camera() {
		
	}
	/**
	 * This starts the obstacle scan true or false
	 */
	void Scan_Obstacle() {
		
	}
	/**
	 * This starts the direction scan true or false
	 */
	void Scan_Direction() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rover System";
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
