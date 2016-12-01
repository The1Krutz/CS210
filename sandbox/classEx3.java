public class classEx3 {

    public static Payment p1 = new Payment();
    public static Payment p2 = new Payment();

    public static void main(String[] args) {

        p1.name = "Jane";
        p1.hour = 19.0;
        p1.rate = 5.0;

        p2.name = "William";
        p2.hour = 11.0;
        p2.rate = 8.0;

        System.out.println(p1.name + " : " + p1.pay());
        System.out.println(p2.name + " : " + p2.pay());

        if (p1.pay() > p2.pay()) {
            System.out.printf("%s earns %.1f more than %s", p1.name, p1.pay() - p2.pay(), p2.name);
        } else if (p2.pay() > p1.pay()) {
            System.out.printf("%s earns %.1f more than %s", p2.name, p2.pay() - p1.pay(), p1.name);
        } else {
            System.out.printf("%s earns about the same as %s", p1.name, p2.name);
        }
    }
}

class Payment {
    String name;
    double hour;
    double rate;

    public double pay() {
        double result = hour * rate;
        return result;
    }
}



//Jane : 95.0
//William : 88.0
//Jane earns 7.0 more than William
