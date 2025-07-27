package com.example.clumsy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.clumsy.ui.theme.ClumsyTheme
import java.io.DataOutputStream
import java.io.IOException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClumsyTheme {
                ClumsyApp()
            }
        }
    }
}

@Composable
fun ClumsyApp() {
    var isActive by remember { mutableStateOf(false) }
    var latency by remember { mutableStateOf(100) }
    var packetLoss by remember { mutableStateOf(10) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "CLUMSY NETWORK EMULATOR",
                color = Color.Red,
                style = MaterialTheme.typography.headlineMedium
            )

            Slider(...) // Полный код см. выше
            Button(...) // Полный код см. выше
        }
    }
}

// Функции applyNetworkRules() и clearNetworkRules() см. в предыдущем ответе