package com.example.mynotes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mynotes.R

val montserrat = FontFamily(
    Font(R.font.montserrat_bold, FontWeight.Bold),
    Font(R.font.montserrat_semi_bold, FontWeight.SemiBold),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_light, FontWeight.Light),
    Font(R.font.montserrat_extra_light, FontWeight.ExtraLight),
    Font(R.font.montserrat_thin, FontWeight.Thin),
)

val typography = Typography(
    headlineSmall = TextStyle(
        fontFamily = montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = montserrat,
        fontWeight = FontWeight.Light,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = montserrat,
        fontWeight = FontWeight.Thin,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 2.25.sp
    )
)



/**
 * M3	Tamanho da fonte/altura da linha padrão
 * displayLarge	Roboto 57/64
 * displayMedium	Roboto 45/52
 * displaySmall	Roboto 36/44
 * headlineLarge	Roboto 32/40
 * headlineMedium	Roboto 28/36
 * headlineSmall	Roboto 24/32
 * titleLarge	New- Roboto Medium 22/28
 * titleMedium	Roboto Medium 16/24
 * titleSmall	Roboto Medium 14/20
 * bodyLarge	Roboto 16/24
 * bodyMedium	Roboto 14/20
 * bodySmall	Roboto 12/16
 * labelLarge	Roboto Medium 14/20
 * labelMedium	Roboto Medium 12/16
 * labelSmall	New Roboto Medium, 11/16
 */