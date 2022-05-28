public class Employee{
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax = 0.0;
        if(this.salary < 1000.00){
            return tax = 0.0;
        } else if (this.salary >= 1000) {
            return tax = this.salary * 0.03;
        }
        return tax;
    }

    public int bonus(){
        if (workHours > 40){
            return (workHours -40 ) * 30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        if (2021 - this.hireYear < 10){
            return this.salary * 0.05;
        } else if (2021 - this.hireYear >9 && 2021 - this.hireYear <20) {
            return this.salary * 0.10;
        } else if (2021 - this.hireYear > 19) {
            return this.salary * 0.15;
        }else {
            System.out.println("Çalışana ait veriler düzgün girilmemiştir.");
        }
        return 0;
    }

    public double newSalary(){
        return this.salary + raiseSalary() + bonus() + tax();
    }

    public void printSalary() {
        System.out.println("------------");
        System.out.println("Adı Soyadı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+newSalary());
    }

}