package com.kioskorder.view.loadingscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.kioskorder.ui.theme.BGColor
import com.kioskorder.R

@Composable
fun Loadingscreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BGColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.loading))
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever,
            speed = 0.5f
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoadingscreenPreview() {
    Loadingscreen()
}