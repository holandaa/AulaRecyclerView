package com.holandaa.aularecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var nome: TextView?=itemView.findViewById(R.id.tv_nome)
    var email: TextView?=itemView.findViewById(R.id.tv_email)
    var contator: TextView?=itemView.findViewById(R.id.tv_contador)


}
