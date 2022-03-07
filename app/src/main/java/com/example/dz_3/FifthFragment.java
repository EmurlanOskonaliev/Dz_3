package com.example.dz_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz_3.databinding.FragmentFifthBinding;
import com.example.dz_3.databinding.FragmentFourBinding;


public class FifthFragment extends Fragment {
private String string;
FragmentFifthBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
		string=getArguments().getString("Key5");
		binding= FragmentFifthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		binding.tvFifth.setText(string);
	}
}