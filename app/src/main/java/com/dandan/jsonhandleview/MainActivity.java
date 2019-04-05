package com.dandan.jsonhandleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dandan.jsonhandleview.library.JsonViewLayout;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private JsonViewLayout jsonViewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jsonViewLayout = findViewById(R.id.json);
        new Thread(new Runnable() {
            @Override
            public void run() {
                InputStream is = null;
                try {
                    is = getAssets().open("json.json");
                    int lenght = is.available();
                    byte[] buffer = new byte[lenght];
                    is.read(buffer);
                    final String result = new String(buffer, "utf8");
                    is.close();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            jsonViewLayout.bindJson(result);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_expend:
                jsonViewLayout.expandAll();
                break;
            case R.id.action_collapse:
                jsonViewLayout.collapseAll();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
