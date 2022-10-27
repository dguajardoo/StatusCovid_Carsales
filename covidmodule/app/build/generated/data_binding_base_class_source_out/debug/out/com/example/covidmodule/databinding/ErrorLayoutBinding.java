// Generated by view binder compiler. Do not edit!
package com.example.covidmodule.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.covidmodule.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ErrorLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRetry;

  @NonNull
  public final ImageView imageViewError;

  @NonNull
  public final TextView textViewError;

  private ErrorLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonRetry,
      @NonNull ImageView imageViewError, @NonNull TextView textViewError) {
    this.rootView = rootView;
    this.buttonRetry = buttonRetry;
    this.imageViewError = imageViewError;
    this.textViewError = textViewError;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ErrorLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ErrorLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.error_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ErrorLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonRetry;
      Button buttonRetry = ViewBindings.findChildViewById(rootView, id);
      if (buttonRetry == null) {
        break missingId;
      }

      id = R.id.imageViewError;
      ImageView imageViewError = ViewBindings.findChildViewById(rootView, id);
      if (imageViewError == null) {
        break missingId;
      }

      id = R.id.textViewError;
      TextView textViewError = ViewBindings.findChildViewById(rootView, id);
      if (textViewError == null) {
        break missingId;
      }

      return new ErrorLayoutBinding((ConstraintLayout) rootView, buttonRetry, imageViewError,
          textViewError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
