package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by admin on 12/8/2015.
 */
public class test extends OpMode {
    //Setting Variables
    DcMotor motorRight;
    DcMotor motorLeft;

    public  void init() {

        motorRight = hardwareMap.dcMotor.get("M1");
        motorLeft = hardwareMap.dcMotor.get("M2");
        //motor_left.setDirection(DcMotor.Direction.REVERSE);
    }
    public void loop() {
        float throttle = gamepad1.left_stick_y;
        float direction = gamepad1.left_stick_x;
        float rightMove = throttle + direction;
        float leftMove = throttle - direction;
        motorLeft.setPower(rightMove);
        motorLeft.setPower(leftMove);

        telemetry.addData("Right Motor Power",rightMove);
        telemetry.addData("Left Motor Power",leftMove);

    }
}
