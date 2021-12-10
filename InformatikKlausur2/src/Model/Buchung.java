package Model;
import Model.Raum;

public class Buchung {


    Raum[] _raum;
    Raum _raeume;
    
    String _zeitraum;
    int _gruppengroesse;
    String _gruppenleiterVorname;
    String _gruppenleiterNachname;
    int _alterJuengsterTeilnehmer;



    public Buchung(/*Raum raeume, */String zeitraum, int gruppengroesse, String gruppenleiterVorname, String gruppenleiterNachname, int alterJuengsterTeilnehmer){
        //setRaum(raeume);
        setZeitraum(zeitraum);
        setGruppengroesse(gruppengroesse);
        setGruppenleiterVorname(gruppenleiterVorname);
        setGruppenleiterNachname(gruppenleiterNachname);
        setAlterJungsterTeilnehmer(alterJuengsterTeilnehmer);

    }



    public String checkBuchung(){
        if (_raeume.getMindestalter() >= getAlterJuengsterTeilnehmer()){
            return "Die Buchung kann erfolgen";
        }
        else {
            return "Das Mindestalter muss erreicht werden";
        }
    }


    private void setAlterJungsterTeilnehmer(int alterJuengsterTeilnehmer) {
        this._alterJuengsterTeilnehmer = _alterJuengsterTeilnehmer;
    }


    public void setGruppengroesse(int _gruppengroesse) {
        this._gruppengroesse = _gruppengroesse;
    }

    public void setGruppenleiterNachname(String _gruppenleiterNachname) {
        this._gruppenleiterNachname = _gruppenleiterNachname;
    }
    public void setGruppenleiterVorname(String _gruppenleiterVorname) {
        this._gruppenleiterVorname = _gruppenleiterVorname;
    }

    public void setRaum(Raum _raum) {
         this._raeume = _raeume;
    }

    public void setZeitraum(String _zeitraum) {
        this._zeitraum = _zeitraum;
    }
    public int getGruppengroesse() {
        return _gruppengroesse;
    }
    public String getGruppenleiterNachname() {
        return _gruppenleiterNachname;
    }
    public String getGruppenleiterVorname() {
        return _gruppenleiterVorname;
    }

    public Raum getRaum() {
        return _raeume;
    }
    public String getZeitraum() {
        return _zeitraum;
    }

    public int getAlterJuengsterTeilnehmer() {
        return _alterJuengsterTeilnehmer;
    }



}
