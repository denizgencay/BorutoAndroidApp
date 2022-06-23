package com.example.borutoapp.presentation.screens.search

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun SearchScreen(
    navController: NavHostController,
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val searchQuery by searchViewModel.searchQuery

    Scaffold(
        topBar = { SearchTopBar(
            text = "",
            onCloseClicked = { navController.popBackStack() },
            onSearchClicked = {  },
            onTextChanged = { searchViewModel.updateSearchQuery(query = it) },
        ) }
    ) {

    }
}