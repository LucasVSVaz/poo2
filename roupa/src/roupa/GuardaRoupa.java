package roupa;

import java.util.ArrayList;

public class GuardaRoupa {

    private ArrayList<Roupa> guardaRoupa = new ArrayList<>();
    private ArrayList<Roupa> emUso = new ArrayList<>();
    private ArrayList<Roupa> naLavanderia = new ArrayList<>();
    private ArrayList<Cor> cores = new ArrayList<>();

    public void porEmUso(Roupa roupa) {
        if (emUso.contains(roupa)) {
            return;
        }
        if (guardaRoupa.contains(roupa)) {
            guardaRoupa.remove(roupa);
            emUso.add(roupa);
        } else {
            naLavanderia.remove(roupa);
            emUso.add(roupa);

        }
    }

    public void porNaLavanderia(Roupa roupa) {
        if (naLavanderia.contains(roupa)) {
            return;
        }
        if (guardaRoupa.contains(roupa)) {
            guardaRoupa.remove(roupa);
            naLavanderia.add(roupa);
        } else {
            emUso.remove(roupa);
            naLavanderia.add(roupa);
        }
    }

    public void adionarRoupa(Roupa roupa) {
        guardaRoupa.add(roupa);
    }

    public void porNoGuardaRoupa(Roupa roupa) {
        if (guardaRoupa.contains(roupa)) {
            return;
        }
        if (emUso.contains(roupa)) {
            emUso.remove(roupa);
            guardaRoupa.add(roupa);
        } else {
            naLavanderia.remove(roupa);
            guardaRoupa.add(roupa);
        }
        adionaCor(roupa.getCor());
    }

    public String getCorPredominante() {
        Integer maiorQuantidade = 0;
        Integer cont = 0;
        Integer pos = 0;
        for (Cor c : cores) {
            if (maiorQuantidade < c.getQuantidade()) {
                maiorQuantidade = c.getQuantidade();
                pos = cont;
            }
            cont++;
        }

        return cores.get(pos).getCor();
    }

    public void adionaCor(Cor novaCor) {
        if (!cores.isEmpty()) {
            for (Cor c : cores) {
                if (c.getCor().equals(novaCor.getCor())) {
                    Integer i = c.getQuantidade() != null ? c.getQuantidade() : 0;
                    i++;
                    c.setQuantidade(i);
                    return;
                }
            }
        }
        novaCor.setQuantidade(1);
        cores.add(novaCor);
    }

    public void mostrarGuardaRoupa() {
        Integer pos = 0;
        for (Roupa roupa : guardaRoupa) {
            System.out.println(pos + roupa.toString());
            pos++;
        }
    }

    public Roupa getRoupa(Integer posicao) {
        return guardaRoupa.get(posicao);
    }

    public String getStatus() {
        return "Em Uso= " + emUso.size()
                + "Na Lavanderia= " + naLavanderia.size()
                + "Cor Predominante= " + getCorPredominante();
    }
}
