// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc0.Warbot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Encoder driveTrainLeftEncoder;
    public static Encoder driveTrainRightEncoder;
    public static Gyro driveTrainGyro;
    public static SpeedController driveTrainRightSpeedController;
    public static SpeedController driveTrainLeftSpeedController;
    public static RobotDrive driveTrainRobotDrive;
    public static SpeedController elevatorMotor;
    public static AnalogChannel elevatorPot;
    public static SpeedController shooterKickerMotor;
    public static SpeedController shooterShooterMotor;
    public static DigitalInput shooterLimitSwitch;
    public static SpeedController pickupBeltMotor;
    public static SpeedController pickupShaftMotor;
    public static SpeedController climberMotor;
    public static DigitalInput climberLimit;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftEncoder = new Encoder(1, 1, 1, 2, false, EncodingType.k4X);
	LiveWindow.addSensor("Drive Train", "Left Encoder", driveTrainLeftEncoder);
        driveTrainLeftEncoder.setDistancePerPulse(0.04177);
        driveTrainLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainLeftEncoder.start();
        driveTrainRightEncoder = new Encoder(1, 3, 1, 4, false, EncodingType.k4X);
	LiveWindow.addSensor("Drive Train", "Right Encoder", driveTrainRightEncoder);
        driveTrainRightEncoder.setDistancePerPulse(1.0);
        driveTrainRightEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainRightEncoder.start();
        driveTrainGyro = new Gyro(1, 1);
	LiveWindow.addSensor("Drive Train", "Gyro", driveTrainGyro);
        driveTrainGyro.setSensitivity(0.007);
        driveTrainRightSpeedController = new Jaguar(1, 2);
	LiveWindow.addActuator("Drive Train", "Right Speed Controller", (Jaguar) driveTrainRightSpeedController);
        
        driveTrainLeftSpeedController = new Jaguar(1, 1);
	LiveWindow.addActuator("Drive Train", "Left Speed Controller", (Jaguar) driveTrainLeftSpeedController);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainLeftSpeedController, driveTrainRightSpeedController);
	
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        
        elevatorMotor = new Jaguar(1, 10);
	LiveWindow.addActuator("Elevator", "Motor", (Jaguar) elevatorMotor);
        
        elevatorPot = new AnalogChannel(1, 4);
	LiveWindow.addSensor("Elevator", "Pot", elevatorPot);
        
        shooterKickerMotor = new Victor(1, 6);
	LiveWindow.addActuator("Shooter", "Kicker Motor", (Victor) shooterKickerMotor);
        
        shooterShooterMotor = new Victor(1, 5);
	LiveWindow.addActuator("Shooter", "Shooter Motor", (Victor) shooterShooterMotor);
        
        shooterLimitSwitch = new DigitalInput(1, 6);
	LiveWindow.addSensor("Shooter", "Limit Switch", shooterLimitSwitch);
        
        pickupBeltMotor = new Jaguar(1, 4);
	LiveWindow.addActuator("Pickup Belt", "Motor", (Jaguar) pickupBeltMotor);
        
        pickupShaftMotor = new Jaguar(1, 3);
	LiveWindow.addActuator("Pickup Shaft", "Motor", (Jaguar) pickupShaftMotor);
        
        climberMotor = new Jaguar(1, 9);
	LiveWindow.addActuator("Climber", "Motor", (Jaguar) climberMotor);
        
        climberLimit = new DigitalInput(1, 5);
	LiveWindow.addSensor("Climber", "Limit", climberLimit);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
