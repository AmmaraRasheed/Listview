package com.example.rabia.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    String[] myarray={"Android","Iphone","Blackberry","Window7"};

    String[] title={"title 1","Title 2","Title 3","Title 4","Title 5"};
    String[] description={"Description 1","Descriptn 2","des 3","Des 4","Des 5"};
    Integer[] image={R.drawable.event1,R.drawable.event2,R.drawable.event3,R.drawable.images,R.drawable.img};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyAdapter adapter=new MyAdapter(this,title,description,image);
        ListView list=findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    Toast.makeText(getApplicationContext(),"position 1",Toast.LENGTH_LONG).show();
                }
                if(position==2){
                    Intent intent=new Intent(getApplicationContext(),NewActivity.class);
                    startActivity(intent);
                }
            }
        });

//        ArrayAdapter myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myarray);
//        ListView myList=(ListView)findViewById(R.id.listview);
//        myList.setAdapter(myAdapter);
    }
}
