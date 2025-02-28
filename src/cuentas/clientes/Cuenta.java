/**
 * clase donde estan los constructores y sus metodos
 */
package cuentas.clientes;


/**
 * 
 * @author Jose Alberto Torresano
 * @version 1.0
 * @since 28-Feb-2025
 */
public class Cuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * constructor por defecto de la clase Cuenta sin parametros
     */
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=0;
        tipoInteres=0;
    }

    /**
     * constructor de la clase cuenta con parametros
     * @param nom indica nombre cliente tipo String
     * @param cue indica el numero de cuenta tipo String
     * @param sal indica el saldo de la cuenta
     * @param tipo indica el tipo de interes de la cuenta
     */
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /**
     * devuelve el saldo de la cuenta
     * @return devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * ingresar ingresa dinero en la cuenta
     * @param cantidad cantidad a ingresar en la cuenta
     * @throws Exception si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retira dinero de la cuenta
     * @param cantidad la cantidad a retirar 
     * @throws Exception si se intenta retirar una cantidad negativa
     *  Exception si el saldo que se quiere retirar es más alto que el saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * devuelve el nombre del usuario
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    

    /**
     * setea el nombre del usuario
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve el numero de la cuenta
     * @return 
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * setea el numero de la cuenta
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * devuelve el saldo en la cuenta
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * fija el saldo en la cuenta
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * devuelve el tipo de interes de la cuenta
     * @return 
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * fija el tipo de interes en la cuenta
     * @param tipoInteres 
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
