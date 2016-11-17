package com.epicodus.pettracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MedicationActivity extends AppCompatActivity {
    @Bind(R.id.medicationList) ListView mMedicationList;
    private String[] medications = new String[] {"Nexxguard", "HeartGuard", "Test Medication1", "Test Medication2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medication);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, medications);
        mMedicationList.setAdapter(adapter);
    }
}
