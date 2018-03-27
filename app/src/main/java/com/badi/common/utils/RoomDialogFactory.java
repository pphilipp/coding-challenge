package com.badi.common.utils;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import com.badi.R;
/**
 * Class with static methods for creating dialogs for rooms
 */
public class RoomDialogFactory extends DialogFactory {

    public static Dialog createOneOptionDialog(Activity activity, boolean cancelable,
                                               final OnOneOptionDialogClickListener listener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View promptView = activity.getLayoutInflater().inflate(R.layout.dialog_rooms, null);
        builder.setView(promptView).setCancelable(cancelable);

        Dialog dialog = builder.create();

        promptView.findViewById(R.id.button_close)
                  .setOnClickListener(v -> dialog.dismiss());
        promptView.findViewById(R.id.button_search_list_room)
                  .setOnClickListener(v -> {
                      listener.onDialogPositiveButtonClick();
                      dialog.dismiss();
                  });

        return dialog;
    }

}
