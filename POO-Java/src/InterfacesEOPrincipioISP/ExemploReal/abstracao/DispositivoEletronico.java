package InterfacesEOPrincipioISP.ExemploReal.abstracao;

import InterfacesEOPrincipioISP.ExemploReal.Enuns.TipoDispositivo;

public abstract class DispositivoEletronico {
    protected TipoDispositivo tipo;

    protected DispositivoEletronico(TipoDispositivo tipo) {
        this.tipo = tipo;
    }
}
