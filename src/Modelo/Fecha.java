package modelo;
public class Fecha {
    //Atributos:
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;
    
    //Constructores
    //Default
    public Fecha() {
        minuto = 00;
        hora = 00;
        dia = 1;
        mes = 1;
        anio = 1900;
    }
    
    //Con parámetros
    public Fecha(int hora, int minuto, int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        if(hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 ){
           this.hora = hora;
           this.minuto = minuto; 
        }
        else{
            System.out.println("Error, tiempo invalido");
        }    
    }
    
    //Getter and setter
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
        
    @Override
    public String toString() {
        return "La fecha es: " + dia + "/" + mes + "/" + anio + " y "
                + "la hora es: " + hora + ":" + minuto;
    }  
}

