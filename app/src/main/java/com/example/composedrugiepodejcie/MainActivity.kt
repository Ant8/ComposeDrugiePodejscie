package com.example.composedrugiepodejcie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageContent(Message("wesół awtor", "wesoła treźdź"))
        }
    }
}

@Composable
private fun MessageContent(
    message: Message = Message()
) {
    Column {
        Text(message.author)
        Text(message.body)
    }
}

@Preview
@Composable
fun PreviewMessageContent() {
    MessageContent()
}

private data class Message(
    val author: String = "John Doe",
    val body: String = "Hello welt",
)