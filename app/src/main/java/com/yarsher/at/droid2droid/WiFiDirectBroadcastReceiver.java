package com.yarsher.at.droid2droid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;

class WiFiDirectBroadcastReceiver extends BroadcastReceiver {

    private WifiP2pManager mManager;
    private WifiP2pManager.Channel mChannel;
    private MainActivity activity;

    public WiFiDirectBroadcastReceiver(WifiP2pManager mManager, WifiP2pManager.Channel mChannel, MainActivity mainActivity) {
        super();
        this.mManager = mManager;
        this.mChannel = mChannel;
        this.activity = mainActivity;

    }

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}
