package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

@TeleOp(name = "Téléopéré")
class TeleOpOldCar : LinearOpMode() {
    lateinit var revRobot: RevRobot
    override fun runOpMode() {
        revRobot = RevRobot(hardwareMap = hardwareMap, gamepad = gamepad1)

        waitForStart()

        while (opModeIsActive()) {
            revRobot.motorLeft.power = revRobot.leftStickY() + revRobot.rightStickX()
            revRobot.motorRight.power = revRobot.leftStickY() - revRobot.rightStickX()

            if (revRobot.leftTrigger()) {
                revRobot.startRamasseur()
            } else if (revRobot.leftBumper()) {
                revRobot.backRamasseur()
            } else {
                revRobot.stopRamasseur()
            }
            if (revRobot.gamepad.y) {
                revRobot.togglePusher()
            }
        }
    }

}