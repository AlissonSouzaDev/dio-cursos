package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        Impressora im = new EquipamentoMultifuncional();
        Impressora ip = new Deskjet();
        Impressora ir = new Laserjet();

        im.imprimir();
        ip.imprimir();
        ir.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora il = em;
        Copiadora cpa = em;
        Digitalizadora dg = em;


    }
}
