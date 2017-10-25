package br.com.mastercard.masterpasssample;

import android.app.Application;

import timber.log.Timber;

public class MasterpassSampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        configTimber();
    }

    private void configTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected String createStackElementTag(StackTraceElement element) {
                    return super.createStackElementTag(element) + ':' + element.getLineNumber();
                }
            });
        }
    }
}
