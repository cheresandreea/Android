package com.example.myapplication.modelView

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myapplication.domain.Star
import com.example.myapplication.repository.StarRepository


class StarModelView: ViewModel() {
    private val repository = StarRepository()

    var stars by mutableStateOf(repository.getAllStars())

    fun getStarById(id: Int): Star {
        return repository.getStarById(id)
    }

    fun addStar(star: Star) {
        repository.addStar(star)
    }

    fun updateStar(star: Star) {
        repository.updateStar(star)
    }

    fun deleteStar(index: Int) {
        repository.deleteStar(index)
    }
}