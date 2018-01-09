package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int cornersTeamA = 0;
    int cornersTeamB = 0;
    int offsidesTeamA = 0;
    int offsidesTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
    }

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        /* Inflate the menu; this adds items to the action bar if it is present.*/
    //    getMenuInflater().inflate(R.menu.menu_main, menu);
    //    return true;
    //}

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    //int id = item.getItemId();
    //noinspection SimplifiableIfStatement
    //if (id == R.id.action_settings) {
    //    return true;
    //}
    //return super.onOptionsItemSelected(item);
    //}

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


