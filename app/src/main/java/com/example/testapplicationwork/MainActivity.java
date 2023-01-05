package com.example.testapplicationwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TestAdapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        
        setRecyclerview();

    }

    private void setRecyclerview() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        testAdapter = new TestAdapter(this,getList());
        recyclerView.setAdapter(testAdapter);
    }

    private List<TestModel> getList()
    {
        List<TestModel> testModels = new ArrayList<>();
        testModels.add(new TestModel("Tahir","23","tahir@gmail.com"));
        testModels.add(new TestModel("Umair","30","umair@gmail.com"));
        testModels.add(new TestModel("Khalid","23","khalid@gmail.com"));
        return  testModels;
    }

}