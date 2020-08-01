package com.example.football_scoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulsTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Display Goals for Team A ( FC Barcelone ).
     */

    public void addGoalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public  void addFoulA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsTeamA(int score) {
        TextView foulsView = (TextView) findViewById(R.id.barca_foul);
        foulsView.setText(String.valueOf(score));
    }

    /**
     * Display Goals for Team B ( FC Bayern ).
     */
    public void addGoalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFoulB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamA);
    }

    public void displayFoulsTeamB(int score) {
        TextView foulsView = (TextView) findViewById(R.id.bay_foul);
        foulsView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the Match
     */
    public void resetScore(View view) {
        scoreTeamB = scoreTeamB = 0;
        foulsTeamB = foulsTeamB = 0;
        scoreTeamA = scoreTeamA = 0;
        foulsTeamA = foulsTeamA = 0;

        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulsTeamB(0);
        displayFoulsTeamA(0);
    }

}
