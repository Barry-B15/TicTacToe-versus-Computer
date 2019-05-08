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
 */