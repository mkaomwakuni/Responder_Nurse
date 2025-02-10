package est.mkao.emergency.response

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Nurse Responder",
    ) {
        App()
    }
}