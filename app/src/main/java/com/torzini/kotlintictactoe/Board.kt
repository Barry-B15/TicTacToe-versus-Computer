package com.torzini.kotlintictactoe

class Board {

    // def the players
    companion object {
        const val PLAYER = "O"
        const val COMPUTER = "X"
    }

    // def a new 2D board, array of nulls of size 3 and type String
    val board = Array(3) { arrayOfNulls<String>(3)}

    //vid 4-1.0 def a val availableCells and put all the available Cells that are empty
    val availableCells: List<Cell>
        get() {
            val cells = mutableListOf<Cell>()
            //4-1.1 find all the empty cells from our board
            // traverse thru all the cells on the board wit a double loop
            for (i in board.indices) {
                for (j in board.indices) {
                    //4-1.2 if our board is empty, put it in the cells list
                    if (board[i][j].isNullOrEmpty()) {
                        cells.add(Cell(i, j))
                    }
                }
            }
            return cells; //4-1.3 return the cells
        }

    //vid 5-4 Check if game is over
    val isGameOver : Boolean
    get() = hasComputerWon() || hasPlayerWon() || availableCells.isEmpty()
    // getter to check if computer or player has won or no available empty cell, ie draw

    //vid 5-1 Check if computer won
    fun hasComputerWon() : Boolean{

        // vid 5-2.1 check the diagonals for computer win
        if (
            board[0][0] == board[1][1] &&
            board[0][0] == board[2][2] &&
            board[0][0] == COMPUTER ||
            board[0][2] == board[1][1] &&
            board[0][2] == board[2][0] &&
            board[0][2] == COMPUTER
        ) {
            return true
        }
        // 5-2.2 check for the rows
        for (i in board.indices) {
            if (
                board[i][0] == board[i][1] &&
                board[i][0] == board[i][2] &&
                board[i][0] == COMPUTER ||
                board[0][i] == board[1][i] &&
                board[0][i] == board[2][i] &&
                board[0][i] == COMPUTER
                    ) {
                return true
            }
        }
        return false
    }

    //vid 5-3 check if Player won
    fun hasPlayerWon() : Boolean{

        // vid 5-3.1 check the diagonals for computer win
        if (
            board[0][0] == board[1][1] &&
            board[0][0] == board[2][2] &&
            board[0][0] == PLAYER ||
            board[0][2] == board[1][1] &&
            board[0][2] == board[2][0] &&
            board[0][2] == PLAYER
        ) {
            return true
        }
        // 5-3.2 check for the rows
        for (i in board.indices) {
            if (
                board[i][0] == board[i][1] &&
                board[i][0] == board[i][2] &&
                board[i][0] == PLAYER ||
                board[0][i] == board[1][i] &&
                board[0][i] == board[2][i] &&
                board[0][i] == PLAYER
            ) {
                return true
            }
        }
        return false
    }




    // create the fun passing the cell where we will place the move, and the player who played
    fun placeMove(cell: Cell, player: String) {
        // make the actual board
        board[cell.i][cell.j] = player
    }
}