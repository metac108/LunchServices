public class Student {
    private String erollNo, name;
    private long contact;
    private int year, lunchStatus = 0;

    Student() {}
    Student(String erollNo, String name, long contact, int year) {
        this.erollNo = erollNo;
        this.contact = contact;
        this.name = name;
        this.year = year;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setErollNo(String erollNo) {
        this.erollNo = erollNo.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLunchStatus(int lunchStatus) {
        this.lunchStatus = lunchStatus;
        System.out.println("Check-in successful");
    }

    public long getContact() {
        return contact;
    }

    public int getYear() {
        return year;
    }

    public String getErollNo() {
        return erollNo;
    }

    public String getName() {
        return name;
    }

    public int getLunchStatus() {
        return lunchStatus;
    }
}