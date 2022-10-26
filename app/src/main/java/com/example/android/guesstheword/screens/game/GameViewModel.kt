package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    // Palabra actual
    var word = ""

    // Puntuación actual
    var score = 0

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    private fun resetList() {
        wordList = mutableListOf(
                "queen",
                "hospital",
                "basketball",
                "cat",
                "change",
                "snail",
                "soup",
                "calendar",
                "sad",
                "desk",
                "guitar",
                "home",
                "railway",
                "zebra",
                "jelly",
                "car",
                "crow",
                "trade",
                "bag",
                "roll",
                "bubble"
        )
        wordList.shuffle()
    }

    //Método creado para entender mejor ViewModel
    init {
        Log.i("GameViewModel", "GameViewModel created!")
        resetList()
        nextWord()
    }

    //Método creado para borrar vista una vez que se haya terminado la ejecucion de la app
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }

    fun onSkip() {
        score--
        nextWord()
    }
    fun onCorrect() {
        score++
        nextWord()
    }

    private fun nextWord() {
        //Select and remove a word from the list
        if (!wordList.isEmpty()) {
            word = wordList.removeAt(0)
        }
    }
}
