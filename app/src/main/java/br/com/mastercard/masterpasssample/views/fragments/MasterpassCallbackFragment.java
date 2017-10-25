package br.com.mastercard.masterpasssample.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import br.com.mastercard.masterpasssample.R;
import butterknife.BindView;

/**
 * Mastercard - Masterpass example - app2web - v7 - 2017-09-13
 */

public class MasterpassCallbackFragment extends AbstractFragment {

    @BindView(R.id.textview_masterpass_status)
    TextView mTvMasterpassStatus;

    @BindView(R.id.textview_masterpass_oauthtoken)
    TextView mTvMasterpassOAuthToken;

    @Override
    int getFragmentLayout() {
        return R.layout.fragment_masterpass_callback;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        handleExtras();
    }

    private void handleExtras() {
        Bundle extras = getActivity().getIntent().getExtras();
        if (extras != null) {
            String oauthToken = extras.getString("oauth_token");
            String mpstatus = extras.getString("mpstatus");

            mTvMasterpassStatus.setText(mpstatus);
            mTvMasterpassOAuthToken.setText(oauthToken);
        }
    }
}
