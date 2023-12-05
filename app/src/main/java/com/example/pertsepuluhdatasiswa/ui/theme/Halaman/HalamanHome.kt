package com.example.pertsepuluhdatasiswa.ui.theme.Halaman

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertsepuluhdatasiswa.R
import com.example.pertsepuluhdatasiswa.model.HomeViewModel
import com.example.pertsepuluhdatasiswa.model.PenyediaViewModel
import com.example.pertsepuluhdatasiswa.navigasi.DestinasiNavigasi

object DestinasiHome: DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {}