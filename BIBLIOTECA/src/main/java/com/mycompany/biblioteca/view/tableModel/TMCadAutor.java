package com.mycompany.biblioteca.view.tableModel;

import com.mycompany.biblioteca.model.entidades.Autor;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TMCadAutor extends AbstractTableModel {
    private List autores;
    
    private final int COL_NOME= 0;
    private final int COL_CDD=1;
    
   public TMCadAutor(List lstAutores){
       this.autores=lstAutores;
       
   }

    @Override
    public int getRowCount() {
       return this.autores.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autor aux= new Autor();
        if(autores.isEmpty()){
            return aux;
        }else{
            
            aux =(Autor) autores.get(rowIndex);
            switch(columnIndex){
                
                case -1:
                    return aux;
                case COL_NOME:
                    return aux.getNome();
                case COL_CDD:
                    return aux.getCddNatal();
                default:
                    break;
            }
            
        }
       
        return aux;
     }
    
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case  COL_NOME:
                return "Nome";
            case COL_CDD:
                return "Cidade Natal";
                
            default :
                    break;
              
        }
        
        return "";
        
    }
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        
        return String.class;
    }
}
