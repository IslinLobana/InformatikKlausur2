package Controller;

import Model.*;

public class MainController{


    public MainController(){

        Raum r1 = new Raum("Breaking Bad", 4, 1, "Schlüssel steckt im Zündschloss", 90, 12);

        Raum r2 = new Raum("Walking dead", 6, 3, "Schlüsselkarte in der Brust der Leiche Nr.2", 120, 14);

        Raum r3 = new Raum("Squid game", 4, 2, "Schlüssel ist in der schwarzen Maske", 90, 18);

        Raum r4 = new Raum("American Horror Story", 6, 2, "Im linken Schuh der Leiche auf dem Sofa", 140, 18);


        Buchung b1 = new Buchung("12.01.21 12 Uhr", 3, "Nils", "Ahsendorf", 13);

        Buchung b2 = new Buchung("13.01.21 12 Uhr", 2, "Holger", "Trampe", 11);

        Buchung b3 = new Buchung("14.01.21 12 Uhr", 5, "Nils", "Ahsendorf", 15);

        Buchung b4 = new Buchung("15.01.21 12 Uhr", 6, "Nils", "Ahsendorf", 13);

        Buchung b5 = new Buchung("16.01.21 12 Uhr", 3, "Holger", "Trampe", 18);

        Buchung b6 = new Buchung("17.01.21 12 Uhr", 4, "Holger", "Trampe", 17);

        Buchung b7 = new Buchung("18.01.21 12 Uhr", 6, "Nils", "Ahsendorf", 18);

        Buchung b8 = new Buchung("19.01.21 12 Uhr", 6, "Nils", "Ahsendorf", 19);

        System.out.println(r1 + " " + b1);
        System.out.println(r1 + " " + b2);
        System.out.println(r2 + " " + b3);
        System.out.println(r2 + " " + b4);
        System.out.println(r3 + " " + b5);
        System.out.println(r3 + " " + b6);
        System.out.println(r4 + " " + b7);
        System.out.println(r4 + " " + b8);




        /*
        Generell kann man sagen, dass das ganze Projekt die MVC Struktur hat. MVC steht dabei für Model View Control. So gibt es den Abschnitt Model, welcher sich um die Klassen bzw das Coden des Eigenschaften kümmert. Der Controller verarbeitet diese dann so, dass er daraus Demodaten erstellt oder eben generell die Daten zugänglich für die View macht. Die View kümmert sich dann um das Aussehen des Outputs also der Website oder in unserem Fall des Outputs in der Konsole. Da wir gerade keine Richtige View erstellen sollen habe ich mit dem Aufruf eines neuen MainControllers in der App.java die Ausgaben auf den Controller verlegt um das ganze für jetzt ein wenig zu vereinfachen. In der Methode der Buchung wird mit der Methode checkBuchung durch die ArrayList des Raums und dessen Mindestalters gechekt, ob das dieses eben bei der Buchung erreicht wird. Das Zeichen >= steht dabei für Größergleich.
        */
    }
}