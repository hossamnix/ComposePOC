package com.example.composepoc.Biometric

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.composepoc.Biometric.theme.MarginDouble
import com.example.composepoc.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainContent() {
    Scaffold(
        topBar = {
            TopAppBar {
                Text(
                    text = stringResource(id = R.string.app_name),
                    modifier = Modifier.padding(horizontal = MarginDouble),
                )
            }
        },
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.h4,
                modifier = Modifier.align(Alignment.Center),
            )
        }
    }
}
