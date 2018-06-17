package com.starwar.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.view.View;

import com.starwar.model.StarWarCharacter;
import com.starwar.view.activity.CharacterDetailsActivity;

public class ItemCharacterViewModel extends BaseObservable {

    private StarWarCharacter starWarCharacter;
    private Context context;

    public ItemCharacterViewModel(StarWarCharacter starWarCharacterList, Context context){
        this.starWarCharacter = starWarCharacterList;
        this.context = context;
    }





    public String getName() {
        return  starWarCharacter.getName();

    }

    public void onItemClick(View v){
        context.startActivity(CharacterDetailsActivity.fillDetail(v.getContext(), starWarCharacter));
    }

    public void setUser(StarWarCharacter starWarCharacterList) {
        this.starWarCharacter = starWarCharacterList;
        notifyChange();
    }
}
