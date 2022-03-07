package com.example.dz_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dz_3.databinding.FragmentFifthBinding;
import com.example.dz_3.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    	binding = FragmentFirstBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();

    }

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		binding.btNext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Bundle bundle = new Bundle();
				SecondFragment fragment = new SecondFragment();
				bundle.putString("Key", binding.etFirst.getText().toString());
				fragment.setArguments(bundle);
				requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.m_container, fragment).commit();

			}
		});

	}
}