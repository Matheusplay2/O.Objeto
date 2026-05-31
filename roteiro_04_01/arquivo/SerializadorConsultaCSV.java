package com.mycompany.roteiro_04_01.arquivo;

import com.mycompany.roteiro_04_01.classes.Consulta;
import com.mycompany.roteiro_04_01.classes.Medico;
import com.mycompany.roteiro_04_01.classes.Paciente;
import java.util.ArrayList;
import java.util.List;

public class SerializadorConsultaCSV {
    
public String toCSV(List<Consulta> consultas) {
        String csv = "Data;Horas;MedicoNome;MedicoCRM;MedicoEspecialidade;MedicoHorarios;"
                   + "PacienteNome;PacienteCPF;PacienteNascimento;PacienteHistorico;\n";

        for (Consulta consulta : consultas) {
            Medico m = consulta.getMedico();
            Paciente p = consulta.getPaciente();
            csv += consulta.getData() + ";"
                 + consulta.getHoras() + ";"
                 + m.getNome() + ";"
                 + m.getCrm() + ";"
                 + m.getEspecialidade() + ";"
                 + m.getHorariosDisponiveis() + ";"
                 + p.getNome() + ";"
                 + p.getCpf() + ";"
                 + p.getDataNascimento() + ";"
                 + p.getHistorico() + ";\n";
        }
        return csv;
    }



    public List<Consulta> fromCSV(String data) {
    List<Consulta> consultas = new ArrayList<>();

    String[] linhas = data.split("\n");

    for (int i = 1; i < linhas.length; i++) {
        String[] partes = linhas[i].split(";");

        if (partes.length >= 10) {
            
            Medico medico = new Medico();
            medico.setNome(partes[2]);
            medico.setCrm(partes[3]);
            medico.setEspecialidade(partes[4]);
            medico.setHorariosDisponiveis(partes[5]);

            Paciente paciente = new Paciente();
            paciente.setNome(partes[6]);
            paciente.setCpf(partes[7]);
            paciente.setDataNascimento(partes[8]);
            paciente.setHistorico(partes[9]);

            Consulta consulta = new Consulta();
            consulta.setData(partes[0]);
            consulta.setHoras(partes[1]);
            consulta.setMedico(medico);
            consulta.setPaciente(paciente);

            consultas.add(consulta);
           }
       }
    return consultas;
   }
}

