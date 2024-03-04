class Main {
    public String name = "Luluna";
    public int id = 6;
    public int age = 3;

    public void nameCat() {
        System.out.println("Nama: " +name);
    }

    public void idCat() {
        System.out.println("Id: " +id);
    }

    public void umurCat() {
        System.out.println("Umur: " +age);
    }

    public static void main(String[] args) {
        Main kucing = new Main();
        kucing.nameCat();
        kucing.idCat();
        kucing.umurCat();
    }
}