package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;

public class TutorialDriveTrain_Subsystem extends Subsystem{
        //They changed the way drivetrains work. Now they have speed controllers which move groups of motors
    //ERROR: m_left either need to be a part of oi or we need an instance of robot from somewhere.
    private DifferentialDrive mainDriveTrain = new DifferentialDrive(Robot.m_left, Robot.m_right);
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive()); 
    }

    public void TeleopDrive(Joystick Driver){
        mainDriveTrain.arcadeDrive(Driver.getX(),Driver.getY());
    }

    public void Stop(){

    }
}