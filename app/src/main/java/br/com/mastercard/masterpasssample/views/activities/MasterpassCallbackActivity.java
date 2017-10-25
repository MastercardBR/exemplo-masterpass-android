package br.com.mastercard.masterpasssample.views.activities;

import android.support.v4.app.Fragment;

import br.com.mastercard.masterpasssample.R;
import br.com.mastercard.masterpasssample.views.fragments.MasterpassCallbackFragment;

/**
 * Mastercard - Masterpass example - app2web - v7 - 2017-09-13
 */


public class MasterpassCallbackActivity extends AbstractActivity {

    @Override
    public Fragment setFragmentActivity() {
        return new MasterpassCallbackFragment();
    }

    @Override
    public int setLayoutActivity() {
        return R.layout.activity_default;
    }

}