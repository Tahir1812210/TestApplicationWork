package com.example.testapplicationwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    Context context;

    List<TestModel> test_model;

    public TestAdapter(Context context, List<TestModel> test_model) {
        this.context = context;
        this.test_model = test_model;
    }

    public TestAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestAdapter.ViewHolder holder, int position) {
        if(test_model != null && test_model.size()>0)
        {
            TestModel testModel = test_model.get(position);
            holder.Name.setText(testModel.getName());
            holder.Age.setText(testModel.getAge());
            holder.Email.setText(testModel.getEmail());
        }
    }

    @Override
    public int getItemCount() {
        return test_model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name, Age, Email;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.Name);
            Age = itemView.findViewById(R.id.Age);
            Email = itemView.findViewById(R.id.Email);
        }
    }
}

