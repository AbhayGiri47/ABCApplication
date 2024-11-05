package com.app.catalog.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.app.catalog.presentation.home.HomePage
import com.app.catalog.presentation.theme.BlueAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlueAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    HomePage()
                }
            }
        }
    }
}
