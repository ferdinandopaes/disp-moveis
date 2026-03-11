package br.fatec.garca.laboratoriocompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import br.fatec.garca.laboratoriocompose.ui.theme.LaboratorioComposeTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            LaboratorioComposeTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) {

                    DriverProfileCard(
                        nome = "Ricardo Santos",
                        veiculo = "Scania R450"
                    )

                }

            }
        }
    }
}


@Composable
fun DriverProfileCard(nome: String, veiculo: String) {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),

        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Row(
            modifier = Modifier.padding(16.dp)
        ) {

            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(Color.LightGray)
            )

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Column {

                Text(
                    text = nome,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = "Veículo: $veiculo",
                    color = Color.Gray
                )

            }

        }

    }

}


@Preview(showBackground = true)
@Composable
fun PreviewDriver() {

    LaboratorioComposeTheme {

        DriverProfileCard(
            nome = "Ricardo Santos",
            veiculo = "Scania R450"
        )

    }

}
