import java.util.Arrays;


import java.util.Scanner;

public class Bank {
    public BankAccount[] accounts = new BankAccount[5];
    private int pocetUctu = 0;

    public Bank() {
        this.accounts = accounts;
        this.pocetUctu = pocetUctu;
    }


    @Override
    public String toString() {
        return "Bank [accounts=" + Arrays.toString(accounts) + ", pocetUctu=" + pocetUctu + "]";
    }

    public BankAccount newAcc(String cisloUctu, String pin) {
        BankAccount novyAcc = new BankAccount(cisloUctu, pin);
        this.accounts[this.pocetUctu] = novyAcc;
        this.pocetUctu += 1;
        return novyAcc;
    }

    public boolean depositMoney(String zadaneCisloUctu, String zadanyPin, float sum) {
        for (int i = 0; i < this.pocetUctu; i++) {
            if (this.accounts[i].cisloUctu == zadaneCisloUctu) {
                this.accounts[i].deposit(sum, zadanyPin);
                return true;
            }
        }
        return false;
    }


    public boolean withdrawMoney(String zadaneCisloUctu, String zadanyPin, float sum) {
        for (int i = 0; i < this.pocetUctu; i++) {
            if (this.accounts[i].cisloUctu == zadaneCisloUctu) {
                this.accounts[i].withdraw(sum, zadanyPin);
                return true;
            }
        }
        return false;
        
    }

    /*
    Tady jsem se snažil vzít vstup od uživatele, ale nějak mi to prostě nefunguje

    Scanner in = new Scanner(System.in);

    public boolean transfer() {
        
        System.out.print("Číslo Vašeho účtu: ");
        String zadaneCisloUctu = System.console().readLine();

        System.out.print("Číslo účtu příjemce: ");
        String cisloDruhehoUctu = System.console().readLine();

        System.out.print("PIN: ");
        String zadanyPin = System.console().readLine();

        System.out.print("Částka: ");
        float sum = in.nextFloat();


        for (int i = 0; i < this.pocetUctu; i++) {
            if (this.accounts[i].cisloUctu == zadaneCisloUctu) {
                for (int l = 0; l < this.pocetUctu; l++) {
                    if (this.accounts[l].cisloUctu == cisloDruhehoUctu) {
                        this.accounts[i].withdraw(sum, zadanyPin);
                        this.accounts[l].stavUctu += sum;
                        return true;
                    }
                }
            }
        }
        return false;
    }*/

    public boolean transfer(String zadaneCisloUctu, String cisloDruhehoUctu, String zadanyPin, float sum) {
        
        for (int i = 0; i < this.pocetUctu; i++) {
            if (this.accounts[i].cisloUctu == zadaneCisloUctu) {
                for (int l = 0; l < this.pocetUctu; l++) {
                    if (this.accounts[l].cisloUctu == cisloDruhehoUctu) {
                        this.accounts[i].withdraw(sum, zadanyPin);
                        this.accounts[l].stavUctu += sum;
                        return true;
                    }
                }
            }
        }
        return false;
    }



}
