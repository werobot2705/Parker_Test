


// This is a command. It's called by Robot and uses the subsystem DriveTrain
package org.usfirst.frc.team2705.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2705.robot.Robot;
import org.usfirst.frc.team2705.robot.subsystems.DriveTrain;

/**
 *
 */
public class TankDrive extends Command {
	
	private DriveTrain dt = Robot.driveTrain;

    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);		// Shows that this command uses driveTrain in Robot
    }

    // Called just before this Command runs the first time
    protected void initialize() {	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	dt.driveTwo();	// Calls driveTwo in DriveTrain, which uses arcadeDrive to drive
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
