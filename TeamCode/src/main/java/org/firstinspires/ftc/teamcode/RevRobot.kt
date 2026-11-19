package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.Gamepad
import com.qualcomm.robotcore.hardware.HardwareMap
import com.qualcomm.robotcore.hardware.Servo

class RevRobot(val hardwareMap: HardwareMap, val gamepad: Gamepad) {
    val motorLeft = hardwareMap.get(DcMotor::class.java, "L").apply {
        direction = DcMotorSimple.Direction.FORWARD
    };
    val motorRight = hardwareMap.get(DcMotor::class.java, "R").apply {
        direction = DcMotorSimple.Direction.FORWARD
    }
    val ramasseur = hardwareMap.get(DcMotor::class.java, "R")
    val pusher = hardwareMap.get(Servo::class.java, "P")
    fun rightStickX() : Double {
        return gamepad.right_stick_x.toDouble()
    }
    fun rightStickY() : Double {
        return gamepad.right_stick_y.toDouble()
    }
    fun leftStickX() : Double {
        return gamepad.left_stick_x.toDouble()
    }
    fun leftStickY() : Double {
        return gamepad.left_stick_y.toDouble()
    }
    fun leftTrigger() : Boolean {
        return gamepad.left_trigger_pressed
    }
    fun rightTrigger() : Boolean {
        return gamepad.right_trigger_pressed
    }
    fun leftBumper() : Boolean {
        return gamepad.left_bumper
    }
    fun rightBumper() : Boolean {
        return gamepad.right_bumper
    }
    fun togglePusher() {
        pusher.position = 1 - pusher.position
    }
    fun startRamasseur() {
        ramasseur.power = 1.toDouble()
    }
    fun stopRamasseur() {
        ramasseur.power = 0.toDouble()
    }
    fun backRamasseur() {
        ramasseur.power = (-1).toDouble()
    }
}