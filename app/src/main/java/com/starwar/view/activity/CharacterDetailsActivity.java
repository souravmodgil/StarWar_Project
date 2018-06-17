package com.starwar.view.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.starwar.databinding.ActivityCharacterDetailsBinding;
import com.starwar.R;
import com.starwar.model.StarWarCharacter;
import com.starwar.viewModel.CharacterDetailslViewModel;

public class CharacterDetailsActivity extends AppCompatActivity {

    private static final String EXTRA_USER = "EXTRA_USER";

    private ActivityCharacterDetailsBinding activityCharacterDetailsBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCharacterDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_character_details);
        displayHomeAsUpEnabled();
        getExtrasFromIntent();
    }

    private void displayHomeAsUpEnabled() {

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static Intent fillDetail(Context context, StarWarCharacter starWarCharacter) {
        Intent intent = new Intent(context, CharacterDetailsActivity.class);
        intent.putExtra(EXTRA_USER, starWarCharacter);
        return intent;
    }

    private void getExtrasFromIntent(){
        StarWarCharacter StarWarCharacter = (StarWarCharacter) getIntent().getSerializableExtra(EXTRA_USER);
        CharacterDetailslViewModel characterDetailslViewModel = new CharacterDetailslViewModel(StarWarCharacter);
        activityCharacterDetailsBinding.setCharacterDetilsModel(characterDetailslViewModel);
        //   setTitle(StarWarCharacter.name.title + "." + StarWarCharacter.name.first + " " + StarWarCharacter.name.last);
    }

}


