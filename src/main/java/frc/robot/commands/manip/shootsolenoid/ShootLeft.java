// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.manip.shootsolenoid;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ShootLeft extends CommandBase {
  /** Creates a new ShootLeft. */
  public ShootLeft() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {Robot.manip.ball1Out();}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {Robot.manip.ball1In();}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
