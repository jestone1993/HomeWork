package HomeWork.lesson6;

class Hdd {

    String name;
    int volume;
    String type;
    public Hdd(){
    }


    public Hdd(String name, int volume, String hardDisk) {
        this.name = name;
        this.volume = volume;
        this.type = hardDisk;

    }
    void displayInfo(){
        System.out.println(new Hdd(name,volume,type));
    }
}