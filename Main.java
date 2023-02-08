public class Main {

    public static void main(String[] args) {

        Bank banka1 = new Bank();
        System.out.println(banka1);
        banka1.newAcc("0000006578", "1234");
        banka1.newAcc("1234567890", "1111");
        banka1.newAcc("5156448759", "2355");
        banka1.newAcc("2153463213", "1235");
        banka1.newAcc("8498485452", "2222");
        System.out.println(banka1);

        System.out.println(banka1.depositMoney("0000006578", "1234", 500));
        System.out.println(banka1.accounts[0]);

        System.out.println(banka1.transfer("0000006578", "1234567890", "1234", 500));
        System.out.println(banka1.accounts[0]);
        System.out.println(banka1.accounts[1]);

        /*System.out.println(banka1.withdrawMoney("1234567890", "1111", 500));
        System.out.println(banka1.accounts[1]);*/
    }
}