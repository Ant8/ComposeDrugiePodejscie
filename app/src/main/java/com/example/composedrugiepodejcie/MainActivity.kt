package com.example.composedrugiepodejcie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedrugiepodejcie.ui.theme.ComposeDrugiePodejścieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageContent()
        }
    }
}

@Composable
fun MessageContent(
    text: String = "Hello world!"
) {
    Text(text)
}

@Preview
@Composable
fun PreviewMessageContent() {
    MessageContent()
}