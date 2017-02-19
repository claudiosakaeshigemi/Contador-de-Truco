package claudioshigemi.com.placardetruco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontosTimeA = 0;
    private int pontosTimeB = 0;
    private int mulasA = 0;
    private int mulasB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView placar = (TextView) findViewById(R.id.txt_placarA);
        placar.setText(String.valueOf(score));
    }

    public void soma1pontoA(View view) {
        pontosTimeA += 1;
        mulaA(pontosTimeA);
        displayForTeamA(pontosTimeA);
    }

    public void soma3pontoA(View view) {
        pontosTimeA += 3;
        mulaA(pontosTimeA);
        displayForTeamA(pontosTimeA);
    }

    public void soma6pontoA(View view) {
        pontosTimeA += 6;
        mulaA(pontosTimeA);
        displayForTeamA(pontosTimeA);
    }

    public void soma9pontoA(View view) {
        pontosTimeA += 9;
        mulaA(pontosTimeA);
        displayForTeamA(pontosTimeA);
    }

    public void soma12pontoA(View view) {
        pontosTimeA += 12;
        mulaA(pontosTimeA);
        displayForTeamA(pontosTimeA);
    }

    public void displayForTeamB(int score) {
        TextView placar = (TextView) findViewById(R.id.txt_placarB);
        placar.setText(String.valueOf(score));
    }

    public void soma1pontoB(View view) {
        pontosTimeB += 1;
        mulaB(pontosTimeB);
        displayForTeamB(pontosTimeB);

    }

    public void soma3pontoB(View view) {
        pontosTimeB += 3;
        mulaB(pontosTimeB);
        displayForTeamB(pontosTimeB);
    }

    public void soma6pontoB(View view) {
        pontosTimeB += 6;
        mulaB(pontosTimeB);
        displayForTeamB(pontosTimeB);
    }

    public void soma9pontoB(View view) {
        pontosTimeB += 9;
        mulaB(pontosTimeB);
        displayForTeamB(pontosTimeB);
    }

    public void soma12pontoB(View view) {
        pontosTimeB += 12;
        mulaB(pontosTimeB);
        displayForTeamB(pontosTimeB);
    }

    public void resetPlacar(View view) {
        pontosTimeA = 0;
        pontosTimeB = 0;
        mulasA = 0;
        mulasB = 0;
        displayForTeamA(pontosTimeA);
        displayMulaA(mulasA);
        displayMulaB(mulasB);
        displayForTeamB(pontosTimeB);
    }

    public void mulaA(int pontos) {

        if (pontosTimeA >= 12) {
            pontosTimeA = 0;
            mulasA += 1;
            displayMulaA(mulasA);
            displayForTeamA(pontosTimeA);
        }
    }

    public void displayMulaA(int score) {
        TextView mula = (TextView) findViewById(R.id.txt_mulaA);
        mula.setText(String.valueOf(score));
    }

    public void displayMulaB(int score) {
        TextView mula = (TextView) findViewById(R.id.txt_mulaB);
        mula.setText(String.valueOf(score));
    }

    public void mulaB(int pontos) {
        if (pontosTimeB >= 12) {
            pontosTimeB = 0;
            mulasB += 1;
            displayMulaB(mulasB);
            displayForTeamB(pontosTimeB);
        }
    }

}
