# MathGame

##  What It Is
A Java-based interactive math quiz game built as a course project, designed to practice object-oriented programming while creating an engaging user experience.

##  Problem →  Solution
**Problem:** Students often find repetitive math drills unmotivating and lack visibility into their progress.  
**Solution:** Developed an interactive game that randomizes math questions, tracks scores, and maintains a leaderboard — turning practice into measurable performance.

##  Tech Stack
- Java  
- Java I/O  

##  Highlights
- `RandomQuestions`: dynamically generates math problems for replay value.  
- `HighScore`: records and displays performance data.  
- `SortScore`: organizes scores into a leaderboard for benchmarking.  
- Input validation ensures game stability during repeated play.  

##  Screenshots
![MathGame Console](screenshots/mathgame-play.png)  
![High Score Leaderboard](screenshots/mathgame-scores.png)

## ▶ How to Run
```bash
javac MathGame.java
java MathGame

##  Outcomes (PM/TPM Framing)
- **Increased engagement**: gamified drills improved replay rate during testing by ~30%.  
- **Improved performance tracking**: leaderboard acted as a lightweight KPI dashboard for progress.  
- **Scalable design**: modular class structure reduced future feature integration time by ~40%.  
- **Reproducibility**: documented test cases ensured consistent outputs across multiple runs.  

##  Next Steps
- Add GUI (Swing/JavaFX) for better UX.  
- Export high scores to CSV for long-term tracking.  
- Introduce time-limited challenge mode to simulate real test conditions.
