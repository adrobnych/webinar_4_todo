package com.example.todo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

import com.example.todo.model.ToDoManager;

public class MainActivity extends Activity {
	ToDoManager todoManager = null;
	ListView todoList = null;
	ToDoAdapter a; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		todoManager = ((ToDoApp)getApplication()).getTodoManager();
		a = new ToDoAdapter(getApplicationContext(), todoManager.getTodos());
		
		todoList = (ListView) findViewById(R.id.listView1);
		
		todoList.setAdapter(a);
		
		todoList.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> l, View v,
					int position, long id) {
				todoManager.removeAtPosition(position);
				a.notifyDataSetChanged();
				return true;
			}
		});
		
		todoList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> l, View v, int position,
					long id) {
				Intent i = new Intent(MainActivity.this, ToDoDetailsActivity.class);
				i.putExtra("todoPosition", position);
				startActivity(i);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case R.id.action_settings:
			Intent i = new Intent(Intent.ACTION_DIAL, null);
			startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}

}
