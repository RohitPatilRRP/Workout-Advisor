package com.example.app.wrkoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWrkoutActivity extends Activity {

    private  wrkout_expert expert=new wrkout_expert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_wrkout);

    }

    public  void onClickFindWrkout(View view){

        TextView wrkout=(TextView) findViewById(R.id.wrkout);

        Spinner wrkouttype=(Spinner) findViewById(R.id.wrkouttype);

        String wrkouts= String.valueOf(wrkouttype.getSelectedItem());

        List<String> wrkoutlist= expert.getWrkouts(wrkouts);
        StringBuilder wrkoutFormat= new StringBuilder();
        for(String work:wrkoutlist){
            wrkoutFormat.append(work).append('\n');
        }
        wrkout.setText(wrkoutFormat);
    }

}
