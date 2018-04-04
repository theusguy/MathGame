# MathGame
Math learning game for kids. Full Scale Java Project for Java Class

Math Game

The project goal is to learn mathematics skills in order to give answers for random questions, when program first load an input dialog appear for name then a random question will be generate on the screen every player has 6 questions to answer each random question if user enter valid question he/she will get 1 score. Player skip difficult question by using new button. All records will be save into text file and user can check players high score by using Button. When all question answered an input dialog open by another player and continue to play.

GameRecord.java

In this class we have instance variables for questions, name and scores. All records will be save into this class then by using List insert records into file.

SortScore.java

This file is used to sort player by highest score by using Comparator interface.

RandomQuestions.java

This class generate random numbers and operator sign in order to generate different questions every time.

HighScore.java
Extends JFrame used to show players name and scrore from input file.

MathGame.java
The main Class is used to perform all business logic, event listener, textfield, label etc
In this class initiate other classes in order to perform all calculations, scores and write records into text file.

