package com.mycompany.roteiro_04_01.classes;

import java.util.Objects;

public class Medico {

    private String nome;
    private String crm;
    private String especialidade;
    private String horariosDisponiveis;

    public Medico() {
        this.nome = "";
        this.crm = "";
        this.especialidade = "";
        this.horariosDisponiveis = "";
    }

    public Medico(String nome, String crm, String especialidade, String horariosDisponiveis) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.horariosDisponiveis = horariosDisponiveis;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.crm);
        hash = 97 * hash + Objects.hashCode(this.especialidade);
        hash = 97 * hash + Objects.hashCode(this.horariosDisponiveis);
        return hash;
    }

    @Override
    public String toString() {
        return "Medico{Nome:" + this.nome + ",Crm:" + this.crm
                + ",Especialidade:" + this.especialidade + "Horarios Disponiveis:"
                + this.horariosDisponiveis + "}";

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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.crm, other.crm)) {
            return false;
        }
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return Objects.equals(this.horariosDisponiveis, other.horariosDisponiveis);
    }

    public void copiar(Medico outro) {
        this.nome = outro.getNome();
        this.crm = outro.getCrm();
        this.especialidade = outro.getEspecialidade();
        this.horariosDisponiveis = outro.getHorariosDisponiveis();

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return this.crm;
    }
    public void setCrm(String crm){
        this.crm=crm;
        
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorariosDisponiveis() {
        return this.horariosDisponiveis;
    }

    public void setHorariosDisponiveis(String horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

}
