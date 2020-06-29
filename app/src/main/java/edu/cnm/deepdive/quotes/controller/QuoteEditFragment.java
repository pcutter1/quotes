package edu.cnm.deepdive.quotes.controller;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cnm.deepdive.quotes.R;

public class QuoteEditFragment extends DialogFragment {

  private static final String ID_KEY = "quote_id";

  private long quouteId;
  private View root;
  private EditText quoteText;
  private AutoCompleteTextView sourceName;

  public static QuoteEditFragment newInstance(long quoteId) {
    QuoteEditFragment fragment = new QuoteEditFragment();
    Bundle args = new Bundle();
    args.putLong(ID_KEY, quoteId);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      quouteId = getArguments().getLong(ID_KEY, 0);
    }
  }

  @NonNull
  @Override
  public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
    root = LayoutInflater.from(getContext()).inflate(R.layout.fragment_quote_edit, null, false);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return root;
  }
}
