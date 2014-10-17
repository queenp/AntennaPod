package de.danoeh.antennapod.config;

import android.content.Context;
import android.content.Intent;

import de.danoeh.antennapod.activity.AudioplayerActivity;
import de.danoeh.antennapod.activity.VideoplayerActivity;
import de.danoeh.antennapod.core.PlaybackServiceCallbacks;
import de.danoeh.antennapod.core.feed.MediaType;


public class PlaybackServiceCallbacksImpl implements PlaybackServiceCallbacks {
    @Override
    public Intent getPlayerActivityIntent(Context context, MediaType mediaType) {
        if (mediaType == MediaType.VIDEO) {
            return new Intent(context, VideoplayerActivity.class);
        } else {
            return new Intent(context, AudioplayerActivity.class);
        }
    }
}