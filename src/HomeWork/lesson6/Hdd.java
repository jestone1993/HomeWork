package HomeWork.lesson6;

class Hdd {

    String Name;
    int Volume;
    String type;
    public Hdd(){
    }


    public Hdd(String name, int volume, String hardDisk) {
        this.Name = name;
        this.Volume = volume;
        this.type = hardDisk;

    }
    void displayInfo(){
        System.out.println(new Hdd(Name,Volume,type));
    }
}