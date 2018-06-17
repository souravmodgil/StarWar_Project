package com.starwar.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.starwar.R;
import com.starwar.databinding.ActivityCharacterBinding;
import com.starwar.view.adapter.CharacaterAdapter;
import com.starwar.viewModel.CharacterViewModel;

import java.util.Observable;
import java.util.Observer;

public class CharacterActivity extends AppCompatActivity implements Observer {

    private ActivityCharacterBinding characterActivityBinding;
    private CharacterViewModel characterViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        setUpListOfUsersView(characterActivityBinding.listUser);
        setUpObserver(characterViewModel);
    }

    private void initDataBinding() {
        characterActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_character);
        characterViewModel = new CharacterViewModel(this);
        characterActivityBinding.setCharacterViewModel(characterViewModel);
    }

    // set up the list of user with recycler view
    private void setUpListOfUsersView(RecyclerView listUser) {
        CharacaterAdapter userAdapter = new CharacaterAdapter();
        listUser.setAdapter(userAdapter);
        listUser.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setUpObserver(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  CharacterViewModel) {
            CharacaterAdapter characaterAdapter = (CharacaterAdapter) characterActivityBinding.listUser.getAdapter();
            CharacterViewModel characterViewModel = (CharacterViewModel) o;
            characaterAdapter.setStarWarCharacterLists(characterViewModel.getStarWarCharacterList());
       }
    }

    private void startActivityActionView() {
       // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Constant.PROJECT_URL)));
    }





    @Override protected void onDestroy() {
        super.onDestroy();
        characterViewModel.reset();
    }


}

