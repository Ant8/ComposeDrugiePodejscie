package com.example.composedrugiepodejcie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedrugiepodejcie.ui.theme.ComposeDrugiePodejścieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDrugiePodejścieTheme {
                MessageContent(Message("wesół awtor", "wesoła treźdź"))
            }
        }
    }
}

@Composable
private fun MessageContent(
    message: Message = Message()
) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "igonga",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colors.secondaryVariant, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                message.author,
                modifier = Modifier.border(2.dp, MaterialTheme.colors.secondaryVariant, CircleShape),
                style = MaterialTheme.typography.subtitle2
            )
            
            Spacer(modifier = Modifier.height(8.dp))

            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    message.body,
                    modifier = Modifier.padding(all = 8.dp),
                    color = MaterialTheme.colors.error,
                    style = MaterialTheme.typography.body1,
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewMessageContent() {
    ComposeDrugiePodejścieTheme {
        MessageContent()
    }
}

private data class Message(
    val author: String = "John Doe",
    val body: String = "Hello welt",
)