package day4.topic1_encapsulation.examples;

public class Records { // normal encapsulation
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (validInfo(info)) {
            this.info = info;
        } else {
            System.out.println("Invalid Info");
        }
    }

    private boolean validInfo(String info) {
        if (info == null || info.isBlank()) {
            return false;
        }
        return true;
    }
}
