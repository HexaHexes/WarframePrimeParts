package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondary;
import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondaryNoSingle;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary.IPartsDualSecondaryNoSingleRepository;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary.IPartsDualSecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsDualSecondaryNoSingleService implements IPartsDualSecondaryNoSingleService {
    @Autowired
    private IPartsDualSecondaryNoSingleRepository repository;

    @Override
    public List<PartsDualSecondaryNoSingle> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsDualSecondaryNoSingle> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsDualSecondaryNoSingle findByNameByUser(String name, String appUser) {
        Optional<PartsDualSecondaryNoSingle> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsDualSecondaryNoSingle parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsDualSecondaryNoSingle> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(dualSecondaryNoSingle -> this.repository.delete(dualSecondaryNoSingle));
    }
}
