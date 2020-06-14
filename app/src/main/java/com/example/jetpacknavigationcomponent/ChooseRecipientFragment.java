package com.example.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseRecipientFragment extends Fragment implements View.OnClickListener {

    private NavController mNavController;
    private Button mButtonCancel;

    public ChooseRecipientFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_recipient, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mNavController = Navigation.findNavController(view);
        Button buttonNext = view.findViewById(R.id.next_btn);
        buttonNext.setOnClickListener(this);
        mButtonCancel = view.findViewById(R.id.cancel_btn);
        mButtonCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next_btn:{
                mNavController.navigate(R.id.action_chooseRecipientFragment_to_specifyAmountFragment);
                break;
            }
            case R.id.cancel_btn:{
                //navOptions help us to clear navigation stack including the initiating fragment this,so after my button
                //take me to main fragment when i click back button on the main fragment i will exit from the app,just because my back stack is empty
                //NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.mainFragment,true).build();
                //mNavController.navigate(R.id.action_chooseRecipientFragment_to_mainFragment,null,navOptions);
                mNavController.navigate(R.id.action_chooseRecipientFragment_to_mainFragment);
                break;
            }
        }

    }
}
