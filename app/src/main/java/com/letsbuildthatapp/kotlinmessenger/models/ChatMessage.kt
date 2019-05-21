package com.letsbuildthatapp.kotlinmessenger.models

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ChatMessage(val id: String, val text: String, val fromId: String, val toId: String, val timestamp: Long) {
    constructor() : this("", "", "", "", -1)
}