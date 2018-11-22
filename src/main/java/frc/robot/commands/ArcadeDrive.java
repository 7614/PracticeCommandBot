package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class ArcadeDrive extends Command{

    public ArcadeDrive(){
        requires(Robot.DriveTrain);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute(){
        Robot.DriveTrain.TeleopDrive(Robot.m_oi.getJoystick());
    }

}