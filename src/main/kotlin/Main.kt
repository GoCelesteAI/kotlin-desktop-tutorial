import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun App() {
  var count by remember { mutableStateOf(0) }

  MaterialTheme(colorScheme = darkColorScheme()) {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = MaterialTheme.colorScheme.background
    ) {
      Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
      ) {
        Text(
          text = "Hello, Compose Desktop!",
          fontSize = 28.sp,
          color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
          text = "You clicked $count times",
          fontSize = 20.sp,
          color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { count++ }) {
          Text("Click me!", fontSize = 18.sp)
        }
      }
    }
  }
}

fun main() = application {
  Window(
    onCloseRequest = ::exitApplication,
    title = "Hello Compose"
  ) {
    App()
  }
}
