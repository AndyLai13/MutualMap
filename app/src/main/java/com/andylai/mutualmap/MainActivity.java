package com.andylai.mutualmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	public static void main(String[] args) {
		MutualMap<String, Integer> map = new MutualMap<>();
		map.put("AAA", 0);
		map.put("BBB", 1);
		int sourceId = map.get("AAA");
		String source = map.getKeyByValue(1);
		System.out.println("id = " + sourceId);
		System.out.println("source = " + source);
	}
}