package transport;

import java.util.Objects;

public class Sponsor {
    private final String sponsorName;
    private final int donation;

    public Sponsor(String sponsorName, int donation) {
        this.sponsorName = sponsorName;
        this.donation = donation;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getDonation() {
        return donation;
    }

    public void danationRace() {
        System.out.printf("Спонсор %s пронспонсировал заезд на %s",sponsorName, donation);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorName='" + sponsorName + '\'' +
                ", donation=" + donation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return donation == sponsor.donation && Objects.equals(sponsorName, sponsor.sponsorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorName, donation);
    }
}
