package com.example.borutoapp.domain.use_case.read_onboarding

import androidx.compose.runtime.referentialEqualityPolicy
import com.example.borutoapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<Boolean> {
        return repository.readOnBoardingState()
    }
}