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


    // create the fun passing the cell where we will place the move, and the player who played
    fun placeMove(cell: Cell, player: String) {
        // make the actual board
        board[cell.i][cell.j] = player
    }
}