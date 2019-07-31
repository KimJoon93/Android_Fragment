package com.example.songdetail;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.songdetail.content.SongUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class SongDetailFragment extends Fragment {

    public SongUtils.Song mSong;

    public SongDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(SongUtils.SONG_ID_KEY)) {
            // Load the content specified by the fragment arguments.
            mSong = SongUtils.SONG_ITEMS.get(getArguments().getInt(SongUtils.SONG_ID_KEY));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.song_detail, container, false);

        // Show the detail information in a TextView.

        if (mSong != null) {
            ((TextView) rootView.findViewById(R.id.song_detail)).setText(mSong.details);
        }

        return rootView;
    }

    public static SongDetailFragment newInstance (int selectedSong) {
        SongDetailFragment fragment = new SongDetailFragment();
        // Set the bundle arguments for the fragment.
        Bundle arguments = new Bundle();
        arguments.putInt(SongUtils.SONG_ID_KEY, selectedSong);
        fragment.setArguments(arguments);
        return fragment;
    }

}