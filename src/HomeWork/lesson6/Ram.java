package HomeWork.lesson6;


class Ram {
    String name;
    int volume;

    public Ram() {
    }

    public Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    void displayInfo(){
        System.out.println(name+volume);
    }
}