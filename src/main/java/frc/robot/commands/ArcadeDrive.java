package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.TutorialDriveTrain_Subsystem;

public class ArcadeDrive extends Command{

    public ArcadeDrive(){
        super("ArcadeDrive");
        requires(Robot.driveTrain);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute(){
        Robot.driveTrain.TeleopDrive(Robot.m_oi.getJoystick());
    }

}