package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Jaguar;
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
        TalonSRX controller = new TalonSRX(1);
        controller.set
        controller.set(Mode, 1.0);
        WPI_TalonSRX control = new WPI_TalonSRX(2);
        control.change
        control.set
    }

}