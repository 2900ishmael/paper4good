package com.example.paper4good

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.paper4good.ui.theme.Paper4GoodTheme

class AddCharity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Add(navController = rememberNavController())

        }
    }
}

@Composable
fun Add(navController: NavHostController){
    val mContext = LocalContext.current
    val AddCharity = remember { mutableStateOf(AddCharity()) }

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = ))) {


    }
}


@Preview(showBackground = true)
@Composable
fun AddPreview(){
    Add(navController = rememberNavController())
}
