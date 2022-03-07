package com.example.dz_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz_3.databinding.FragmentSecondBinding;
import com.example.dz_3.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {

	FragmentThirdBinding binding;
	private String string;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		string = getArguments().getString("Key2");

		binding = FragmentThirdBinding.inflate(inflater, container, false);
		return binding.getRoot();

	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		binding.tvSet3.setText(string);
		binding.btNext3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Bundle bundle = new Bundle();
				Fragment fragment = new FourthFragment();
				bundle.putString("Key3",string);
				fragment.setArguments(bundle);
				requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.m_container, fragment).commit();
			}
		});
	}
}