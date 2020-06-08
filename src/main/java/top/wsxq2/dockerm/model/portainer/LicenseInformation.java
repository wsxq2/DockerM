package top.wsxq2.dockerm.model.portainer;

public class LicenseInformation {
    private final String licenseKey;
    private final String company;
    private final String expiration;
    private final boolean valid;

    public LicenseInformation(String licenseKey, String company, String expiration, boolean valid) {
        this.licenseKey = licenseKey;
        this.company = company;
        this.expiration = expiration;
        this.valid = valid;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public String getCompany() {
        return company;
    }

    public String getExpiration() {
        return expiration;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return "LicenseInformation{" +
                "licenseKey='" + licenseKey + '\'' +
                ", company='" + company + '\'' +
                ", expiration='" + expiration + '\'' +
                ", valid=" + valid +
                '}';
    }
}
