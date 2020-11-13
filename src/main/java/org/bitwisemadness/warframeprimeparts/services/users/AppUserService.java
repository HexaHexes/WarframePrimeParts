package org.bitwisemadness.warframeprimeparts.services.users;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.repositories.IAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    private IAppUserRepository repository;

    @Override
    public List<AppUser> findAll() {
        return this.repository.findAll();
    }

    @Override
    public AppUser findByName(String name) {
        Optional<AppUser> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(AppUser appUser) {
        this.repository.save(appUser);
    }

    @Override
    public void delete(String name) {
        Optional<AppUser> optional = this.repository.findByName(name);
        optional.ifPresent(appUser -> this.repository.delete(appUser));
    }
}
