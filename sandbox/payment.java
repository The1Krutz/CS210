// argument(hour,  rate) : pay = hour * rate;
// argument(hour, rate, bonus) : pay = hour * rate + bonus;
// argument(hour, rate, gender): pay = hour * rate * 1.1 (for female),  pay = hour * rate (for male)

class DisplayOverloadingPay {
    public void pay(int t, double r) {
        System.out.println(" pay = " + r * t);
    }

    public void pay(int t, double r, double b) {
        System.out.println(" pay = " + (r * t + b));
    }

    public void pay(int t, double r, String g) {
        if (g.equals("f")) {
            System.out.printf(" pay = %.1f", r * t * 1.1);
        } else {
            System.out.printf(" pay = %.1f", r * t);
        }
    }
}

class payment {
    public static void main(String args[]) {
        DisplayOverloadingPay person = new DisplayOverloadingPay();
        person.pay(30, 10.0); // (hour, rate)
        person.pay(30, 10.0, 25.0); // (hour, rate, bonus)
        person.pay(20, 10.0, "f"); // (hour, rate, gender)
    }
}

// output:
//
// pay = 300.0
// pay with bonus = 325.0
// pay for female = 220.0
