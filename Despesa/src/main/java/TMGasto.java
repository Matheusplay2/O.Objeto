
import com.mycompany.despesa.model.entidade.Gasto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TMGasto  extends AbstractTableModel {
    
    
    private List<Gasto> gastos;

    private final int COL_DATA = 0;
    private final int COL_DESCRICAO = 1;
    private final int COL_VALOR = 2;

    // MANUTENÇÃO: data é salva em ISO (yyyy-MM-dd) no banco,
    // aqui só formata pra exibição em dd/MM/yyyy.
    private final DateTimeFormatter FORMATO_EXIBICAO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public TMGasto(List lstGastos) {
        this.gastos = lstGastos;
    }

    @Override
    public int getRowCount() {
        return this.gastos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Gasto aux = new Gasto();
        if (gastos.isEmpty()) {
            return aux;
        } else {

            aux = (Gasto) gastos.get(rowIndex);
            switch (columnIndex) {

                case -1:
                    return aux;
                case COL_DATA:
                    LocalDate data = LocalDate.parse(aux.getData());
                    return data.format(FORMATO_EXIBICAO);
                case COL_DESCRICAO:
                    return aux.getDescricao();
                case COL_VALOR:
                    return aux.getValor();
                default:
                    break;
            }

        }

        return aux;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case COL_DATA:
                return "Data";
            case COL_DESCRICAO:
                return "Descrição";
            case COL_VALOR:
                return "Valor";

            default:
                break;

        }

        return "";

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Class getColumnClass(int columnIndex) {

        return String.class;
    }
    
}
