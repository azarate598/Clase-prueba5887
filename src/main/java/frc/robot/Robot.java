// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  Joystick control = new Joystick(0);

CANSparkMax motor = new CANSparkMax(9, MotorType.kBrushless);
CANSparkMax motor2 = new CANSparkMax(8, MotorType.kBrushless);

DifferentialDrive chasis = new DifferentialDrive(motor, motor2);



  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  // EN ESTA PARTE PONGO LOS OBJETOS QUE QUIERO MOVER, CONTROLAR Y PROGRAMAR
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {

// hicimos que un boton mueva dos motores, true/mover  false/parar
  /*  if(control.getRawButton(1) == true){
    motor.set(0.1);
    motor2.set(0.1);

  } else {
    motor.set(0);
    motor2.set(0);
  }
*/

chasis.tankDrive(control.getRawAxis(1) * 0.2, control.getRawAxis(5) *0.2);


  }
    @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
