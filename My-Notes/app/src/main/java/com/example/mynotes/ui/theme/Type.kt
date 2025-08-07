package com.example.mynotes.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mynotes.R

val Montserrat = FontFamily(
    Font(R.font.montserrat_light, FontWeight.Light),
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

val Typography = Typography(

    // Título principal (ex: TopAppBar)
    titleLarge = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    // Título de seção ou card
    titleMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
    ),

    // Título menor (ex: subtítulo ou seção discreta)
    titleSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.1.sp
    ),

    // Corpo de texto padrão
    bodyMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),

    // Texto auxiliar, descrição, rótulo
    labelSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    )
)


//// Defina sua família de fontes personalizadas
//val Montserrat = FontFamily(
//    Font(R.font.montserrat_regular, FontWeight.Normal),
//    Font(R.font.montserrat_bold, FontWeight.Bold),
//    Font(R.font.montserrat_light, FontWeight.Light)
//)
//
//val Typography = Typography(
//    bodyMedium = TextStyle(
//        fontFamily = Montserrat,
//        fontWeight = FontWeight.Normal,
//        fontSize = 24.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),
//
//    titleLarge = TextStyle(
//        fontFamily = Montserrat,
//        fontWeight = FontWeight.Normal,
//        fontSize = 32.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),
//    titleSmall = TextStyle(
//        fontFamily = Montserrat,
//        fontWeight = FontWeight.Bold,
//        fontSize = 28.sp,
//        lineHeight = 40.sp,
//        letterSpacing = 0.sp
//    ),
//    labelSmall = TextStyle(
//        fontFamily = Montserrat,
//        fontWeight = FontWeight.Light,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
//)