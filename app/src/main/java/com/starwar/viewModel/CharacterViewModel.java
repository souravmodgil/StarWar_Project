package com.starwar.viewModel;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

import com.starwar.R;
import com.starwar.app.AppController;
import com.starwar.model.StarWarCharacter;
import com.starwar.model.StarWarCharacterResponse;
import com.starwar.network.StarWarCharacterService;
import com.starwar.view.activity.CharacterDetailsActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import static com.starwar.utils.Constant.Star_WAR_CHARCTER_URL;

public class CharacterViewModel extends Observable {

    public ObservableInt progressBar;
    public ObservableInt userRecycler;
    public ObservableInt userLabel;
    public ObservableField<String> messageLabel;

    private List<StarWarCharacter> StarWarCharacterList;
    private Context context;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public CharacterViewModel(@NonNull Context context) {
        this.context = context;
        this.StarWarCharacterList = new ArrayList<>();
        progressBar = new ObservableInt(View.GONE);
        userRecycler = new ObservableInt(View.GONE);
        userLabel = new ObservableInt(View.VISIBLE);
        messageLabel = new ObservableField<>(context.getString(R.string.default_message_loading_character));
        initializeViews();
        fetchUsersList();
    }
    public void onItemClick(View v){
        initializeViews();
        fetchUsersList();
      //  context.startActivity(CharacterDetailsActivity.fillDetail(v.getContext(), starWarCharacter));
    }



    //It is "public" to show an example of test
    public void initializeViews() {
        userLabel.set(View.GONE);
        userRecycler.set(View.GONE);
        progressBar.set(View.VISIBLE);
    }

    private void fetchUsersList() {

        AppController appController = AppController.create(context);
        StarWarCharacterService starWarCharacterService = appController.getCharaterService();

        Disposable disposable = starWarCharacterService.fetchCharcaterList(Star_WAR_CHARCTER_URL)
                .subscribeOn(appController.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<StarWarCharacterResponse>() {
                    @Override public void accept(StarWarCharacterResponse starWarCharacterResponse) throws Exception {
                        updateCharacterList(starWarCharacterResponse.getResults());
                        progressBar.set(View.GONE);
                        userLabel.set(View.GONE);
                        userRecycler.set(View.VISIBLE);
                    }
                }, new Consumer<Throwable>() {
                    @Override public void accept(Throwable throwable) throws Exception {
                        messageLabel.set(context.getString(R.string.error_message_loading_charcater_list));
                        progressBar.set(View.GONE);
                        userLabel.set(View.VISIBLE);
                        userRecycler.set(View.GONE);
                    }
                });

        compositeDisposable.add(disposable);
    }

    private void updateCharacterList(List<StarWarCharacter> characterLists) {
        StarWarCharacterList.addAll(characterLists);
        setChanged();
        notifyObservers();
    }

    public List<StarWarCharacter> getStarWarCharacterList() {
        return StarWarCharacterList;
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void reset() {
        unSubscribeFromObservable();
        compositeDisposable = null;
        context = null;
    }
}
