package com.example.compose_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_project.ui.theme.Compose_ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }


    @Composable
    fun Greeting(name: String,
                 modifier: Modifier = Modifier
                     .border(
                         2.dp, SolidColor(Color.Black
                         )
                         ,shape = RoundedCornerShape(15.dp)
                     )
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    /*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_ProjectTheme {
        Greeting("Android")
    }
}
*/
    @Composable
    @Preview
    fun BoxExample() {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .border(2.dp, SolidColor(Color.Black)
                        ,shape = RoundedCornerShape(15.dp))

                ,

                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.coniferous),
                    modifier = Modifier
                        .fillMaxSize()
                        .height(200.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .border(2.dp, SolidColor(Color.Black)
                            ,shape = RoundedCornerShape(15.dp))
                    ,
                    contentDescription = "Background Image",
                    contentScale = ContentScale.Crop,
                )
                Text(
                    text = "Conifers",
                    style = TextStyle(color = Color.White, fontSize = 48.sp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .border(2.dp, SolidColor(Color.Black)
                        ,shape = RoundedCornerShape(15.dp))

                ,

                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.deciduous),
                    modifier = Modifier
                        .fillMaxSize()
                        .height(200.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .border(2.dp, SolidColor(Color.Black)
                            ,shape = RoundedCornerShape(15.dp))
                    ,
                    contentDescription = "Background Image",
                    contentScale = ContentScale.Crop,
                )
                Text(
                    text = "Deciduous",
                    style = TextStyle(color = Color.White, fontSize = 48.sp)
                )
        }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .border(2.dp, SolidColor(Color.Black)
                        ,shape = RoundedCornerShape(15.dp))

                ,

                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.coniferous),
                    modifier = Modifier
                        .fillMaxSize()
                        .height(200.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .border(2.dp, SolidColor(Color.Black)
                            ,shape = RoundedCornerShape(15.dp))
                    ,
                    contentDescription = "Background Image",
                    contentScale = ContentScale.Crop,
                )
                Text(
                    text = "Conifers",
                    style = TextStyle(color = Color.White, fontSize = 48.sp)
                )
            }

    }

    /*@Composable
@Preview

fun WelcomeCard(){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .fillMaxHeight()) {
        Row() {

            Text(
                text = "Colorado Tree Identifier",
                fontSize = 35.sp
            )

        }
        Row() {
            Box(modifier=Modifier
                .fillMaxWidth()
                .paint(painterResource(id = R.drawable.deciduous),
                    contentScale = ContentScale.FillBounds)) {
               /* Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.deciduous),
                        contentDescription = stringResource(id = R.string.decidous_tree_image_description)
                    )
                    Column {
                        Text("Deciduous")
                        Text("Leaf Bearing Trees")
                    }
                }*/
            }
        }
        /*
            onClick = { },
    border = BorderStroke(1.dp, Color.Red),
    shape = RoundedCornerShape(50), // = 50% percent
                                    // or shape = CircleShape
    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
         */
        Row(verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .background(Color(0xFFBABA33), shape = RoundedCornerShape(15.dp))
                .border(2.dp, SolidColor(Color.Black),shape = RoundedCornerShape(15.dp))
                .clickable(
                    onClick = {

                    },
                    onClickLabel = "Click ME!"
                ) )
        {
            Column(){

            }
            Image(
                painter = painterResource(id = R.drawable.coniferous),
                contentDescription = stringResource(id = R.string.decidous_tree_image_description),
                modifier =Modifier.background(Color(0xFFBABA33), shape = RoundedCornerShape(15.dp))
                .border(2.dp, SolidColor(Color.Black),shape = RoundedCornerShape(15.dp))

            )

            Column {
                Text(
                    "Conifer",
                    textAlign = TextAlign.Right,
                    fontSize = 30.sp)

                Text(
                    text="Needle Bearing Trees",
                    fontSize =  20.sp
                )
            }

        }
    }

}
*/
    @Composable
    fun ArtistCard() {
        R.string.changing_variable
    }
}
}