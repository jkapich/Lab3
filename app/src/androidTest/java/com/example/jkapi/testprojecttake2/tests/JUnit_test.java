package com.example.jkapi.testprojecttake2.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;

import com.example.jkapi.testprojecttake2.MainActivity;
import com.example.jkapi.testprojecttake2.R;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by jkapi on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();
        int answer = mainActivity.sum(1,2);
        assertEquals(3, answer);
    }

    public void test_second() {
        mainActivity = getActivity();
        int answer = mainActivity.sum(0,2);
        assertEquals(2, answer);
    }

    public void test_third() {
        mainActivity = getActivity();
        int answer = mainActivity.sum(-1,2);
        assertEquals(1, answer);
    }
}