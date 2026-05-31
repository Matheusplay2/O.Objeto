
package com.mycompany.roteiro_04_01.classes;

import java.util.Objects;


public class Consulta {
    private String data;
    private String horas;
    private Paciente paciente;
    private Medico medico;

    public Consulta() {
        this.data="";
        this.horas="";
        this.medico=new Medico();
        this.paciente=new Paciente();
    }
    
    public Consulta(String data, String horas,Medico medico,Paciente paciente){
        this.data=data;
        this.horas=horas;
        this.medico=medico;
        this.paciente=paciente;
 
    }
    @Override 
    public String toString(){
        return "Consulta{"+
                this.medico+""
                +this.paciente+""+
                "Data:"+this.data+
                "Horas:"+this.horas+"}";       
    }
    public void copiar(Consulta outro){
        this.data=outro.getData();
        this.horas=outro.getHoras();
        this.medico=outro.getMedico();
        this.paciente=outro.getPaciente();
        
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.data);
        hash = 89 * hash + Objects.hashCode(this.horas);
        hash = 89 * hash + Objects.hashCode(this.paciente);
        hash = 89 * hash + Objects.hashCode(this.medico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consulta other = (Consulta) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.horas, other.horas)) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        return Objects.equals(this.medico, other.medico);
    }
   
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoras() {
        return this.horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    

    
}
