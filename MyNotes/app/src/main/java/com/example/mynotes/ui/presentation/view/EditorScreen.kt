package com.example.mynotes.ui.presentation.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynotes.ui.theme.montserrat


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditorScreen() {
    var text by remember {
        mutableStateOf(
            "" +
                    "Para aumentar o tamanho da fonte do TextField no Jetpack Compose, você deve usar o parâmetro textStyle. Nele, você pode passar o tamanho da fonte (fontSize) e outras propriedades, se quiser."
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {}
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    textStyle = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontFamily = montserrat,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 26.sp,
                        letterSpacing = 1.5.sp
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        cursorColor = Color.Blue,
                        focusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        focusedIndicatorColor = Color.Blue,
                        unfocusedIndicatorColor = Color.Gray
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 8.dp)
                )
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 40.dp),
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.outline
                )
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 68.dp),
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.outline
                )
            }
        }

    }
}

@Preview(device = "id:Nexus 5", showBackground = true, showSystemUi = true)
@Composable
fun EditorPreview() {
    EditorScreen()
}