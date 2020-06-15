package com.example.kok_47_tictactoe_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.BTN_B1);
        b2 = findViewById(R.id.BTN_B2);
        b3 = findViewById(R.id.BTN_B3);
        b4 = findViewById(R.id.BTN_B4);
        b5 = findViewById(R.id.BTN_B5);
        b6 = findViewById(R.id.BTN_B6);
        b7 = findViewById(R.id.BTN_B7);
        b8 = findViewById(R.id.BTN_B8);
        b9 = findViewById(R.id.BTN_B9);

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                EndGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                EndGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                EndGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                EndGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                EndGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                EndGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                EndGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                EndGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                EndGame();
            }
        });

    }

    private void EndGame() {

        String a , b , c , d , e , f , g , h , i;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals(b) && a.equals(c) && a.equals("X")){
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (a.equals(b) && a.equals(c) && a.equals("O")){
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals(e) && a.equals(i) && a.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (a.equals(e) && a.equals(i) && a.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals(d) && a.equals(g) && a.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (a.equals(d) && a.equals(g) && a.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (b.equals(e) && b.equals(h) && b.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (b.equals(e) && b.equals(h) && b.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (c.equals(f) && c.equals(i) && c.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (c.equals(f) && c.equals(i) && c.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (c.equals(e) && c.equals(g) && c.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (c.equals(e) && c.equals(g) && c.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (d.equals(e) && d.equals(f) && d.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (d.equals(e) && d.equals(f) && d.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals(h) && g.equals(i) && g.equals("X")) {
            Toast.makeText(this, "Winning Player X", Toast.LENGTH_LONG).show();
            end = true;
        } else if (g.equals(h) && g.equals(i) && g.equals("O")) {
            Toast.makeText(this, "Winning Player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

    }

}
