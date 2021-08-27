package com.example.composedrugiepodejcie.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composedrugiepodejcie.compose.SampleData.conversationSample
import com.example.composedrugiepodejcie.compose.ui.theme.ComposeDrugiePodejścieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDrugiePodejścieTheme {
                Conversation(messages = conversationSample)
            }
        }
    }
}
