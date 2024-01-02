
package tipedata;

class Employee {

    private String nama;

    public Employee(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getNama()+" bekerja sebagai Manager");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getNama()+ " Mengembangkan sebuah aplikasi");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getNama() + " Membuat desain web");
    }
}

public class MainEmployee {

    public static void main(String[] args) {
        Manager manager = new Manager("Asmalik Hudri");
        Developer developer = new Developer("Asmalik Hudri");
        Designer designer = new Designer("Asmalik Hudri");

        // Memanggil metode work() pada setiap objek
        manager.work();
        developer.work();
        designer.work();
    }

}