/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static final int LEFTMOTOR = 0;
  public static final int RIGHTMOTOR = 1;
  public static final int ARMMOTOR = 2;
  //the joysticks can also be placed into a multitude of different ports apparently
  public static final int JOYSTICKPORT =1;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //copied from javadoc example of 4 wheel tank-drive
  Spark m_frontLeft = new Spark(1);
  Spark m_rearLeft = new Spark(2);
  //make getters for these laters
  public SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

  Spark m_frontRight = new Spark(3);
  Spark m_rearRight = new Spark(4);
  public SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

}
