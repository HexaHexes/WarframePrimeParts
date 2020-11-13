package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsBallistica;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary.IRequirementsBallisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsBallisticaService implements IRequirementsBallisticaService {
    @Autowired
    private IRequirementsBallisticaRepository repository;


    @Override
    public List<RequirementsBallistica> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsBallistica findByName(String name) {
        Optional<RequirementsBallistica> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsBallistica requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsBallistica> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsBallistica> optional = this.repository.findByName(name);
        optional.ifPresent(ballistica -> this.repository.delete(ballistica));
    }
}
