package br.com.mastercard.masterpasssample.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import timber.log.Timber;

/**
 * Mastercard - Masterpass example - app2web - v7 - 2017-09-13
 */


public abstract class AbstractFragment extends Fragment {

    protected static final String TAG = AbstractFragment.class.getSimpleName();

    private Context mContext;

    abstract int getFragmentLayout();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.tag(TAG);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getFragmentLayout(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        injectViews(view);
    }

    private void injectViews(final View view) {
        ButterKnife.bind(this, view);
    }

    /**
     * This method can be accessed to display message from the Toast
     * @param message The message to be displayed
     */
    public void showMessage(@NonNull String message) {
        Timber.d("Show message ->> " + message);
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
