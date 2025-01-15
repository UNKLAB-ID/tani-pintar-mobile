package com.tani_pintar.app.screens.detail

import androidx.lifecycle.ViewModel
import com.tani_pintar.app.data.MuseumObject
import com.tani_pintar.app.data.MuseumRepository
import kotlinx.coroutines.flow.Flow

class DetailViewModel(private val museumRepository: MuseumRepository) : ViewModel() {
    fun getObject(objectId: Int): Flow<MuseumObject?> =
        museumRepository.getObjectById(objectId)
}
