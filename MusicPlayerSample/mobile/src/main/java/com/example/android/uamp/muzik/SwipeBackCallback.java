package com.example.android.uamp.muzik;

import android.util.Log;

import com.example.android.uamp.ui.FullScreenPlayerActivity;
import com.example.android.uamp.ui.MusicPlayerActivity;
import com.example.android.uamp.utils.LogHelper;
import com.muzik.accessory.MzGesture;
import com.muzik.accessory.callback.IMzGestureCallback;

/**I
 * Created by amade on 4/23/2016.
 */
public class SwipeBackCallback implements IMzGestureCallback {

    final MusicPlayerActivity _owner;
    private static final String TAG = LogHelper.makeLogTag(FullScreenPlayerActivity.class);

    public SwipeBackCallback(MusicPlayerActivity owner)
    {
        Log.d(TAG, "callback ctor");
        _owner = owner;
    }

    @Override
    public void onResponseReceived(MzGesture mzGesture, byte[] bytes) {
        Log.d(TAG, "back received");
        _owner.DecreaseCallback();
    }
}
