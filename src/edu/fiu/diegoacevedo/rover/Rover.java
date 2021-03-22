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
public class Rover implements SelfCheckCapable {

	int Operational;
	/**
	 * This checks if Rover has power true or false
	 */
	void Power() {
	
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rover Unit";
		
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
