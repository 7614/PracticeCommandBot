/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    /// CREATING JOYSTICKS
  // Each joystick seems to be a unique controller, ie. we only need 1 joystick,
  // and all buttons will be mapped onto it.
   XboxController xbox = new XboxController(0);
  // This constructs the OI, that is, we tell the robot to make a new OI on runtime,
  // with all of the buttons and joysticks that we tell it to have here.
  public OI(){
   
   //Button button = new JoystickButton(stick, 2); //(still not working)
  }

  
  //Tutorial man said I had to, so I did.
  // (but seriously though, this allows us to acess the joystick we made at the top)
  public XboxController getJoystick(){
    return xbox;
    

  }
}
/* The Rest of this trash is just pre-made comments*/


  
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
