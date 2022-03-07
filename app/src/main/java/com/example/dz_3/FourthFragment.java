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
import com.example.dz_3.databinding.FragmentSecondBinding;


public class FourthFragment extends Fragment {

	FragmentFourBinding binding;
	private String string;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		string=getArguments().getString("Key4");
		binding = FragmentFourBinding.inflate(inflater, container, false);
		return binding.getRoot();

	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		binding.tvSet.setText(string);

		binding.btNext4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Bundle bundle = new Bundle();
				Fragment fragment = new FifthFragment();
				bundle.putString("Key5", binding.etFirst.getText().toString());
				fragment.setArguments(bundle);
				requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.m_container, fragment).commit();
			}
		});
	}
}