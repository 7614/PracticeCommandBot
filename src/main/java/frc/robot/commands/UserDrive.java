package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Drive_System;;

public class UserDrive extends Command{

    public UserDrive(){
        super("UserDrive");
        requires(Robot.driveTrain);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute(){
        Robot.driveTrain.drive(Robot.xbox);
    }

}