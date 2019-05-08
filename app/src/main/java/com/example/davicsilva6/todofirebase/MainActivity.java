package com.example.davicsilva6.todofirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menuAdicionar){
            Intent intent = new Intent(this, AdicionarActivity.class);
            startActivity(intent);

            //Opções a serem feitas ao clicar no botão adicionar
        }
        else if (id == R.id.menuFavoritar){
            //Opções a serem feitas ao clicar no botão favoritar

        }

        return super.onOptionsItemSelected(item);
    }
}
