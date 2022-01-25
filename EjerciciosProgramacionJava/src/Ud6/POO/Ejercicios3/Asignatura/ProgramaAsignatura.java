package Ud6.POO.Ejercicios3.Asignatura;
/*

*/
public class ProgramaAsignatura {

    public static void main(String[] args) {
        
        //Creamos el vector
        Asignatura arrayObjetos[]= new Asignatura[5];
        
        
        // Llenamos el vector con el constructor
        arrayObjetos[0]= new Asignatura("Matematicas", 10, 1);
        arrayObjetos[1]= new Asignatura("Programación", 20, 1);
        arrayObjetos[2]= new Asignatura("Sistemas", 30, 1);
        arrayObjetos[3]= new Asignatura("Lengua", 40, 2);
        arrayObjetos[4]= new Asignatura("Sociales", 50, 2);

        
        // instanciamos el método imprimir en un for
        for (int i = 0; i < arrayObjetos.length; i++) {
            arrayObjetos[i].imprime();
        }
    }

}
