/**
 * 
 */
package edu.fiu.diegoacevedo.rover;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author diegoacevedo
 *
 */
public class System implements SelfCheckCapable {

	boolean Scan_Comms;
	boolean Scan_Camera;
	boolean Scan_Obstacle;
	boolean Scan_Direction;
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
