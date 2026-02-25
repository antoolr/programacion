import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tresraya extends JFrame implements ActionListener {
    private JButton[][] botones = new JButton[3][3];
    private boolean turnoX = true; // true = X, false = O

    public tresraya() {
        setTitle("3 en Raya");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        inicializarBotones();
        setVisible(true);
    }

    private void inicializarBotones() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].addActionListener(this);
                add(botones[i][j]);
            }
        }
    }

    private void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
            }
        }
        turnoX = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        // Si la casilla ya está ocupada, no hacer nada
        if (!btn.getText().isEmpty()) return;

        // Tu jugada (X)
        btn.setText("X");

        // Comprobar si ganas tú
        if (hayGanador()) {
            JOptionPane.showMessageDialog(null, "¡Ganas tú!");
            reiniciar();
            return;
        }

        // Si el tablero está lleno después de tu jugada
        if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate");
            reiniciar();
            return;
        }

        jugadaIA();

        // Comprobar si gana la máquina
        if (hayGanador()) {
            JOptionPane.showMessageDialog(null, "¡Gana la máquina!");
            reiniciar();
        } else if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate");
            reiniciar();
        }
    }

    private void jugadaIA() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().isEmpty()) {
                    botones[i][j].setText("O");
                    return;
                }
            }
        }
    }

    private boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hayGanador() {
        // Filas
        for (int i = 0; i < 3; i++) {
            if (!botones[i][0].getText().isEmpty() &&
                botones[i][0].getText().equals(botones[i][1].getText()) &&
                botones[i][0].getText().equals(botones[i][2].getText())) {
                return true;
            }
        }
        // Columnas
        for (int j = 0; j < 3; j++) {
            if (!botones[0][j].getText().isEmpty() &&
                botones[0][j].getText().equals(botones[1][j].getText()) &&
                botones[0][j].getText().equals(botones[2][j].getText())) {
                return true;
            }
        }
        // Diagonales
        if (!botones[0][0].getText().isEmpty() &&
            botones[0][0].getText().equals(botones[1][1].getText()) &&
            botones[0][0].getText().equals(botones[2][2].getText())) {
            return true;
        }
        if (!botones[0][2].getText().isEmpty() &&
            botones[0][2].getText().equals(botones[1][1].getText()) &&
            botones[0][2].getText().equals(botones[2][0].getText())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new tresraya();
    }
}
