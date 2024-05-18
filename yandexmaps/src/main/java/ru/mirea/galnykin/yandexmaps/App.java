package ru.mirea.galnykin.yandexmaps;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "3e7be3cc-a864-4806-bc25-b8d088ba02aa";
    @Override
    public void onCreate() {
        super.onCreate();

        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
