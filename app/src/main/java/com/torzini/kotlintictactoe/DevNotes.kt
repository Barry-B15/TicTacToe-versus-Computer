package com.torzini.kotlintictactoe

/**
 * Video #2 : Get started UI and generate the board
 *
 * 1. create a new project
 *      - select kotlin
 *      - check to use android x artifacts
 * 2. Add the new Material design library to build.gradle(app) and sync
 *      implementation 'com.google.android.material:material:1.0.0'
 * 3. Open values > style
 *      - change the AppCompat at the top to use the new MaterialComponet
 *      - change the .DarkActionBar to NoActionBar as we don't need one
 * 4. Open values > colors
 *      - Choose colors as needed
 * 5. copy and paste the app icons (X, +, ---) into the drawable folder
 *          - add the icons to manifest icon, and roundIcon)
 * 6. Now design the layout
 *      1 imageView for the logo
 *      1 text view to display the winner
 *      1 gridLayout to hold the grid
 *      1 btn for game reset
 * 7. In MainActivity:
 *      - create a function loadBoard()
 *      - write func to generate the game board
 *
 * 8. At the top:
 *      - define private val boardCells and design a 2D array of image view
 * 9. Loop thru all the image views to init the img views
 * 10. add the img v to the grid layout
 *
 * Video #3
 * https://www.youtube.com/watch?v=Zy1ZXoFf54U
 *
 * 1. Create a new kotlin class Board
 *      In the class,
 *          - def the players obj
 *          - def another 2D "board" with array size 3 and an array of nulls withh size 3
 * 2. Create another kotlin class "Cell" to identify cells in our code
 *      - we will create a data class for this, so remove the squiggly {}
 *      - put a bracket (val i: Int, val j: Int) where the ij will def the index of the cell
 * 3. Go back to the Board
 *      - create the func placeMove(cell, player) passing the cell, and the player
 *         we pass in the cell where we will place the move, and the player who played
 *
 * 4. In MainActivity,
 *      - def the board as
 *          val board = Board()
 *      - create a fun mapBoardToUi() .
 *          This will map the actual board to the UI
 * 5. still in MainActivity,
 *      - create a custom click listener
 *        that is, we create an innerclass inside the MainActivity class
 *
 *  6. Attach our CellClickListener to the imageView
 *        we do this by calling the setOnClickListener on boardCells[i][j] in the for loop of
 *        loadBoard(), just between the setBackgroundColor() and layout_board.addView()
 *
 * 7. In onCreate(), code the restart button
 *     when the reset btn is called, we have a new board and all values deleted
 *
 */