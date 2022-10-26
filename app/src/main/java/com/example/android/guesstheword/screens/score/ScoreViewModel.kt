package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

//Clase creada para mostrar la puntuación final

class ScoreViewModel(finalScore: Int) : ViewModel() {

    // The final score
    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}
