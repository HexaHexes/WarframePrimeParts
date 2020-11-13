package org.bitwisemadness.warframeprimeparts.services.users;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;

import java.util.List;

public interface IAppUserService {
    List<AppUser> findAll();

    AppUser findByName(String name);

    void put (AppUser parts);

    void delete(String name);
}
