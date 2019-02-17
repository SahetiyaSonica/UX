package edu.gatech.cs2340.lab3newcomponents.views;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import edu.gatech.cs2340.lab3newcomponents.R;
import edu.gatech.cs2340.lab3newcomponents.entity.Difficulty;
import edu.gatech.cs2340.lab3newcomponents.viewmodels.ConfigurationViewModel;

public class ConfigurationActivity extends AppCompatActivity {


    private ConfigurationViewModel configurationViewModel;

// widgets we will need in our view

    private EditText playerName;

    private TextView difficultTitle;

    private Spinner difficultyLevel;

    private TextView skillTitle;

    private TextView skillOneTitle;

    private Spinner skillTypeOne;

    private TextView skillTwoTitle;

    private Spinner skillTypeTwo;

    private TextView skillThreeTitle;

    private Spinner skillTypeThree;

    private TextView skillFourTitle;

    private Spinner skillTypeFour;

    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.character_edit);

        /*
         * Grab the dialog widgets so we can get info for later
         */
        playerName = findViewById(R.id.name);
        difficultTitle = findViewById(R.id.diffTitle);
        difficultyLevel = findViewById(R.id.diffLevel);
        skillTitle = findViewById(R.id.skillTitle);
        skillOneTitle = findViewById(R.id.firstSkillTitle);
        skillTypeOne = findViewById(R.id.firstSkillSpin);
        skillTwoTitle = findViewById(R.id.secondSkillTitle);
        skillTypeTwo = findViewById(R.id.secondSkillSpin);
        skillThreeTitle = findViewById(R.id.thirdSkillTitle);
        skillTypeThree = findViewById(R.id.thirdSkillSpin);
        skillFourTitle = findViewById(R.id.fourthSkillTitle);
        skillTypeFour = findViewById(R.id.fourthSkillSpin);
        Button startButton = findViewById(R.id.startGameButton);

         /*
          Set up the adapter to display the allowable difficulties in the spinner
         */

        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Difficulty.legalDifficulties);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        majorSpinner.setAdapter(adapter);

        ArrayAdapter<ClassStanding> adapterStand = new ArrayAdapter<ClassStanding>(this, android.R.layout.simple_spinner_item, ClassStanding.values());
        adapterStand.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        standingSpinner.setAdapter(adapterStand);
        */

    }

}