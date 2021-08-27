package com.example.composedrugiepodejcie.recycler.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.composedrugiepodejcie.compose.Message
import com.example.composedrugiepodejcie.databinding.ListItemBinding

class MainRVAdapter(private val dataSet: List<Message>) : RecyclerView.Adapter<MainRVAdapter.MainRVViewHolder>() {
    class MainRVViewHolder(private val itemViewBinding: ListItemBinding) : RecyclerView.ViewHolder(itemViewBinding.root) {
        fun bind(message: Message) {
            with(itemViewBinding) {
                author.text = message.author
                messageContent.text = message.body
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRVViewHolder =
        MainRVViewHolder(
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: MainRVViewHolder, position: Int) =
        holder.bind(dataSet[position])

    override fun getItemCount(): Int = dataSet.size
}

