package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.Gamepad
import com.qualcomm.robotcore.hardware.HardwareMap

class RevRobot(val hardwareMap: HardwareMap, val gamepad: Gamepad) {
    val motorLeft = hardwareMap.get(DcMotor::class.java, "L").apply {
        direction = DcMotorSimple.Direction.FORWARD
    };
    val motorRight = hardwareMap.get(DcMotor::class.java, "R").apply {
        direction = DcMotorSimple.Direction.FORWARD
    }
    val ramasseur = hardwareMap.get(DcMotor::class.java, "R")
}