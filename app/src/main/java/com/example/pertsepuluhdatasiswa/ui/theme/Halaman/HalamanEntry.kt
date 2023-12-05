package com.example.pertsepuluhdatasiswa.ui.theme.Halaman

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertsepuluhdatasiswa.R
import com.example.pertsepuluhdatasiswa.model.EntryViewModel
import com.example.pertsepuluhdatasiswa.model.PenyediaViewModel
import com.example.pertsepuluhdatasiswa.navigasi.DestinasiNavigasi

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {}