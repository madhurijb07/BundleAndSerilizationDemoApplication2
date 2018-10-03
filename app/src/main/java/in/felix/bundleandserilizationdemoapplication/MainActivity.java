package in.felix.bundleandserilizationdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void redirectToNext(View view) {

        Visitor visitor = new Visitor();
        visitor.setName("Sachin");
        visitor.setEmail("sachin@gmail.com");


        Intent intent=new Intent(MainActivity.this,SecondActivity.class);

        intent.putExtra("visitor",visitor);
        startActivity(intent);



//        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//        Bundle bundle=new Bundle();
//
//        bundle.putString("name","Sachin");
//        bundle.putString("email","Sachin@gmail.com");
//
//        intent.putExtras(bundle);
//        startActivity(intent);
//
    }
}
