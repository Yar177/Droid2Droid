package com.yarsher.at.droid2droid;

import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v4.app.ListFragment;

import com.yarsher.at.droid2droid.services.P2pBroadcastReceiver;

public class DeviceListFragment extends ListFragment implements WifiP2pManager.PeerListListener {


    @Override
    public void onPeersAvailable(WifiP2pDeviceList peers) {

    }
}
