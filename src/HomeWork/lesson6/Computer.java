package HomeWork.lesson6;

public class Computer {

    public static void main(String[] args) {
        Pc Pc = new Pc(500, "Extreme");
        Pc Pc2 = new Pc(new Ram("Crucial", 16), new Hdd("Toshiba", 16, "External"), 500, "Extreme");
        System.out.println();
        Pc.show4();
        Pc2.show();

    }
}

class Pc {
    Ram memory1 = new Ram();
    Hdd hardDisk1 = new Hdd();


    int price;
    String model;

    public Pc(int price, String model) {
        this.model = model;
        this.price = price;
        this.memory1 = new Ram();
        this.hardDisk1 = new Hdd();
    }

    void show4() {
        System.out.print(price + "$ " + model + " " + memory1.name + " " + memory1.volume + "gb " + hardDisk1.volume + "tb " + hardDisk1.name + " " + hardDisk1.type);
    }

    public Pc(Ram memory1, Hdd hardDisk1, int price, String model) {
        this.memory1 = memory1;
        this.hardDisk1 = hardDisk1;
        this.price = price;
        this.model = model;


    }

    void show() {
        System.out.println();
        System.out.print(price + "$ " + model + " " + memory1.name + " " + memory1.volume + "gb " + hardDisk1.volume + "tb " + hardDisk1.name + " " + hardDisk1.type);
    }

}




