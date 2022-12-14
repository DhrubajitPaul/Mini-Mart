// Generated by view binder compiler. Do not edit!
package dhrubajit.com.dhrubajit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dhrubajit.com.dhrubajit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPreviousOrdersBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button backButton;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RecyclerView previousRecycler;

  @NonNull
  public final TextView textView5;

  private FragmentPreviousOrdersBinding(@NonNull FrameLayout rootView, @NonNull Button backButton,
      @NonNull LinearLayout linearLayout, @NonNull RecyclerView previousRecycler,
      @NonNull TextView textView5) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.linearLayout = linearLayout;
    this.previousRecycler = previousRecycler;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPreviousOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPreviousOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_previous_orders, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPreviousOrdersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      Button backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.previous_recycler;
      RecyclerView previousRecycler = ViewBindings.findChildViewById(rootView, id);
      if (previousRecycler == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new FragmentPreviousOrdersBinding((FrameLayout) rootView, backButton, linearLayout,
          previousRecycler, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
