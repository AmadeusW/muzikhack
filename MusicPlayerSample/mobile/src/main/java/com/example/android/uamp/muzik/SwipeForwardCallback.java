package com.example.android.uamp.muzik;

import com.example.android.uamp.ui.FullScreenPlayerActivity;
import com.example.android.uamp.ui.MusicPlayerActivity;
import com.muzik.accessory.MzGesture;
import com.muzik.accessory.callback.IMzGestureCallback;

/**
 * Created by amade on 4/23/2016.
 */
public class SwipeForwardCallback implements IMzGestureCallback {

    final MusicPlayerActivity _owner;

    public SwipeForwardCallback(MusicPlayerActivity owner)
    {
        _owner = owner;
    }

    @Override
    public void onResponseReceived(MzGesture mzGesture, byte[] bytes) {
        _owner.IncreaseCallback();
    }
}
