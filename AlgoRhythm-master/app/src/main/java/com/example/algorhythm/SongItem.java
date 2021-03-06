package com.example.algorhythm;
import java.lang.String;

/**
 * Holds data for one job
 */
public class SongItem {
    private String title;
    private int difficulty;
    private String length;
    private int highscore;
    private int maxCombo;
    private String rank;
    private String textFileName;
    private String path;

    SongItem(String title, int difficulty, String length, String textFile, String path) {
        this.setAll(title, difficulty, length, 0, 0, "Z", textFile, path);
    }

    public String getTitle() { return title; }
    public int getDifficulty() { return difficulty; }
    public String getLength() { return length; }
    public int getHighScore() { return highscore; }
    public int getMaxCombo() { return maxCombo; }
    public String getRank() { return rank; }
    public String getTextFileName() { return textFileName; }
    public String getPath() { return path; }

    public void setAll(String title, int difficulty, String length, int highscore, int maxCombo, String rank, String txtFile, String path) {
        this.title = title;
        this.difficulty = difficulty;
        this.length = length;
        this.highscore = highscore;
        this.maxCombo = maxCombo;
        this.rank = rank;
        this.textFileName = txtFile;
        this.path = path;
    }

    public void updateScore(int highscore, int maxCombo, String rank){
        this.highscore = highscore;
        this.maxCombo = maxCombo;
        this.rank = rank;
    }
}
