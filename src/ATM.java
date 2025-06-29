// class ATM {
//     int count20;
//     int count50;
//     int count100;
//
//    ATM(int count20, int count50, int count100) {
//        this.count20 = count20;
//        this.count50 = count50;
//        this.count100 = count100;
//    }
//
//    void addMoney(int add20, int add50, int add100) {
//        this.count20 += add20;
//        this.count50 += add50;
//        this.count100 += add100;
//    }
//
//    boolean withdrawMoney(int amount) {
//        int banknotes100 = Math.min(amount / 100, this.count100); //min = 3
//        amount -= banknotes100 * 100; //3
//        int banknotes50 = Math.min(amount / 50, this.count50); //1
//        amount -= banknotes50 * 50; //1
//        int banknotes20 = Math.min(amount / 20, this.count20); //1
//        amount -= banknotes20 * 20; //1
//
//        if (amount == 0) {
//            this.count100 -= banknotes100;
//            this.count50 -= banknotes50;
//            this.count20 -= banknotes20;
//            System.out.println("Выдано: " + banknotes100 + " купюр по 100, " + banknotes50 + " купюр по 50, " + banknotes20 + " купюр по 20");
//            return true;
//        } else {
//            System.out.println("Невозможно выдать указанную сумму");
//            return false;
//        }
//    }
//}