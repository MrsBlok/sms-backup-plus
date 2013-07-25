package com.zegoggles.smssync.syncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    private SyncAdapter mSyncAdapter;


    @Override public void onCreate() {
        super.onCreate();
        mSyncAdapter = new SyncAdapter(this, false);
    }

    @Override public IBinder onBind(Intent intent) {
        return mSyncAdapter.getSyncAdapterBinder();
    }
}
