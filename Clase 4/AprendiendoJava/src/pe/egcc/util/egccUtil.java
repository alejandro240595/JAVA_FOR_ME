
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
        for(ComboDto valor : valores )
        {
            combo.addItem(valor);
        }
    }
    
    
}
