package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsBallistica;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary.IPartsBallisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsBallisticaService implements IPartsBallisticaService {
    @Autowired
    private IPartsBallisticaRepository repository;

    @Override
    public List<PartsBallistica> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsBallistica> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsBallistica findByNameByUser(String name, String appUser) {
        Optional<PartsBallistica> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsBallistica parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsBallistica> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(ballistica -> this.repository.delete(ballistica));
    }
}
