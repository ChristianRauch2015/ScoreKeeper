package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String GOALS_SCORE_A = "goalsTeamA";
    static final String GOALS_SCORE_B = "goalsTeamB";
    static final String CORNERS_SCORE_A = "cornersTeamA";
    static final String CORNERS_SCORE_B = "cornersTeamB";
    static final String OFFSIDES_SCORE_A = "offsidesTeamA";
    static final String OFFSIDES_SCORE_B = "offsidesTeamB";
    int goalsTeamA;
    int goalsTeamB;
    int cornersTeamA;
    int cornersTeamB;
    int offsidesTeamA;
    int offsidesTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            goalsTeamA = savedInstanceState.getInt(GOALS_SCORE_A);
            goalsTeamB = savedInstanceState.getInt(GOALS_SCORE_B);
            cornersTeamA = savedInstanceState.getInt(CORNERS_SCORE_A);
            cornersTeamB = savedInstanceState.getInt(CORNERS_SCORE_B);
            offsidesTeamA = savedInstanceState.getInt(OFFSIDES_SCORE_A);
            offsidesTeamB = savedInstanceState.getInt(OFFSIDES_SCORE_B);
        } else {
            goalsTeamA = 0;
            goalsTeamB = 0;
            cornersTeamA = 0;
            cornersTeamB = 0;
            offsidesTeamA = 0;
            offsidesTeamB = 0;
        }
        setContentView(R.layout.activity_main);
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);
        displayOffsidesForTeamA(offsidesTeamA);
        displayOffsidesForTeamB(offsidesTeamB);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(GOALS_SCORE_A, goalsTeamA);
        savedInstanceState.putInt(GOALS_SCORE_B, goalsTeamB);
        savedInstanceState.putInt(CORNERS_SCORE_A, cornersTeamA);
        savedInstanceState.putInt(CORNERS_SCORE_B, cornersTeamB);
        savedInstanceState.putInt(OFFSIDES_SCORE_A, offsidesTeamA);
        savedInstanceState.putInt(OFFSIDES_SCORE_B, offsidesTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        goalsTeamA = savedInstanceState.getInt(GOALS_SCORE_A);
        goalsTeamB = savedInstanceState.getInt(GOALS_SCORE_B);
        cornersTeamA = savedInstanceState.getInt(CORNERS_SCORE_A);
        cornersTeamB = savedInstanceState.getInt(CORNERS_SCORE_B);
        offsidesTeamA = savedInstanceState.getInt(OFFSIDES_SCORE_A);
        offsidesTeamB = savedInstanceState.getInt(OFFSIDES_SCORE_B);
    }

    /**
     * Increase the offsides for Team A by 1.
     */
    public void addOffsideForTeamA(View v) {
        offsidesTeamA = offsidesTeamA + 1;
        displayOffsidesForTeamA(offsidesTeamA);
    }

    /**
     * Increase the corners for Team A by 1.
     */
    public void addCornerForTeamA(View v) {
        cornersTeamA = cornersTeamA + 1;
        displayCornersForTeamA(cornersTeamA);
    }

    /**
     * Increase the goals for Team A by 1.
     */
    public void addGoalForTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    /**
     * Displays the given goals for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corners for Team A.
     */
    public void displayCornersForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given offsides for Team A.
     */
    public void displayOffsidesForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_offsides);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the offsides for Team B by 1.
     */
    public void addOffsideForTeamB(View v) {
        offsidesTeamB = offsidesTeamB + 1;
        displayOffsidesForTeamB(offsidesTeamB);
    }

    /**
     * Increase the corners for Team B by 1.
     */
    public void addCornerForTeamB(View v) {
        cornersTeamB = cornersTeamB + 1;
        displayCornersForTeamB(cornersTeamB);
    }

    /**
     * Increase the goals for Team B by 1.
     */
    public void addGoalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    /**
     * Displays the given goals for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corners for Team B.
     */
    public void displayCornersForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given offsides for Team B.
     */
    public void displayOffsidesForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_offsides);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets all scores to 0.
     */
    public void reset(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        offsidesTeamA = 0;
        offsidesTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);
        displayOffsidesForTeamA(offsidesTeamA);
        displayOffsidesForTeamB(offsidesTeamB);
    }
}


