package est.mkao.emergency.response.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.foundation.clickable


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F4F4))
            .padding(16.dp)
    ) {
        // Top Row with Title and Search Icon
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Incidents",
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
            )
            IconButton(onClick = { /* TODO: Search Action */ }) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Filter Chips Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val filters = listOf("All", "Open", "Closed", "Draft")
            filters.forEach { filter ->
                Chip(filter)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Incident List
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(incidents) { incident ->
                IncidentItem(incident)
            }
        }

        // Panic Button at Bottom
        Button(
            onClick = { /* TODO: Panic Action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            shape = RoundedCornerShape(50)
        ) {
            Text(
                text = "Panic Button",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun Chip(text: String) {
    Surface(
        color = Color(0xFFF1EAEA),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.clickable { /* TODO: Filter Action */ }
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            color = Color.Black
        )
    }
}

@Composable
fun IncidentItem(incident: Incident) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = incident.id,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Location: ${incident.location}",
                color = Color(0xFF9C4141),
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = incident.status,
                color = when (incident.status) {
                    "Open" -> Color(0xFF4CAF50) // Green for Open
                    "Closed" -> Color.Gray // Gray for Closed
                    else -> Color.Black
                },
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}


data class Incident(
    val id: String,
    val location: String,
    val status: String
)

val incidents = listOf(
    Incident("INC-0001", "San Francisco, CA", "Open"),
    Incident("INC-0002", "San Mateo, CA", "Open"),
    Incident("INC-0003", "San Jose, CA", "Closed")
)


