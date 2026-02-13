package Modelo;

public class Operador {

    private String usuario;
    private String clave;

    public Operador() {
        usuario = "";
        clave = "";
    }

    public Operador(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean autenticar(String u, String c) {

        if (usuario.equals(u) && clave.equals(c)) {
            return true;
        }

        return false;
    }
}

