
package pe.egcc.util;

import java.util.List;
import javax.swing.JComboBox;
import pe.egcc.dto.ComboDto;


public final class egccUtil

{
    private egccUtil()
    {
        
    }
    
    public static void LlenaCombo(JComboBox combo, List<ComboDto> valores)   //PARA LLENAR COMBOS
    {
        combo.removeAllItems();
        ComboDto actual = null;
        for(ComboDto valor : valores )
        {
            combo.addItem(valor);
            if(valor.isActual())
            {
                actual = valor;
            }
            
        }
        
        if(actual == null )
        {
            combo.setSelectedIndex(-1);
            
        }
        else
        {
            combo.setSelectedItem(actual);
        }
    }
    
    
}
