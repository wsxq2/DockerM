package top.wsxq2.dockerm.model.portainer;

public class TLSConfiguration {
    private final boolean TLS;
    private final boolean TLSSkipVerify;
    private final String TLSCACertPath;
    private final String TLSCertPath;
    private final String TLSKeyPath;

    public TLSConfiguration(boolean TLS, boolean TLSSkipVerify, String TLSCACertPath, String TLSCertPath,
                            String TLSKeyPath) {
        this.TLS = TLS;
        this.TLSSkipVerify = TLSSkipVerify;
        this.TLSCACertPath = TLSCACertPath;
        this.TLSCertPath = TLSCertPath;
        this.TLSKeyPath = TLSKeyPath;
    }
}
