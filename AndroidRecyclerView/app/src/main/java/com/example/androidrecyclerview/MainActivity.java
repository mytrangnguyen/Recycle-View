package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber = findViewById(R.id.recycler_number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));
//        NumberAdapter adapter = new NumberAdapter();


        final List<String> data1 = new ArrayList<>();
         for(int i =0;i<10;i++){
             data1.add("Trang");
             data1.add("Huy");
             data1.add("Hân");
         }

         final NumberAdapter adapter = new NumberAdapter();
         adapter.data= data1;
         rvNumber.setAdapter(adapter);

         findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 data1.add("cc");
                 adapter.notifyDataSetChanged();
             }
         });


    }
}
