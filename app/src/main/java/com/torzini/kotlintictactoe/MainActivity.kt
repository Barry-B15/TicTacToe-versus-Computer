package com.torzini.kotlintictactoe

import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 */
class MainActivity : AppCompatActivity() {

    // vid1-8.0
    private val boardCells = Array(3){ arrayOfNulls<ImageView>(3)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //call loadBoard
        loadBoard()
    }

    // vid1-7.0
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

                // load the img view inside our grid layout
                layout_board.addView(boardCells[i][j])

            }

        }
    }
}

