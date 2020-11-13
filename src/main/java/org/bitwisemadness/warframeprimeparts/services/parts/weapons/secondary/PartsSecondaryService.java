package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsSecondary;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary.IPartsSecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsSecondaryService implements IPartsSecondaryService {
    @Autowired
    private IPartsSecondaryRepository repository;

    @Override
    public List<PartsSecondary> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsSecondary> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsSecondary findByNameByUser(String name, String appUser) {
        Optional<PartsSecondary> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsSecondary parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsSecondary> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(secondary -> this.repository.delete(secondary));
    }
}
