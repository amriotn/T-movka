public class BankAccount {
    public String cisloUctu;
    public float stavUctu;
    private String pin;
    
    public BankAccount(String cisloUctu, String pin) {
        this.cisloUctu = cisloUctu;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "BankAccount [cisloUctu=" + cisloUctu + ", stavUctu=" + stavUctu + ", pin=" + pin + "]";
    }

    public float deposit(float penize, String zadanyPin) {
        if (verifyPin(zadanyPin) == true) {
            this.stavUctu += penize;
        }
        return penize;
        
    }

    public float withdraw(float penize, String zadanyPin) {
        if (verifyPin(zadanyPin) == true) {
            this.stavUctu -= penize;
        }
        return penize;
    }

    public boolean verifyPin(String zadanyPin) {
        if (zadanyPin.equals(this.pin)) {
            return true;
        }
        return false;
    }

}