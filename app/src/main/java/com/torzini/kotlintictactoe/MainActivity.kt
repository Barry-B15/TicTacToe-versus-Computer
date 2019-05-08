package com.torzini.kotlintictactoe

import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 */
class MainActivity : AppCompatActivity() {

    // vid 2-8.0
    private val boardCells = Array(3){ arrayOfNulls<ImageView>(3)}

    // vid 3-4.1 def the board, we use var cos we need to change the board later
    var board = Board()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //call loadBoard
        loadBoard()

        // vid 3-7 code the restart button
        button_restart.setOnClickListener {
            // when the reset btn is called, we have a new board and all values deleted
            board = Board()        // create a new board
            tv_result.text = ""   // set the text view result to empty (set the result in our text view to empty)
            mapBoardToUi()          // call the mapBoardToUi to clear things
        }
    }

    // vid 3-4.1 map board to UI
    private fun mapBoardToUi() {

        // loop thru all the elements of our board
        for (i in board.board.indices) {
            for (j in board.board.indices) {
                when (board.board[i][j]) { // 3 options: PLAYER, COMPUTER or EMPTY
                    Board.PLAYER -> {

                        // if the move is from the PLAYER, we put the O on the board
                        boardCells[i][j]?.setImageResource(R.drawable.ic_plus)
                        boardCells[i][j]?.isEnabled = false
                    }
                    Board.COMPUTER -> {

                        // if the move is from the COMPUTER, we put the x on the board
                        boardCells[i][j]?.setImageResource(R.drawable.ic_ex)
                        boardCells[i][j]?.isEnabled = false
                    }
                    else -> {

                        // if the cell is empty, not yet used, clear the board
                        boardCells[i][j]?.setImageResource(0)
                        boardCells[i][j]?.isEnabled = true
                    }

                }
            }
        }
    }
    // vid 2-7.0
    private fun loadBoard() {

        //vid1-9 Loop thru all the image views to init the img views
        for (i in boardCells.indices) {
            for (j in boardCells.indices) {
                boardCells[i][j] = ImageView(this)
                //set layout params to the image view
                boardCells[i][j]?.layoutParams = GridLayout.LayoutParams().apply {
                    // def row and colns for the image view
                    rowSpec = GridLayout.spec(i)
                    columnSpec = GridLayout.spec(j)
                    // def the width and height and some margin for the img view
                    width = 250
                    height = 230
                    bottomMargin = 5
                    topMargin = 5
                    leftMargin = 5
                    rightMargin = 5
                }
                //set background color for the img view
                boardCells[i][j]?.setBackgroundColor(getColor(R.color.colorPrimary))  // works here \ didn't work in the video
                //boardCells[i][j]?.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))

                // vid 3-6.0 Attach our CellClickListener to the imageView
                boardCells[i][j]?.setOnClickListener(CellClickListener(i, j))

                // load the img view inside our grid layout
                layout_board.addView(boardCells[i][j])

            }

        }
    }

    // vid 3-5.0 create an inner class to handle the custom click listener
    inner class CellClickListener(
        private val i:Int,
        private val j: Int) : View.OnClickListener {

        //3-5.1 override the onClick()
        override fun onClick(p0: View?) {
            val cell = Cell(i, j)     // get the cell wit index
            board.placeMove(cell, Board.PLAYER)
            // call the placeMove on the cell. always the PLAYER as the computer plays automatically

            //3-5.2 map the actual board to the ui
            mapBoardToUi()
        }


        // override onClick
    }
}

