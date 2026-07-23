
package com.mycompany.biblioteca.view.tableModel;

import com.mycompany.biblioteca.model.entidades.Livro;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TMCadLivro extends AbstractTableModel {

    private List livros;
    
    private final int COL_TITULO=0;
    private final int COL_ANO=1;
    private final int COL_AUTOR=2;
    
    public TMCadLivro (List lstLivros){
        this.livros=lstLivros;
        }

    @Override
    public int getRowCount() {
        return this.livros.size();
    }

    @Override
    public int getColumnCount() {
        return  3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro aux = new Livro();
        if (livros.isEmpty()){
            return aux;
        }else{
            aux=(Livro)livros.get(rowIndex);
            
            switch(columnIndex){
                case -1:
                    return aux;
                case COL_TITULO:
                   return aux.getTitulo();
                case COL_ANO:
                    return aux.getAno();
                case COL_AUTOR:
                    return aux.getAutor().getNome();
                
                default:
                    break;
            }
          }
        return aux;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public String getColumnName(int column){
        
        switch (column){
            
            case COL_TITULO:
                return "Titulo";
            case COL_ANO:
                return "Ano Publicacao";
            case COL_AUTOR:
                return "Autor";
                
            default:
                break;
            
        }
        return "";
        
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }
    
}
