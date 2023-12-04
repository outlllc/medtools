// Generated by view binder compiler. Do not edit!
package com.example.recycle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recycle.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityQueryValueBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText QueryAc;

  @NonNull
  public final Button QueryButtonConpre;

  @NonNull
  public final EditText QueryFl;

  @NonNull
  public final TextView QueryResultConpre;

  @NonNull
  public final EditText QueryYBpd;

  private ActivityQueryValueBinding(@NonNull LinearLayout rootView, @NonNull EditText QueryAc,
      @NonNull Button QueryButtonConpre, @NonNull EditText QueryFl,
      @NonNull TextView QueryResultConpre, @NonNull EditText QueryYBpd) {
    this.rootView = rootView;
    this.QueryAc = QueryAc;
    this.QueryButtonConpre = QueryButtonConpre;
    this.QueryFl = QueryFl;
    this.QueryResultConpre = QueryResultConpre;
    this.QueryYBpd = QueryYBpd;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityQueryValueBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityQueryValueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_query_value, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityQueryValueBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.QueryAc;
      EditText QueryAc = ViewBindings.findChildViewById(rootView, id);
      if (QueryAc == null) {
        break missingId;
      }

      id = R.id.QueryButtonConpre;
      Button QueryButtonConpre = ViewBindings.findChildViewById(rootView, id);
      if (QueryButtonConpre == null) {
        break missingId;
      }

      id = R.id.QueryFl;
      EditText QueryFl = ViewBindings.findChildViewById(rootView, id);
      if (QueryFl == null) {
        break missingId;
      }

      id = R.id.QueryResultConpre;
      TextView QueryResultConpre = ViewBindings.findChildViewById(rootView, id);
      if (QueryResultConpre == null) {
        break missingId;
      }

      id = R.id.QueryYBpd;
      EditText QueryYBpd = ViewBindings.findChildViewById(rootView, id);
      if (QueryYBpd == null) {
        break missingId;
      }

      return new ActivityQueryValueBinding((LinearLayout) rootView, QueryAc, QueryButtonConpre,
          QueryFl, QueryResultConpre, QueryYBpd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
