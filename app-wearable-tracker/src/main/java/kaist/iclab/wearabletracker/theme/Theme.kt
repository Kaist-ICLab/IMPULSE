package kaist.iclab.wearabletracker.theme

import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme

@Composable
fun WearableTrackerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}