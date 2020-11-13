package org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsCrossbow;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.primary.IPartsCrossbowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsCrossbowService implements IPartsCrossbowService {
    @Autowired
    private IPartsCrossbowRepository repository;

    @Override
    public List<PartsCrossbow> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsCrossbow> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsCrossbow findByNameByUser(String name, String appUser) {
        Optional<PartsCrossbow> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsCrossbow parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsCrossbow> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(crossbow -> this.repository.delete(crossbow));
    }
}
