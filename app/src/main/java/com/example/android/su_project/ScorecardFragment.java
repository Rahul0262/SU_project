package com.example.android.su_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by RAHUL on 7/17/2018.
 */

public class ScorecardFragment extends Fragment {
    private int scoreForTeamB = 0;
    private int scoreForTeamA = 0;
    private TextView scoreView;
    private Button incre3a;
    private Button incre2a;
    private Button incre1a;
    private Button incre3b;
    private Button incre2b;
    private Button incre1b;
    private Button rese;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceStare){
        return inflater.inflate(R.layout.fragment_scorecard,container,false);
    }
    @Override
    public void onStart() {
        super.onStart();
        initControls();
    }

    private void initControls(){
        incre3a = (Button)getView().findViewById(R.id.increment3a);
        incre3b = (Button)getView().findViewById(R.id.increment3b);
        incre2a = (Button)getView().findViewById(R.id.increment2a);
        incre2b = (Button)getView().findViewById(R.id.increment2b);
        incre1a = (Button)getView().findViewById(R.id.increment1a);
        incre1b = (Button)getView().findViewById(R.id.increment1b);
        rese = (Button)getView().findViewById(R.id.reset);
        incre3a.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){increment3a();}});
        incre3b.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){increment3b();}});
        incre2a.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){increment2a();}});
        incre2b.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){increment2b();}});
        incre1a.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){increment1a();}});
        incre1b.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){increment1b();}});
        rese.setOnClickListener(new Button.OnClickListener(){public void onClick(View v){Reset();}});
    }
    /**
     * This method is called when the +3 points button is clicked.
     */
    public void increment3a(){
        scoreForTeamA = scoreForTeamA + 3;
        if (scoreForTeamA >= 26) {
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        } else {
            displayForTeamA(scoreForTeamA);
        }
    }

    /**
     * This method is called when the +2 points button is clicked.
     */
    public void increment2a() {
        scoreForTeamA = scoreForTeamA + 2;
        if (scoreForTeamA >= 26) {
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        } else {
            displayForTeamA(scoreForTeamA);
        }
    }

    /**
     * This method is called when the +1 points button is clicked.
     */
    public void increment1a() {
        scoreForTeamA = scoreForTeamA + 1;
        if (scoreForTeamA >= 26) {
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        } else {
            displayForTeamA(scoreForTeamA);
        }
    }

    /**
     * This method is called when the +3 points button is clicked.
     */
    public void increment3b() {
        scoreForTeamB = scoreForTeamB + 3;

        if (scoreForTeamB >= 26) {
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        } else {
            displayForTeamB(scoreForTeamB);
        }
    }

    /**
     * This method is called when the +2 points button is clicked.
     */
    public void increment2b() {
        scoreForTeamB = scoreForTeamB + 2;
        if (scoreForTeamB >= 26) {
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        } else {
            displayForTeamB(scoreForTeamB);
        }
    }

    /**
     * This method is called when the +1 points button is clicked.
     */
    public void increment1b() {
        scoreForTeamB = scoreForTeamB + 1;
        if (scoreForTeamB >= 26) {
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA(scoreForTeamA);
            displayForTeamB(scoreForTeamB);
        } else {
            displayForTeamB(scoreForTeamB);
        }
    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void Reset() {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
        displayForTeamA(scoreForTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreView = (TextView)getView().findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreView = (TextView)getView().findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

