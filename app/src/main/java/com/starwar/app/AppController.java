package com.starwar.app;

import android.app.Application;
import android.content.Context;

import com.starwar.network.ApiFactory;
import com.starwar.network.StarWarCharacterService;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class AppController extends Application {

    private StarWarCharacterService starWarCharacterService;
    private Scheduler scheduler;

    private static AppController get(Context context) {
        return (AppController) context.getApplicationContext();
    }

    public static AppController create(Context context) {
        return AppController.get(context);
    }

    public StarWarCharacterService getCharaterService() {
        if (starWarCharacterService == null) {
            starWarCharacterService = ApiFactory.create();
        }

        return starWarCharacterService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }

        return scheduler;
    }

    public void setStarWarCharacterService(StarWarCharacterService usersService) {
        this.starWarCharacterService = usersService;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

}

