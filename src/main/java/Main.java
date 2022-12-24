import enumeradores.AlmacenAlimentos;
import modelos.DukeMascota;
import modelos.Mascota;
import persistencia.mysql.MascotaPersistenceUseMySQL;
import persistencia.mysql.MySQLConnection;
import persistencia.persistenceCollections.MascotaPersistenceUseList;
import utils.RegistroCivilMascotas;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina", "Georgina");
        DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Georgina");
        DukeMascota duke3 = new DukeMascota("Duke-Porteño", "Georgina");
        DukeMascota duke4 = new DukeMascota("Duke-Litoral", "Georgina");
        persistence.guardar(duke);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);

        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        RegistroCivilMascotas.guardarActa(duke);


    MySQLConnection conexion = new MySQLConnection();
    Connection connection = conexion.establecerConexion();

    conexion.cerrarConexion (connection);



    }

}



