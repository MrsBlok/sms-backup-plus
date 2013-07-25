package com.zegoggles.smssync.syncadapter;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

import static com.zegoggles.smssync.App.TAG;

public class SyncAdapter extends AbstractThreadedSyncAdapter {

    public SyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
    }

    @Override public void onPerformSync(Account account,
                                        Bundle extras,
                                        String authority,
                                        ContentProviderClient contentProviderClient,
                                        SyncResult syncResult) {

        Log.d(TAG, "onPerformSync()");
    }

    @Override public void onSyncCanceled() {
        super.onSyncCanceled();
        Log.d(TAG, "onSyncCanceled()");
    }
}
