package com.example.pertsepuluhdatasiswa.ui.theme.Halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertsepuluhdatasiswa.R
import com.example.pertsepuluhdatasiswa.data.Siswa
import com.example.pertsepuluhdatasiswa.model.HomeViewModel
import com.example.pertsepuluhdatasiswa.model.PenyediaViewModel
import com.example.pertsepuluhdatasiswa.navigasi.DestinasiNavigasi

object DestinasiHome: DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
}

@Composable
fun BodyHome(
    itemSiswa : List<Siswa>,
    modifier: Modifier = Modifier
) {}