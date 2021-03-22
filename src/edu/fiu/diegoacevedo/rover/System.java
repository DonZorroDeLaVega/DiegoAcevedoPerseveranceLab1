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
	int Scan_Rover;
	
	/**
	 * This starts the communications scan true or false
	 */
	void Scan_Comms() {
		
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
	/**
	* This starts the Rover scan true or false
	*/
	void Scan_Rover() {
		
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
			Camera myCamera = new Camera();
			myCamera.runSelfCheck();
			Comms myComms = new Comms();
			myComms.runSelfCheck();
			Direction myDirection = new Direction();
			myDirection.runSelfCheck();
			Obstacle myObstacle = new Obstacle();
			myObstacle.runSelfCheck();
			Rover myRover = new Rover();
			myRover.runSelfCheck();
	}

}
