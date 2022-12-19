package com.example.healthycare

import android.app.people.ConversationStatus
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Gelas(
    var status: Boolean
): Parcelable
