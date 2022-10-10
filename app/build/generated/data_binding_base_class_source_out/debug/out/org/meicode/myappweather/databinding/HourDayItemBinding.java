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

public final class HourDayItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imgTemp;

  @NonNull
  public final TextView txtHour;

  @NonNull
  public final TextView txtTemp;

  private HourDayItemBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imgTemp,
      @NonNull TextView txtHour, @NonNull TextView txtTemp) {
    this.rootView = rootView;
    this.imgTemp = imgTemp;
    this.txtHour = txtHour;
    this.txtTemp = txtTemp;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HourDayItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HourDayItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.hour_day_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HourDayItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_temp;
      ImageView imgTemp = ViewBindings.findChildViewById(rootView, id);
      if (imgTemp == null) {
        break missingId;
      }

      id = R.id.txt_hour;
      TextView txtHour = ViewBindings.findChildViewById(rootView, id);
      if (txtHour == null) {
        break missingId;
      }

      id = R.id.txt_temp;
      TextView txtTemp = ViewBindings.findChildViewById(rootView, id);
      if (txtTemp == null) {
        break missingId;
      }

      return new HourDayItemBinding((RelativeLayout) rootView, imgTemp, txtHour, txtTemp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
