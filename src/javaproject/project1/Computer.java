package javaproject.project1;

public class Computer {
    private SSD ssd;
    private Ram ram;

    public Computer(SSD ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
    public void display() {
        System.out.println("SSD: " + ssd.getSize() + "GB");
        System.out.println("RAM: " + ram.getSize() + "GB");
    }
    public int getSSD() {
        return ssd.getSize();
    }
    public void setSsd(int size) {
        ssd.setSize(size);
    }
    public int getRam() {
        return ram.getSize();
    }
    public void setRam(int size) {
        ram.setSize(size);
    }


}
