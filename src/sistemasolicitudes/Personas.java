<<<<<<< HEAD
package sistemasolicitudes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Personas {
    conexion con = new conexion();
    
    public Object[][] getDatosNombre(String nomb){
        
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE nombre LIKE '%"+ nomb +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
    
    public Object[][] getDatosPaterno(String patern){
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE apePat LIKE '%"+ patern +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
    
    public Object[][] getDatosMaterno(String matern){
        
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE apeMat LIKE '%"+ matern +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
    
    public Object[][] getDatosDni(String dni){
        
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE numDoc LIKE '%"+ dni +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
}
=======
package sistemasolicitudes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Personas {
    conexion con = new conexion();
    
    public Object[][] getDatosNombre(String nomb){
        
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE nombre LIKE '%"+ nomb +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
    
    public Object[][] getDatosPaterno(String patern){
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE apePat LIKE '%"+ patern +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
    
    public Object[][] getDatosMaterno(String matern){
        
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE apeMat LIKE '%"+ matern +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
    
    public Object[][] getDatosDni(String dni){
        
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
        
        Object[][] data = new String[registros][6];
        try{
            
            con.conectar();
            ResultSet res = con.consulta("SELECT codUsu, nombre, apePat, apeMat, tipDoc, numDoc FROM usuarios WHERE numDoc LIKE '%"+ dni +"%'");
            int i=0;
            while(res.next()){
                
                String codigo = res.getString("codUsu");
                String nombre = res.getString("nombre");
                String paterno = res.getString("apePat");
                String materno = res.getString("apeMat");
                String tipodoc = res.getString("tipDoc");
                String numdoc = res.getString("numDoc");
                data[i][0] = codigo;
                data[i][1] = nombre;
                data[i][2] = paterno;
                data[i][3] = materno;
                data[i][4] = tipodoc;
                data[i][5] = numdoc;
                i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en Consulta2"+ e);
        }
        return data;
    }
}
>>>>>>> f0e0b7b0f0e109e2d21832fb3481e5df133304f8
