package com.android.omdbtest.adapter;

import com.android.omdbtest.model.ShowSearchDetails;

public interface IShowClickListner
{
    void onShowClick(ShowSearchDetails showDetails);
    void onSaveBookMark(ShowSearchDetails showDetails);
    void onDeleteBookMark(ShowSearchDetails showDetails);
}
