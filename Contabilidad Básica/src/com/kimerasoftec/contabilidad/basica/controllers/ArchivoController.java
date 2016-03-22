package com.kimerasoftec.contabilidad.basica.controllers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ArchivoController {
    public static void guardarDatos(Object datos, String archivo)  throws IOException
    {
        try (FileOutputStream output = new FileOutputStream(archivo);ObjectOutputStream stream = new ObjectOutputStream(output)) {
            stream.writeObject(datos);
        }
    }
    public static Object obtenerDatos (String archivo) throws IOException, ClassNotFoundException
    {
        Object datos;
        try (FileInputStream input = new FileInputStream(archivo)) {
            try (ObjectInputStream stream = new ObjectInputStream(input)) {
                datos = stream.readObject();
            }
        }
        return datos;
    }
}
