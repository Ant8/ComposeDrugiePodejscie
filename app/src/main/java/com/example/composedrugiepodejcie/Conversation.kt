package com.example.composedrugiepodejcie

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedrugiepodejcie.SampleData.conversationSample
import com.example.composedrugiepodejcie.ui.theme.ComposeDrugiePodejścieTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message -> MessageContent(message) }
    }
}

@Preview
@Composable
fun ConversationPreview() {
    ComposeDrugiePodejścieTheme {
        Conversation(messages = conversationSample)
    }
}

private val sampleData = listOf(
    "Lorem",
    "ipsum",
    "dolor",
    "sit",
    "amet",
    "consectetur",
    "adipiscing",
    "elit",
    "Integer",
    "sodales",
    "laoreet",
    "commodo",
    "Phasellus",
    "a",
    "purus",
    "eu",
    "risus",
    "elementum",
    "consequat",
    "Aenean",
    "eu",
    "elit",
)