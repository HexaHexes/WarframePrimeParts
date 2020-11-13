package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsThrowing;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary.IRequirementsThrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsThrowingService implements IRequirementsThrowingService {
    @Autowired
    private IRequirementsThrowingRepository repository;


    @Override
    public List<RequirementsThrowing> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsThrowing findByName(String name) {
        Optional<RequirementsThrowing> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsThrowing requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsThrowing> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsThrowing> optional = this.repository.findByName(name);
        optional.ifPresent(throwing -> this.repository.delete(throwing));
    }
}
