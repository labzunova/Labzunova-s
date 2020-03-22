package com.example.homework;

public interface interface1 {
    void onItemClick(int digit);
}
/*
package com.example.homework;

        import android.app.Activity;
        import android.content.Context;
        import android.content.res.Configuration;
        import android.graphics.Color;
        import android.os.Bundle;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.core.content.ContextCompat;
        import androidx.fragment.app.Fragment;
        import androidx.recyclerview.widget.GridLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import java.util.ArrayList;


public class fragmentOne extends Fragment {

    private ArrayList<Integer> data;
    private Activity activity;
    private int textColorRed = ContextCompat.getColor(getContext(),R.color.myRed);
    private int textColorBlue = ContextCompat.getColor(getContext(),R.color.myBlue);

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) { // state saving
        super.onSaveInstanceState(outState);
        outState.putIntegerArrayList("data",data);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView recyclerView = view.findViewById(R.id.list);

        data = new ArrayList<>(); // empty array creating

        // filling
        if (savedInstanceState != null) data = savedInstanceState.getIntegerArrayList("data");
        else for (int i = 1; i <= 100; i++) data.add(i);

        int colCount; // how many grids
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            colCount = 3;
        else colCount = 4;

        if (recyclerView != null) { // adapter creating
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), colCount, RecyclerView.VERTICAL, false));
            MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(data);
            recyclerView.setAdapter(adapter);
        }

        Button btn = view.findViewById(R.id.Add);
        btn.setOnClickListener(new View.OnClickListener() {// new element after click
            @Override
            public void onClick(View v) {
                data.add(data.size() + 1);
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
    }


    // ADAPTER CREATING
    class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

        private ArrayList<Integer> data;

        MyRecyclerViewAdapter(ArrayList<Integer> data) { // constructor
            this.data = data;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // viewHolder creating
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.number.setText(String.valueOf(position + 1));

            if (position % 2 == 0) holder.number.setTextColor(textColorRed);
            else holder.number.setTextColor(textColorBlue);

            holder.number.setOnClickListener(new View.OnClickListener() { // click on element
                @Override
                public void onClick(View v) {
                    TextView digit = v.findViewById(v.getId());
                    int number = Integer.parseInt((String) digit.getText());
                    ((interface1) activity).onItemClick(number);
                }
            });
        }

        @Override
        public int getItemCount() {
            return data.size();
        }


        class ViewHolder extends RecyclerView.ViewHolder {
            TextView number;

            ViewHolder(View itemView) {
                super(itemView);
                number = itemView.findViewById(R.id.info_text);

            }
        }


    }
}

*/