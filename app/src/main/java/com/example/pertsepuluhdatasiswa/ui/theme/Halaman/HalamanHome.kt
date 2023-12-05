package com.example.pertsepuluhdatasiswa.ui.theme.Halaman

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        if (itemSiswa.isEmpty()) {
            Text(
                text = stringResource(id = R.string.deskripsi_no_item),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleLarge,
            )
        } else {
            ListSiswa(
                itemSiswa = itemSiswa,
                modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun ListSiswa(
    itemSiswa: List<Siswa>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(items = itemSiswa, key = {it.id}) {
            person ->
            DataSiswa(
                siswa = person,
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun DataSiswa(siswa: Siswa, modifier: Modifier) {

}
