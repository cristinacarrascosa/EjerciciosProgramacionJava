package ud6.Entregable.AgendaContactos;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contacto> contactos;
    private int cuantos;

    //Constructor
    public Agenda() {
        contactos = new ArrayList();
        contactos.ensureCapacity(100);
        cuantos = 0;
    }

    // Getters
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public int getCuantos() {
        return cuantos;
    }
    // Setters ninguno xq puede dar problemas

    

    // Agrega un objeto tipo contacto a la agenda(lo añade al vector y cuantos++)
    // comprueba si el contacto ya existe antes de agregarlo
    public void agregarContacto(String nombre, String tlf, String email) {
        boolean var = true;
        for (int i = 0; i < contactos.size(); i++) {
            if (nombre.equalsIgnoreCase(contactos.get(i).getNombre())) {
                var = false;
            }
        }
        if (var) {
            Contacto nuevo = new Contacto(nombre, tlf, email);
            contactos.add(nuevo);
            cuantos++;
        } else {
            System.err.println("ERROR: Este contacto ya existe");
        }
    }

    //Ver contactos
    public void verContacto() {
        if (contactos.isEmpty()) {
            System.out.println("LA AGENDA ESTÁ VACÍA");
        } else {
            for (int i = 0; i < contactos.size(); i++) {
                System.out.println(i + ". " + contactos.get(i).getAll());

            }
        }
    }

    // Eliminar contacto
    public void eliminarContacto(int posicion) {
        boolean encontrado = false;
        if (posicion <= cuantos){
            contactos.remove(posicion);
            cuantos--;
            encontrado = true;
        }
        if (!encontrado) {
            System.err.println("ERROR: posición incorrecta");
        }

    }

    // Buscar por nombre
    public void buscarNombre(String nombre) {
        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contactos.get(i).imprimir();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.err.println("No se han encontrado contactos");
        }

    }

    // Buscar por telefono
    public void buscarTlf(String tlf) {
        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getTlf().equalsIgnoreCase(tlf)) {
                contactos.get(i).imprimir();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.err.println("No se han encontrado contactos");
        }
    }

    // Buscar por email
    public void buscarEmail(String email) {
        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getEmail().equalsIgnoreCase(email)) {
                contactos.get(i).imprimir();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.err.println("No se han encontrado contactos");
        }

    }

    //Búsqueda global
    public void bucaGlobal(String t) {
        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getEmail().equalsIgnoreCase(t) || contactos.get(i).getNombre().equalsIgnoreCase(t) || contactos.get(i).getTlf().equalsIgnoreCase(t)) {
                contactos.get(i).imprimir();
                encontrado = true;

            }
        }
        if (!encontrado) {
            System.err.println("No se han encontrado contactos");
        }

    }

}
