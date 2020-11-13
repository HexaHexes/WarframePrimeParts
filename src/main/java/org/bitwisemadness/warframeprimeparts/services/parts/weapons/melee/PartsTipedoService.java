package org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsTipedo;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.melee.IPartsTipedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsTipedoService implements IPartsTipedoService {
    @Autowired
    private IPartsTipedoRepository repository;

    @Override
    public List<PartsTipedo> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsTipedo> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsTipedo findByNameByUser(String name, String appUser) {
        Optional<PartsTipedo> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsTipedo parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsTipedo> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(tipedo -> this.repository.delete(tipedo));
    }
}
