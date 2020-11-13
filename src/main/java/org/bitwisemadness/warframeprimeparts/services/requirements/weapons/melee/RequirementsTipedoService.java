package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsTipedo;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.melee.IRequirementsTipedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsTipedoService implements IRequirementsTipedoService {
    @Autowired
    private IRequirementsTipedoRepository repository;


    @Override
    public List<RequirementsTipedo> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsTipedo findByName(String name) {
        Optional<RequirementsTipedo> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsTipedo requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsTipedo> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsTipedo> optional = this.repository.findByName(name);
        optional.ifPresent(tipedo -> this.repository.delete(tipedo));
    }
}
