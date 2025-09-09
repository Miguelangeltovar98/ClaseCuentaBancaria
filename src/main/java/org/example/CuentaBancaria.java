class CuentaBancaria {

    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
            } else {
                System.out.println("Fondos insuficientes. No se puede retirar " + monto);
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
