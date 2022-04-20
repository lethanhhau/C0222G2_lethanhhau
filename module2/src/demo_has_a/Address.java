package demo_has_a;

public class Address {
    private String soNha;
    private String tenDuong;

    public Address() {
    }

    public Address(String soNha, String tenDuong) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    @Override
    public String toString() {
        return "Address{" +
                "soNha='" + soNha + '\'' +
                ", tenDuong='" + tenDuong + '\'' +
                '}';
    }
}
