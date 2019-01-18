package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    //Tracks the score for the team A
    int teamAGoals = 0;

    //Tracks the score for the team B
    int teamBGoals = 0;

    //Tracks the number of matches won for the team A
    int teamAMatches = 0;

    //Tracks the number of matches won for the team B
    int teamBMatches = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds 1 goal for the score for Team A when clicking the button.
     */
    public void goalForTeamA(View v) {
        teamAGoals += 1;
        displayGoalForTeamA(teamAGoals);
    }

    /**
     * Adds 1 match for the matches score for Team A when clicking the button.
     */
    public void matchForTeamA(View v) {
        teamAMatches += 1;
        displayMatchForTeamA(teamAMatches);
        resetGoals(v);
    }

    /**
     * Adds 1 goal for the score for Team B when clicking the button.
     */
    public void goalForTeamB(View v) {
        teamBGoals += 1;
        displayGoalForTeamB(teamBGoals);
    }

    /**
     * Adds 1 match for the matches score for Team B when clicking the button.
     */
    public void matchForTeamB(View v) {
        teamBMatches += 1;
        displayMatchForTeamB(teamBMatches);
        resetGoals(v);
    }

    /**
     * Resets the scores for Team A and Team B.
     */
    public void resetGoals(View v) {
        teamAGoals = 0;
        teamBGoals = 0;

        displayGoalForTeamA(teamAGoals);
        displayGoalForTeamB(teamBGoals);
    }

    /**
     * Resets the scores and matches won for Team A and Team B.
     */
    public void resetAll(View v) {
        teamAGoals = 0;
        teamBGoals = 0;
        teamAMatches = 0;
        teamBMatches = 0;

        displayGoalForTeamA(teamAGoals);
        displayGoalForTeamB(teamBGoals);
        displayMatchForTeamA(teamAMatches);
        displayMatchForTeamB(teamBMatches);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given won matches for Team A.
     */
    public void displayMatchForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_matches_won);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given won matches for Team B.
     */
    public void displayMatchForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_matches_won);
        scoreView.setText(String.valueOf(score));
    }
}
