package edu.ihs5459.robotex;

import org.strongback.command.CommandGroup;
import org.strongback.components.Motor;
import org.strongback.components.ui.FlightStick;

//assuming it is a one motor shooter like the one on Rook

public class Shooter1 extends CommandGroup {
	Motor shooterMotor;
	FlightStick triggerFlightStick;
	
	public Shooter1 (Motor shooterMotor, FlightStick triggerFlightStick){
		sequentially(new getTrigger(triggerFlightStick), new TimedShoot(shooterMotor));
		
	}
	

}
