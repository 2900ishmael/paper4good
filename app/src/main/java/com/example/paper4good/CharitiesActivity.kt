@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.paper4good

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.paper4good.ui.theme.Paper4GoodTheme

class CharitiesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Charities(navController = rememberNavController())

        }
    }
}

@Composable
fun Charities(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Home", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green),
            navigationIcon = {
                IconButton(onClick = {


                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )
                }
            },

        )
        Row {
            Image(painter = painterResource(id = R.drawable.aid),
                contentDescription = "Stronger Together Initiative",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "STRONGER TOGETHER INITIATIVE,", fontWeight = FontWeight.Bold)
                Text(text = "An initiative which supports the elderly citizens by helping them acquire food,clothing and much needed healthcare")
                Button(onClick = {
                    
                }
                ) {
                    Text(text = "DONATE")
                    
                }
                

            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.help),
                contentDescription = "savethekids",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "SAVE THE KIDS ORG", fontWeight = FontWeight.Bold)
                Text(text = "Save the kids is an organisations which delivers aid to kids in marginalised areas.")
                Text(text = "We help less privileged kids by sponsoring their education and providing food and healthcare to them.")


            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.give),
                contentDescription = "give",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "HELP WORLDWIDE", fontWeight = FontWeight.Bold)
                Text(text = "Help Worldwide is a non governmental organisation which aims at delivering food and medical aid to victims in war torn countries. ")

            }


        }
        Spacer(modifier = Modifier.height(10.dp))





    }
}


@Preview(showBackground = true)
@Composable
fun CharitiesPreview(){
    Charities(navController = rememberNavController())
}
