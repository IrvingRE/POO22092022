package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;


public class ModeloPersonaCombo implements ComboBoxModel<Persona> {
    private ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datps, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        //regresara numero de elementos a mostrar 
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
    public void consultarBaseDatos(){
        PersonaDAO pdao = new PersonaDAO();
        
        try {
            //simular una consulta de base de datos
            datos = pdao.obtenerTodo();
            // se conecta a base de datos
            // se consulta
//        datos.add(new Persona("Jose", 19));
//        datos.add(new Persona("Maria", 21));
//        datos.add(new Persona("Jesus", 33));
//        datos.add(new Persona("Diana", 22));
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
    }
    
    public void agregarPersona (Persona p){
        //Insert BD
        PersonaDAO pdao = new PersonaDAO();
        datos.add(p);
        
        try {
            pdao.insertar(p);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
    }
    
}
