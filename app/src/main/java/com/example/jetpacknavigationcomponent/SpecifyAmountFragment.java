package com.example.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpecifyAmountFragment extends Fragment implements View.OnClickListener {

    private NavController mNavController;
    private Button mButtonCancel;

    public SpecifyAmountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mNavController = Navigation.findNavController(view);
        Button buttonSend = view.findViewById(R.id.send_btn);
        buttonSend.setOnClickListener(this);

        mButtonCancel = view.findViewById(R.id.cancel_btn);
        mButtonCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.send_btn:{
                mNavController.navigate(R.id.action_specifyAmountFragment_to_confirmationFragment);
                break;
            }
            case R.id.cancel_btn:{
                mNavController.navigate(R.id.action_specifyAmountFragment_to_chooseRecipientFragment);
                break;
            }
        }

    }
}
