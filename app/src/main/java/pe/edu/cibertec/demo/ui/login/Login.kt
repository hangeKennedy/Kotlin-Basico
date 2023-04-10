package pe.edu.cibertec.demo.ui.login

import androidx.compose.foundation.layout.*

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.cibertec.demo.ui.theme.DemoTheme


// se agrega @Composable para agregar gui
@Composable
fun Login(){
    // hola mundo esta parte esta siendo modificada
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login")
        Spacer(modifier = Modifier.height(16.dp))
        // username
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp, 0.dp, 8.dp, 0.dp),
            label = {Text(text = "username")},
            value = "",
            onValueChange = {},
            leadingIcon = {Icon(Icons.Default.Person, contentDescription = null)})
        Spacer(modifier = Modifier.height(16.dp))
        // password
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp, 0.dp, 8.dp, 0.dp),
            label = {Text(text = "Password")},
            value = "",
            onValueChange = {},
            leadingIcon = {Icon(Icons.Default.Lock, contentDescription = null)})
        Spacer(modifier = Modifier.height(16.dp))
        // button sign in
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp, 0.dp, 8.dp, 0.dp),
            onClick = {}) {
            Text(text = "Sign in")
        }
        // button sign in
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp, 0.dp, 8.dp, 0.dp),
            onClick = {}) {
            Text(text = "Sign in")
        }
        // TextButton Forgot passord
        TextButton(onClick = {}) {
            Text(text = "Forgot passowrd")
        }

    }
}


// se crea estos pasos para una preview de nuestra GUI
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    DemoTheme() {
        Login()
    }
}