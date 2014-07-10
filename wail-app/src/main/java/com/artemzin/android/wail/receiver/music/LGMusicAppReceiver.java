package com.artemzin.android.wail.receiver.music;

import android.content.Context;
import android.content.Intent;

public class LGMusicAppReceiver extends CommonMusicAppReceiver {

    @Override
    protected Intent handleIntent(Context context, Intent originalIntent) {
        return super.handleIntent(context, originalIntent)
                .putExtra(EXTRA_PLAYER_PACKAGE_NAME, "com.lge.music");
    }
}
