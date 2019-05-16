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
 * =====================================================
 * Vid 4: Computer Moves
 * https://www.youtube.com/watch?v=h5Nzgp5HZos
 *
 * We will create a dumb algorithm that will make the computer move
 * Select a random cell from all the empty cells
 *
 * 1. In Board :
 *      - def a val availableCells and put all the available Cells that are empty
 *
 * 2. In MainActivity class, when the player has placed a move,
 *      inner class > override fun onClick
 *
 *          - get a random cell from empty cell
 *      check that the available cell is not empty
 *      place the computer move
 *
 * ================================================
 * vid 5 : Check the game status
 * https://www.youtube.com/watch?v=jafJ1kGXhJU
 *
 * 3 possibilities: player wins, computer wins or, it's a tie
 * and a 4th possibility, if the app is running
 *
 * 1. In the Board class, def a new func hasComputerWon()
 *
 * 2. A win will happen when any row or column or a diagonal has equal values
 *   - Let's check the diagonals 1st
 *   - then check the rows
 *
 * 3. Check if the Player Won; hasPlayerWon()
 *      copy paste from computer and change all the computer to player
 *
 * 4. Create another val to check if game is over
 *      isGameOver()
 *
 * 5. Go to MainActivity class, onClick() to check isGameOver
 *          - if(!board.isGameOver) {}
 *          - cut all the old content of the click listener and paste in the if statement
 *          - add a when {} for computer won
 *
 * vid 7. minimax algorithm
 * https://www.youtube.com/watch?v=Kv02E5w_wsI&list=PLk7v1Z2rk4hj4qi2TIZmMSiZguB-qe001&index=7
 *
 * 1. In Board : create a fun minimax(){}
 * 2. create a var above that var computersMove()
 * 3. code fun minimax()
 * 4. Now go to MainActivity class, onClick()
 *      when the player has placed a move, we use computer to calculate computer move
 *      - remove : //if (board.availableCells.isNotEmpty()) { brackets
 *          we are already checking the is not over so this is no longer needed
 *
 * 5. Still in onClick, when we place the move for player, we will call
 *      board.minimax(depth 0, COMPUTER) passing the initial depth 0 and the player as COMPUTER
 *
 */