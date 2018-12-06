package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;

public class TutorialDriveTrain_Subsystem extends Subsystem{
        //They changed the way drivetrains work. Now they have speed controllers which move groups of motors
    //ERROR: m_left either need to be a part of oi or we need an instance of robot from somewhere.
    //private DifferentialDrive mainDriveTrain = new DifferentialDrive(Robot.leftGroup, Robot.rightGroup);
    private WPI_TalonSRX leftBack =  new WPI_TalonSRX(RobotMap.LEFTBACK);
    private WPI_TalonSRX leftFront =  new WPI_TalonSRX(RobotMap.LEFTFRONT);
    private SpeedControllerGroup leftGroup = new SpeedControllerGroup(leftBack, leftFront);

    private WPI_TalonSRX rightBack =  new WPI_TalonSRX(RobotMap.RIGHTBACK);
    private WPI_TalonSRX rightFront =  new WPI_TalonSRX(RobotMap.RIGHTFRONT);
    private SpeedControllerGroup rightGroup = new SpeedControllerGroup(rightBack, rightFront);

    DifferentialDrive driveMotors = new DifferentialDrive(leftGroup, rightGroup);
    
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive()); 
    }

    public void TeleopDrive(XboxController Controller){
        driveMotors.arcadeDrive(Controller.getY(Hand.kLeft),Controller.getX(Hand.kLeft));
        
    }

    public void Stop(){

    }
}