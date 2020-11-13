package org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsBow;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.primary.IPartsBowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsBowService implements IPartsBowService {
    @Autowired
    private IPartsBowRepository repository;

    @Override
    public List<PartsBow> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsBow> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsBow findByNameByUser(String name, String appUser) {
        Optional<PartsBow> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsBow parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsBow> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(bow -> this.repository.delete(bow));
    }
}
