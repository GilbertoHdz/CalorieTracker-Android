package com.gilbertohdz.calorytracker.navigation

import androidx.navigation.NavController
import com.gilbertohdz.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
  this.navigate(event.route)
}