class CreditCard {
    String accnumber;
    double curmoney;


    CreditCard(String accnumber, double curmoney) {
        this.accnumber = accnumber;
        this.curmoney = curmoney;
    }

    void deposit(double amount) {
        if (amount > 0) {
            curmoney += amount;
            System.out.println("Счёт " + accnumber + " пополнен на " + amount);
        } else {
            System.out.println("Недостаточно средств");
        }

    }

        void withdraw(double amount){
            if (curmoney > amount) {
                curmoney -= amount;
                System.out.println("Со счёта " + accnumber + " снято " + amount);
            } else {
                System.out.println("Недостаточно средств на карте");
            }
        }
        void info (){
            System.out.println("Баланс " + accnumber + " cоставляет: " + curmoney);
        }



}






