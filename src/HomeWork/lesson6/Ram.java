package HomeWork.lesson6;


class Ram {
    String Name;
    int Volume;

    public Ram() {
    }

    public Ram(String name, int volume) {
        this.Name = name;
        this.Volume = volume;
    }
    void displayInfo(){
        System.out.println(Name+Volume);
    }
}