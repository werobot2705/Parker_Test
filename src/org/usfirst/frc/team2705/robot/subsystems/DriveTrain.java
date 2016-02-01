
package org.usfirst.frc.team2705.robot.subsystems;

import org.usfirst.frc.team2705.robot.OI;
import org.usfirst.frc.team2705.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static DriveTrain instance;	// see getInstance()
	
	private final RobotDrive myDrive;

	private final CANTalon Left;
	private final CANTalon Right;
	
	private DriveTrain(){
	
		Left = new CANTalon(1);
		Right = new CANTalon(2);
		myDrive = new RobotDrive(Left, Right);
		
		Left.setPosition(0);
		Right.setPosition(0);
	}
	
	public static DriveTrain getInstance(){		// We need this I think, but I don't know why. Think it has to do	
		if (instance == null){					// with autonomous mode.
			instance = new DriveTrain();
		}
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TankDrive());		// Sets the default subsystem to DriveTrain
    }
    
    public void driveTwo(){
    	myDrive.arcadeDrive(OI.getStick());		// Calls getStick() from OI. The same as arcadeDrive(stick)
    }
}

