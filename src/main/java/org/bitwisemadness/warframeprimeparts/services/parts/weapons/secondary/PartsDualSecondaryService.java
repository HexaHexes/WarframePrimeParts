package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondary;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary.IPartsDualSecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsDualSecondaryService implements IPartsDualSecondaryService {
    @Autowired
    private IPartsDualSecondaryRepository repository;

    @Override
    public List<PartsDualSecondary> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsDualSecondary> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsDualSecondary findByNameByUser(String name, String appUser) {
        Optional<PartsDualSecondary> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsDualSecondary parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsDualSecondary> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(dualSecondary -> this.repository.delete(dualSecondary));
    }
}
