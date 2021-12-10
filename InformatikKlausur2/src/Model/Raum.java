package Model;

public class Raum {
    

    String _name;
    int _maxPersonen;
    int _schwierigkeitsgrad;
    String _loesung;
    int _dauerMinuten;
    int _mindestalter;



    public Raum(String name, int maxPersonen, int schwierigkeitsgrad, String loesung, int dauerMinuten, int mindestalter){
        setName(name);
        setMaxPersonen(maxPersonen);
        setSchwierigkeitsgrad(schwierigkeitsgrad);
        setLoesung(loesung);
        setDauerMinuten(dauerMinuten);
        setMindestalter(mindestalter);
    }




    public void setDauerMinuten(int _dauerMinuten) {
        this._dauerMinuten = _dauerMinuten;
    }

    public void setLoesung(String _loesung) {
        this._loesung = _loesung;
    }
    public void setMaxPersonen(int _maxPersonen) {
        this._maxPersonen = _maxPersonen;
    }
    public void setMindestalter(int _mindestalter) {
        this._mindestalter = _mindestalter;
    }
    public void setName(String _name) {
        this._name = _name;
    }
    public void setSchwierigkeitsgrad(int _schwierigkeitsgrad) {
        this._schwierigkeitsgrad = _schwierigkeitsgrad;
    }
    public int getDauerMinuten() {
        return _dauerMinuten;
    }
    public String getLoesung() {
        return _loesung;
    }
    public int getMaxPersonen() {
        return _maxPersonen;
    }
    public int getMindestalter() {
        return _mindestalter;
    }
    public String getName() {
        return _name;
    }
    public int getSchwierigkeitsgrad() {
        return _schwierigkeitsgrad;
    }

}
