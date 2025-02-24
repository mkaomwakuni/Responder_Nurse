package est.mkao.emergency.response

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import est.mkao.emergency.response.screens.HomeScreen
import org.jetbrains.compose.resources.painterResource

import nurseresponder.composeapp.generated.resources.Res
import nurseresponder.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    HomeScreen()
}