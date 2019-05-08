package com.torzini.kotlintictactoe

class Board {

    // def the players
    companion object {
        const val PLAYER = "O"
        const val COMPUTER = "X"
    }

    // def a new 2D board, array of nulls of size 3 and type String
    val board = Array(3) { arrayOfNulls<String>(3)}

    // create the fun passing the cell where we will place the move, and the player who played
    fun placeMove(cell: Cell, player: String) {
        // make the actual board
        board[cell.i][cell.j] = player
    }
}