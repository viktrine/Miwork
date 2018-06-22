/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //This part uses the ArrayAdapter technique
        //===========================================

        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        LinearLayout rootView = (LinearLayout) findViewById(R.id.root);

        for(int counter = 0; counter < 10; counter++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(counter));
            rootView.addView(wordView);
        }

        /*

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        */

        //===========================================
        // End of ArrayAdapter technique

        //int counter = 0;

       /*
        while (counter < words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(counter));
            rootView.addView(wordView);
            counter++;
        }
        */

        /*
        for(int counter = 0; counter < 10; counter++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(counter));
            rootView.addView(wordView);
        }
        */


    }
}
