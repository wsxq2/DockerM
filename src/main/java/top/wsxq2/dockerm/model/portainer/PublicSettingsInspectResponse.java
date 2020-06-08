package top.wsxq2.dockerm.model.portainer;

public class PublicSettingsInspectResponse {
    private final String logoURL;
    private final boolean DisplayExternalContributors;
    private final int authenticationMeethod;
    private final boolean allowBindMountsForRegularUsers;
    private final boolean allowPrivilegedModeForRegularUsers;

    public PublicSettingsInspectResponse(String logoURL, boolean displayExternalContributors,
                                         int authenticationMeethod, boolean allowBindMountsForRegularUsers,
                                         boolean allowPrivilegedModeForRegularUsers) {
        this.logoURL = logoURL;
        DisplayExternalContributors = displayExternalContributors;
        this.authenticationMeethod = authenticationMeethod;
        this.allowBindMountsForRegularUsers = allowBindMountsForRegularUsers;
        this.allowPrivilegedModeForRegularUsers = allowPrivilegedModeForRegularUsers;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public boolean isDisplayExternalContributors() {
        return DisplayExternalContributors;
    }

    public int getAuthenticationMeethod() {
        return authenticationMeethod;
    }

    public boolean isAllowBindMountsForRegularUsers() {
        return allowBindMountsForRegularUsers;
    }

    public boolean isAllowPrivilegedModeForRegularUsers() {
        return allowPrivilegedModeForRegularUsers;
    }

    @Override
    public String toString() {
        return "PublicSettingsInspectResponse{" +
                "logoURL='" + logoURL + '\'' +
                ", DisplayExternalContributors=" + DisplayExternalContributors +
                ", authenticationMeethod=" + authenticationMeethod +
                ", allowBindMountsForRegularUsers=" + allowBindMountsForRegularUsers +
                ", allowPrivilegedModeForRegularUsers=" + allowPrivilegedModeForRegularUsers +
                '}';
    }
}
