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
public class MainFragment extends Fragment implements View.OnClickListener {

    private NavController mNavController;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mNavController = Navigation.findNavController(view);

        Button buttonViewTransaction = view.findViewById(R.id.view_transactions_btn);
        buttonViewTransaction.setOnClickListener(this);
        Button buttonSendMoney = view.findViewById(R.id.send_money_btn);
        buttonSendMoney.setOnClickListener(this);
        Button buttonViewBalance = view.findViewById(R.id.view_balance_btn);
        buttonViewBalance.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.view_transactions_btn: {
                mNavController.navigate(R.id.action_mainFragment_to_viewTransactionFragment);
                break;
            }
            case R.id.send_money_btn: {
                mNavController.navigate(R.id.action_mainFragment_to_chooseRecipientFragment);
                break;
            }
            case R.id.view_balance_btn: {
                mNavController.navigate(R.id.action_mainFragment_to_viewBalanceFragment);
                break;
            }
        }
    }
}

