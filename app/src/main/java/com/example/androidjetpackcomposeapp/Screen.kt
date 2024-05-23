package com.example.androidjetpackcomposeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun previewItem(){
   LazyColumn(content = {
       items(getCategoryList()){
           item ->
           blogCategory(imgId = item.id, title = item.title, subtitle = item.subtitle )

       }
   })
}

@Composable
fun blogCategory(imgId:Int,title:String,subtitle:String){
Card(elevation = CardDefaults.cardElevation(
    defaultElevation = 8.dp
),
    modifier = Modifier.padding(8.dp)) {
  Row(verticalAlignment = Alignment.CenterVertically,
  modifier = Modifier.padding(8.dp)) {
      Image(painter = painterResource(id = imgId),
          contentDescription = "",
      modifier = Modifier
          .size(40.dp)
          .padding(8.dp)
          .weight(.2f))
      itemDescription(title,subtitle, Modifier.weight(.8f))
      }
  }
}

@Composable
fun itemDescription(title:String, subtitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            title, fontSize = 20.sp,
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Red
        )
        Text(
            text = subtitle, fontSize = 16.sp,
            style = MaterialTheme.typography.labelSmall,
            color = Color.Magenta
        )
    }
}

data class Category(val id : Int, val title : String, val subtitle: String)

fun getCategoryList() : MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
    list.add(Category(R.drawable.profile_img,"John1","Android Developer"))
   return list;
}