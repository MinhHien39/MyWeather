// Generated by view binder compiler. Do not edit!
package org.meicode.myappweather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.meicode.myappweather.R;

public final class DayItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imgDay;

  @NonNull
  public final TextView txtDay;

  @NonNull
  public final TextView txtDayTemp1;

  @NonNull
  public final TextView txtDayTemp2;

  private DayItemBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imgDay,
      @NonNull TextView txtDay, @NonNull TextView txtDayTemp1, @NonNull TextView txtDayTemp2) {
    this.rootView = rootView;
    this.imgDay = imgDay;
    this.txtDay = txtDay;
    this.txtDayTemp1 = txtDayTemp1;
    this.txtDayTemp2 = txtDayTemp2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DayItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DayItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.day_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DayItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_day;
      ImageView imgDay = ViewBindings.findChildViewById(rootView, id);
      if (imgDay == null) {
        break missingId;
      }

      id = R.id.txt_day;
      TextView txtDay = ViewBindings.findChildViewById(rootView, id);
      if (txtDay == null) {
        break missingId;
      }

      id = R.id.txt_dayTemp1;
      TextView txtDayTemp1 = ViewBindings.findChildViewById(rootView, id);
      if (txtDayTemp1 == null) {
        break missingId;
      }

      id = R.id.txt_dayTemp2;
      TextView txtDayTemp2 = ViewBindings.findChildViewById(rootView, id);
      if (txtDayTemp2 == null) {
        break missingId;
      }

      return new DayItemBinding((RelativeLayout) rootView, imgDay, txtDay, txtDayTemp1,
          txtDayTemp2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
