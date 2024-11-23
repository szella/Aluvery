package br.com.zella.aluvery.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.zella.aluvery.ui.theme.AluveryTheme

@Composable
fun SearchTextField(
    searchText: String,
    onSearchChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = searchText,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        },
        modifier,
        shape = RoundedCornerShape(100),
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "ícone de lupa")
        },
        label = {
            Text(text = "Produto")
        },
        placeholder = {
            Text("O que você procura?")
        })
}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldPreview() {
    AluveryTheme {
        Surface {
            SearchTextField(
                "",
                onSearchChange = {},
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldWithSearchTextPreview() {
    AluveryTheme {
        Surface {
            SearchTextField(
                searchText = "a",
                onSearchChange = {},
            )
        }
    }
}