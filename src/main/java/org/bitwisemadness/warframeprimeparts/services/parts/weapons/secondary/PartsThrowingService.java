package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsThrowing;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary.IPartsThrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsThrowingService implements IPartsThrowingService {
    @Autowired
    private IPartsThrowingRepository repository;

    @Override
    public List<PartsThrowing> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsThrowing> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsThrowing findByNameByUser(String name, String appUser) {
        Optional<PartsThrowing> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsThrowing parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsThrowing> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(throwing -> this.repository.delete(throwing));
    }
}
