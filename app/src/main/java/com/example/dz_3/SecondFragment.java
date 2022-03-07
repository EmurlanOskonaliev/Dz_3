package com.example.dz_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz_3.databinding.FragmentFirstBinding;
import com.example.dz_3.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

	FragmentSecondBinding binding;
	private String string;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		string = getArguments().getString("Key");
		binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container, false);
		return binding.getRoot();

	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		binding.tvSet2.setText(string);
		binding.btNext2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Bundle bundle = new Bundle();
				ThirdFragment fragment = new ThirdFragment();
				bundle.putString("Key2",string);
				fragment.setArguments(bundle);
				requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.m_container, fragment)
					.commit();

			}
		});
	}
}
