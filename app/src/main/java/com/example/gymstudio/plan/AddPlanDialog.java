package com.example.gymstudio.plan;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.gymstudio.R;

public class AddPlanDialog extends DialogFragment {
    private TextView GynName;
    private EditText minutes;
    private Spinner days;
    private Button cancel, addPlan;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_add_plan,null);
        initUI(view);
        Bundle bundle = getArguments();



        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setView(view)
                .setTitle("Add Plan")
                .setIcon(R.mipmap.ic_launcher_round);
        return builder.create();
    }

    private void initUI(View view) {
        GynName = view.findViewById(R.id.gym_name);
        minutes = view.findViewById(R.id.minutes);
        days = view.findViewById(R.id.day);
        cancel = view.findViewById(R.id.cancel_button);
        addPlan = view.findViewById(R.id.add_plan_button);
    }
}
