package carrera_solidaria;

public class AppCarrera {
    public static void main(String[] args) {
        //creo el organizador y lo imprimo
        Organizador iesmutxamel = new Organizador("I");
        System.out.println(iesmutxamel);

        //creo corredor y lo imprimo
        Corredor corredor1 = new Corredor("Luis",1.5);
        System.out.println(corredor1);
        //añado el corredor a la lista de corredores
        iesmutxamel.inscribir_corredor(corredor1);

        //añado patrocinadores a la lista de patrocinadores del corredor
        corredor1.insertarPatrocinador("Madre","Profe_mates","Profe_ingles");
        corredor1.insertarPatrocinador("Profe_cast");
        //imprimo a corredor1
        System.out.println(corredor1);

        //creo otro corredor lo imprimo y lo añado a la lista de corredores del organizador
        Corredor corredor2 = new Corredor("Carla",0.0);
        System.out.println(corredor2);
        iesmutxamel.inscribir_corredor(corredor2);

        //imprimo el organizador
        System.out.println(iesmutxamel);

        //a
        //muestro la lista de corredores que hay en ies mutxamel
        iesmutxamel.mostrarCorredores();

        //b
        //pongo las vueltas completadas del corredor 1 a 15 y el metodo calcularDonacion muestra el total de la donacion
        corredor1.setVueltas_completadas(15);
        iesmutxamel.calcularDonacion(corredor1);
    }
}
