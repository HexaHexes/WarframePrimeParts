package org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsPrimary;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.primary.IPartsPrimaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsPrimaryService implements IPartsPrimaryService {
    @Autowired
    private IPartsPrimaryRepository repository;

    @Override
    public List<PartsPrimary> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsPrimary> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsPrimary findByNameByUser(String name, String appUser) {
        Optional<PartsPrimary> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsPrimary parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsPrimary> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(primary -> this.repository.delete(primary));
    }
}
