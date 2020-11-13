package org.bitwisemadness.warframeprimeparts.rest.parts;

public class AppUserPart {
    private String appUser;
    private String name;

    public AppUserPart() {
    }

    public AppUserPart(String appUser, String name) {
        this.appUser = appUser;
        this.name = name;
    }

    public String getAppUser() {
        return appUser;
    }

    public void setAppUser(String appUser) {
        this.appUser = appUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
