package com.example.myrestaurantmenu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button fastFoodButton = findViewById(R.id.Main1);


        fastFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog_item, null);


                createDialogItem(dialogView, R.id.kebabtallrik_photo1, R.id.kebabtallrik_text1, "KebabTallrik : Välj mellan : pommes frites, ris eller bulgur", R.drawable.kabab);
                createDialogItem(dialogView, R.id.lammspett_photo1, R.id.lammspett_text1, "Lamm Spett : 2st lamm spett", R.drawable.lammspett);
                createDialogItem(dialogView, R.id.shishkebab_photo1, R.id.shishkebab_text1, "Shish Kebab Spett : 3st shish kebabspett", R.drawable.shishkebab);


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(dialogView)
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


        Button appetizersButton = findViewById(R.id.Appz);


        appetizersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog_item2, null);


                createDialogItem(dialogView, R.id.Apptizer_photo2, R.id.Apptizer_text2, "Fattoush : Bland sallad, friterad bröd, ost", R.drawable.fattoush);
                createDialogItem(dialogView, R.id.kebabsallad_photo2, R.id.kebabsallad_text2, "Kebab Sallad : Isbergs sallad, gurka, tomat, fefferone, kebab ", R.drawable.kebabsallad);
                createDialogItem(dialogView, R.id.kebabsallad_photo2, R.id.kebabsallad_text2, "Kyckling Sallad : Isbergs sallad, gurka, tomat, fefferone, kycling", R.drawable.kebabsallad);

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(dialogView)
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


        Button dessertsButton = findViewById(R.id.Dess);


        dessertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog_item3, null);


                createDialogItem(dialogView, R.id.cupcake_photo1, R.id.cupcake_text1, "Cupcake : Perfect Vanilla Cupcake ", R.drawable.cupcakes);
                createDialogItem(dialogView, R.id.strawberry_photo1, R.id.strawberry_text1, "Strawberry Jam Cake", R.drawable.strawberryjamcake);
                createDialogItem(dialogView, R.id.crepecake_photo1, R.id.crepecake_text1, "Crepe Cake", R.drawable.crepecake);


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(dialogView)
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

    private void createDialogItem(View dialogView, int imageId, int textId, String text, int imageResource) {
        ImageView imageView = dialogView.findViewById(imageId);
        TextView textView = dialogView.findViewById(textId);

        imageView.setImageResource(imageResource);
        textView.setText(text);
    }
}
