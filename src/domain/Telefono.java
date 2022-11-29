package domain;

import java.util.Objects;

public class Telefono {

    private String tipoTelefono;
    private String indicativoPais;
    private String numero;

    public Telefono(String tipoTelefono, String indicativoPais, String numero) {
        this.tipoTelefono = tipoTelefono;
        this.indicativoPais = indicativoPais;
        this.numero = numero;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public String getIndicativoPais() {
        return indicativoPais;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefono)) return false;
        Telefono telefono = (Telefono) o;
        return Objects.equals(getTipoTelefono(), telefono.getTipoTelefono()) && Objects.equals(getIndicativoPais(), telefono.getIndicativoPais()) && Objects.equals(getNumero(), telefono.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoTelefono(), getIndicativoPais(), getNumero());
    }
}
