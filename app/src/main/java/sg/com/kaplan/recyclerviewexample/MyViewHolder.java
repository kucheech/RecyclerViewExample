package sg.com.kaplan.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    public MyViewHolder(View v) {
        super(v);
        tv1 = v.findViewById(R.id.textView1);
        tv2 = v.findViewById(R.id.textView2);
        tv3 = v.findViewById(R.id.textView3);
    }

    // one-way data-binding
    public void bind(MyData mData) {
        tv1.setText(mData.getText1());
        tv2.setText(mData.getText2());
        tv3.setText(mData.getText3());
    }
}
