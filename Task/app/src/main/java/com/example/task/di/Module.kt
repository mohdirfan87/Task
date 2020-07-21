package com.example.task.di

import com.example.task.ui.UserViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module


val viewModelModule = module {
    viewModel { UserViewModel() }
}