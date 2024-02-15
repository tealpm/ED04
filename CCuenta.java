package cuentas;

/**
 * Contiene información y operaciones de una cuenta bancaria
 * @author Paula MR solo encapsuló las propiedaes y añadió javadoc
 */
public class CCuenta {

    /**
     * Nombre y apellido/s del titular
     */
    private String nombre;
    
    /**
     * Número de cuenta
     */
    private String cuenta;
    
    /**
     * Cantidad en la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés que se aplica a la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con 4 parámetros
     * @param nom Nombre del titular
     * @param cue Número de la cuenta
     * @param sal Total en cuenta
     * @param tipo Tipo de interés que se aplica
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Muestra el titular de la cuenta
     * @return El nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nombre de titular
     * @param nombre Nombre y apellido/s del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Da la referencia alfanumérica a la cuenta
     * @return El número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna un número de cuenta
     * @param cuenta Referencia alfanumérica de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve la cifra que hay en la cuenta
     * @return La cantidad en cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualiza la cantidad en la cuenta
     * @param saldo Importe en cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Da el interés que se aplica a la cuenta
     * @return El tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asigna un tipo de interés
     * @param tipoInterés Interés que se aplica a la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene la cantidad guardada en la cuenta
     * @return El total en cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Suma una cantidad al saldo en cuenta
     * @param cantidad Cifra que se desea sumar a la cuenta
     * @throws Exception Si la cifra no es positiva
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Resta una cantidad al saldo en cuenta 
     * @param cantidad Cifra que se quiere quitar de la cuenta
     * @throws Exception Si la cifra no es positiva o es mayor al total disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
