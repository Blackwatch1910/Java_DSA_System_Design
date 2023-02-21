import java.util.Scanner;

class Farmer {
    int principal;
    float time;
    static float rate;
    float si;

    static {
        rate = 8.5f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your principal amount");
        principal = sc.nextInt();
        System.out.println("Enter your time duration");
        time = sc.nextFloat();
        // sc.close();
    }

    void calculate () {
        si = (principal * rate * time)/100f;
    }

    void display() {
        System.out.println("this is your simple interest:" + si);
        System.out.println("this is the amount to be paid back:" + (si + principal));
    }
}

public class FarmerApp {
    public static void main(String args[]) {
        Farmer rakesh = new Farmer();
        rakesh.input();
        rakesh.calculate();
        rakesh.display();

        Farmer devanshu = new Farmer();
        devanshu.input();
        devanshu.calculate();
        devanshu.display();
    }
}