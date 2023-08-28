package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OnBoardIO;




public class ToggleLightsBasedOnGyro extends CommandBase {
    private final OnBoardIO m_Io;

    public ToggleLightsBasedOnGyro(OnBoardIO io) {
        m_Io = io;
        addRequirements(io);
    }



@Override
public void execute() {
    double gyroangle = m_Io.m_drivetrain.m_gyro.getAngleZ();
   }
}
  