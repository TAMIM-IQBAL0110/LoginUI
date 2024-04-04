package com.example.jetpackcompose

import android.content.Context
import android.graphics.drawable.Icon
import android.widget.AlphabetIndexer
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import kotlin.math.max

@Composable
fun SimpleTextField(){
    Box(
        /*modifier = Modifier
            .background(Color.LightGray)
            .width(400.dp)
            .heightIn(300.dp),

         */
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .width(350.dp)
                .width(30.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var mail by remember {
                mutableStateOf("")
            }
            var password by remember {
                mutableStateOf("")
            }
            val context = LocalContext.current
            // E-Mail Section
            OutlinedTextField(
                modifier = Modifier
                    .width(350.dp)
                    .heightIn(30.dp),
                value = mail,
                onValueChange = { mail = it },
                label = {
                    Text("E-Mail :", color = Color.Black,fontWeight = FontWeight.SemiBold)
                },
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Outlined.Email,
                            contentDescription = "" ,
                            tint = Color.Black
                        )
                    }


                },
                trailingIcon = {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Outlined.Send,
                        contentDescription ="",
                        tint = Color.Blue,
                        modifier = Modifier.size(20.dp)
                    )
                },
                singleLine = true,
                placeholder = {
                    Text("xyz..@gamil.com",color = Color.Black)
                },
                keyboardOptions =  KeyboardOptions(
                    //capitalization = KeyboardCapitalization.Characters,
                    keyboardType = KeyboardType.Password
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Black,
                    background = Color.White
                )
            )
            // password section
            OutlinedTextField(
                modifier = Modifier
                    .width(350.dp)
                    .heightIn(30.dp),
                value = password,
                onValueChange = { password = it },
                label = {
                    Text("Password :", color = Color.Black,fontWeight = FontWeight.SemiBold)
                },
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Outlined.Lock,
                            contentDescription = "" ,
                            tint = Color.Black
                        )
                    }


                },
                trailingIcon = {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Outlined.Send,
                        contentDescription ="",
                        tint = Color.Blue,
                        modifier = Modifier.size(20.dp)
                    )
                },
                singleLine = true,
                placeholder = {
                    Text("",color = Color.Black)
                },
                keyboardOptions =  KeyboardOptions(

                    keyboardType = KeyboardType.Password
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Black,
                    background = Color.White
                )
            )
            Button(
                onClick = {
                    Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                ),
                shape = RoundedCornerShape(6.dp),
                modifier = Modifier.background(color = Color.Blue, shape = RoundedCornerShape(6.dp)).width(300.dp)
            )
            {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Center

                )
            }
        }
    }
}


@Composable
@Preview
fun PreviewFun(){
    //TextFieldTutorial()
    SimpleTextField()
}
