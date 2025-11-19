package com.juan.myappjuanipia.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

import java.util.Arrays;
import java.util.List;

public class Preguntas extends AppCompatActivity {

    // pregunta animales
    private RadioGroup radioGroupAnimals;
    private Button buttonCheckAnimals;
    private TextView textViewResultAnimals;

    // pregunta colores
    private LinearLayout llColors;
    private Button btnCheckColors;
    private TextView tvResultColors;

    // pregunta frutas
    private Spinner spinnerFruits;
    private Button btnCheckFruits;
    private TextView tvResultFruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        initComponents();

        // CheckAnimals
        buttonCheckAnimals.setOnClickListener(v -> checkAnimalAnswer());

        // CheckColors
        btnCheckColors.setOnClickListener(view -> checkColorAnswer());

        // CheckFruits
        btnCheckFruits.setOnClickListener(view -> checkFruitAnswer());
    }

    private void initComponents() {
        // Nivel 1
        radioGroupAnimals = findViewById(R.id.rg_animals);
        buttonCheckAnimals = findViewById(R.id.btn_check_animals);
        textViewResultAnimals = findViewById(R.id.tv_result_animals);

        // Nivel 2
        llColors = findViewById(R.id.ll_colors);
        btnCheckColors = findViewById(R.id.btn_check_colors);
        tvResultColors = findViewById(R.id.tv_result_colors);

        // Nivel 3
        spinnerFruits = findViewById(R.id.spinner_fruits);
        btnCheckFruits = findViewById(R.id.btn_check_fruits);
        tvResultFruits = findViewById(R.id.tv_result_fruits);
    }


    // Nivel 1: Animales (Radio Buttons)
    private void checkAnimalAnswer() {
        int selectedId = radioGroupAnimals.getCheckedRadioButtonId();

        if (selectedId == -1) {
            textViewResultAnimals.setText("Selecciona una opción.");
            return;
        }

        // La respuesta correcta es 'R.id.rb_kangaroo'
        boolean isCorrect = selectedId == R.id.rb_kangaroo;

        if (isCorrect) {
            textViewResultAnimals.setText("¡CORRECTO! Kangaroo es la traducción de Canguro.");
        } else {
            textViewResultAnimals.setText("INCORRECTO. La respuesta correcta es Kangaroo.");
        }
    }

    private void checkColorAnswer() {
        // 1. Definir las respuestas correctas por su ID
        List<Integer> correctIds = Arrays.asList(R.id.cb_red, R.id.cb_yellow, R.id.cb_orange);

        boolean allCorrectlySelected = true;
        boolean isAnySelected = false;

        // 2. Iterar sobre todos los Checkboxes dentro del LinearLayout
        for (int i = 0; i < llColors.getChildCount(); i++) {
            View view = llColors.getChildAt(i);

            if (view instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) view;
                boolean isCorrectAnswer = correctIds.contains(checkBox.getId());

                if (checkBox.isChecked()) {
                    isAnySelected = true;
                    // Falla si selecciona una incorrecta (Blue, Green)
                    if (!isCorrectAnswer) {
                        allCorrectlySelected = false;
                        break;
                    }
                } else {
                    // Falla si NO selecciona una correcta (Red, Yellow, Orange)
                    if (isCorrectAnswer) {
                        allCorrectlySelected = false;
                        break;
                    }
                }
            }
        }

        if (!isAnySelected) {
            tvResultColors.setText("Selecciona al menos una opción.");
            return;
        }

        if (allCorrectlySelected) {
            tvResultColors.setText("¡CORRECTO! Red, Yellow y Orange.");
        } else {
            tvResultColors.setText("INCORRECTO. Debes seleccionar SOLO Red, Yellow y Orange.");
        }
    }

    // Nivel 3
    private void checkFruitAnswer() {
        // La posición 4 en el array de strings es "Watermelon"
        int selectedPosition = spinnerFruits.getSelectedItemPosition();

        if (selectedPosition == 0) { // La posición 0 es el hint: "Selecciona una fruta..."
            tvResultFruits.setText("Selecciona una fruta.");
            return;
        }

        boolean isCorrect = selectedPosition == 4;

        if (isCorrect) {
            tvResultFruits.setText("¡CORRECTO! Watermelon.");
        } else {
            tvResultFruits.setText("INCORRECTO. La respuesta correcta es Watermelon.");
        }
    }
}
