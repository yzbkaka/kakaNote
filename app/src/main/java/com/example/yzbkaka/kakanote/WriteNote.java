package com.example.yzbkaka.kakanote;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.yzbkaka.kakanote.db.Note;


public class WriteNote extends AppCompatActivity {
    EditText input;
    FloatingActionButton save;
    String content;
    Note note = new Note();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_note);
        input = (EditText) findViewById(R.id.input);
        save = (FloatingActionButton)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content = input.getText().toString();
                note.setWriteContent(content);
                note.save();
                Toast.makeText(WriteNote.this, "保存成功", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }


}
