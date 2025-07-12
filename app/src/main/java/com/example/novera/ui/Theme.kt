package com.example.novera.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.Color
import com.example.novera.R

private val Brown500 = Color(0xFF8B5A2B)
private val Orange500 = Color(0xFFF97316)
private val Orange100 = Color(0xFFFFF7ED)
private val White = Color(0xFFFFFFFF)

private val LightColorScheme = lightColorScheme(
    primary = Brown500,
    onPrimary = White,
    secondary = Orange500,
    background = Orange100
)

@Composable
fun NoveraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(),
        shapes = Shapes(),
        content = content
    )
}