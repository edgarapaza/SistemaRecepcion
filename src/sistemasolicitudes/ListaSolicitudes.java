package sistemasolicitudes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ListaSolicitudes {
    conexion con = new conexion();
    
    public Object[][] getListaSolicitudes(String codigo, String year){
        int registros = 0;
        try{
            con.conectar();
            ResultSet res = con.consulta("SELECT COUNT(*) AS total FROM usuarios;");
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta"+ e);
        }
        
        Object[][] data = new String[registros][1];
        try{
            con.conectar();
            ResultSet res = con.consulta("SELECT * FROM solicitudes"+year+" WHERE codUsu ="+codigo+";");
            int i=0;
            while(res.next()){
                String cod = res.getString("codSol");
                data[i][0] = cod;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
}
