package com.example.android.su_project;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by RAHUL on 7/16/2018.
 */

public class MediaPlayerFragment extends Fragment {
    ImageButton play, pause, stop, play2, pause2, stop2;
    MediaPlayer sound, sound1;
    int paus, paus1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_mediaplayer, container, false);

        play = (ImageButton) rootview.findViewById(R.id.play);
        pause = (ImageButton) rootview.findViewById(R.id.pause);
        stop = (ImageButton) rootview.findViewById(R.id.stop);
        play2 = (ImageButton) rootview.findViewById(R.id.play2);
        pause2 = (ImageButton) rootview.findViewById(R.id.pause2);
        stop2 = (ImageButton) rootview.findViewById(R.id.stop2);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound == null) {
                    sound = MediaPlayer.create(getActivity(), R.raw.track1);
                    sound.start();
                } else if (!sound.isPlaying()) {
                    sound.seekTo(paus);
                    sound.start();
                }
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound != null) {
                    sound.pause();
                    paus = sound.getCurrentPosition();
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.stop();
                sound = null;
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound1 == null) {
                    sound1 = MediaPlayer.create(getActivity(), R.raw.track2);
                    sound1.start();
                } else if (!sound1.isPlaying()) {
                    sound1.seekTo(paus1);
                    sound1.start();
                }
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound1 != null) {
                    sound1.pause();
                    paus1 = sound1.getCurrentPosition();
                }
            }
        });
        stop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound1.stop();
                sound1 = null;
            }
        });
        return rootview;
    }
}
