/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.teis.persistencia;

import ad.teis.model.Persona;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a21dominicohl
 */
public class DataIOPersistencia implements IPersistencia {

    @Override
    public void escribirPersona(Persona persona, String ruta) {

        if (persona != null) {
            try ( FileOutputStream fos = new FileOutputStream(ruta);  DataOutputStream dos = new DataOutputStream(fos);) {

                dos.writeLong(persona.getIdentificador());
                dos.writeChars(persona.getDni());
                dos.writeUTF(persona.getDni());
                dos.write(persona.getEdad());
                dos.writeFloat(persona.getSalario());

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DataIOPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DataIOPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Persona leerDatos(String ruta) {
        long id;
        String dni;
        try ( FileInputStream fis = new FileInputStream(ruta);  DataInputStream dis = new DataInputStream(fis);) {

                id = dis.readLong();
                dni = "";
                for (int i = 0; i < 9; i++) {
                    char contenedor = dis.readChar();
                    dni=dni+contenedor;
                }
                //dis.readUTF();
                //dis.read();
                float salario = dis.readFloat();
                int edad = dis.readInt();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DataIOPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DataIOPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Persona p = new Persona(id, dni, edad, salario);
        return p;
    }

}
