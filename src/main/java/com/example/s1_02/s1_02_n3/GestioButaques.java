package com.example.s1_02.s1_02_n3;

import java.util.ArrayList;
import java.util.List;

public class GestioButaques {
    private List<Butaca> butaques;

    // Constructor
    public GestioButaques() {
        butaques = new ArrayList<>();
    }

    // Método para obtener las butacas
    public List<Butaca> getButaques() {
        return butaques;
    }

    // Método para añadir una butaca
    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
        if (cercarButaca(butaca.getNumeroFila(), butaca.getNumeroSeient()) != -1) {
            throw new ExcepcioButacaOcupada("La butaca ya està ocupada.");
        }
        butaques.add(butaca);
    }

    // Método para eliminar una butaca
    public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure {
        int index = cercarButaca(fila, seient);
        if (index == -1) {
            throw new ExcepcioButacaLliure("La butaca no està reservada.");
        }
        butaques.remove(index);
    }

    // Método para buscar una butaca
    public int cercarButaca(int fila, int seient) {
        for (int i = 0; i < butaques.size(); i++) {
            Butaca b = butaques.get(i);
            if (b.getNumeroFila() == fila && b.getNumeroSeient() == seient) {
                return i;
            }
        }
        return -1; // No encontrada
    }
}
