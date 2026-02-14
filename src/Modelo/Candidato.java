package modelo;
public class Candidato {
    private String dni;
    private String partidoPolitico;
    private int votos;
    
    //Constructor
    //Default
    public Candidato() {
        dni = "";
        partidoPolitico = "";
    }
    //Con parámetros
    public Candidato(String dni, String partidoPolitico) {
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
    }
    
    //Getter and setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    //Método para visualizar
    public String verInfo(){
        return "Dni: " + dni + "/nPartido político: " + partidoPolitico;
    }
    
}
