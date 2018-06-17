package com.starwar.viewModel;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.starwar.model.StarWarCharacter;
import com.starwar.utils.Util;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Observable;

public class CharacterDetailslViewModel extends Observable {

    private StarWarCharacter starWarCharacter;

    public CharacterDetailslViewModel(StarWarCharacter starWarCharacter) {this.starWarCharacter = starWarCharacter;}

    public String getName(){

        return starWarCharacter.getName();
    }

    public String getMass(){return starWarCharacter.getMass();}

    public String getHeight() { return  ""+(double) (Double.parseDouble(starWarCharacter.getHeight()) )/ 100 ; }


    public String getDate() {
     return Util.parseDate(starWarCharacter.getCreated());
    }




}
