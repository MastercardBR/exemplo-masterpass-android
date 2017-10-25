package br.com.mastercard.masterpasssample.views.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import br.com.mastercard.masterpasssample.R;
import butterknife.ButterKnife;

/**
 * Mastercard - Masterpass example - app2web - v7 - 2017-09-13
 */


public abstract class AbstractActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutActivity());
        injectViews();

        if (setFragmentActivity() != null) {
            addFragment();
        }
    }

    public void addFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout_all, setFragmentActivity());
        fragmentTransaction.commit();
    }

    public abstract Fragment setFragmentActivity();

    public abstract int setLayoutActivity();

    private void injectViews() {
        ButterKnife.bind(this);
    }
}

