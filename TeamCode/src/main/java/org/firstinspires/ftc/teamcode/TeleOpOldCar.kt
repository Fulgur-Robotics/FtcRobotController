package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

@TeleOp(name = "Pour Theo")
class TeleOpOldCar : LinearOpMode() {
    lateinit var revRobot: RevRobot
    override fun runOpMode() {
        revRobot = RevRobot(hardwareMap = hardwareMap, gamepad = gamepad1)

        waitForStart()

        while (opModeIsActive()) {
            val gX = revRobot.gamepad.right_stick_x.toDouble()
            val gY = revRobot.gamepad.left_stick_y.toDouble()
            revRobot.motorLeft.power = gY + gX
            revRobot.motorRight.power = gY - gX

            if (revRobot.gamepad.left_trigger_pressed) {
                revRobot.ramasseur.power = 1.toDouble()
            } else if (revRobot.gamepad.left_bumper) {
                revRobot.ramasseur.power = (-1).toDouble()
            } else {
                revRobot.ramasseur.power = 0.toDouble()
            }
        }
    }

}